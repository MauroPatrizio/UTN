import readline from "readline";
import fs from "fs";
import yargs from "yargs";
import { resolve } from "path";

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
	terminal: false,
});

const argv = yargs
	.command("nombrar", "Nombre del archivo", {
		archivo: {
			describe: "Nombre del archivo",
			demandOption: true,
			type: "string",
		},
	})
	.help().argv;

async function getData() {
	const questions = (question) => new Promise((resolve = rl.question(question, resolve)));

	try {
		const nombre = await questions("Nombre del producto: ");
		const precio = parseFloat(await questions("Precio del producto: "));
		const cantidad = parseInt(await questions("Cantidad del producto: "));

		if (isNaN(precio) || isNaN(cantidad)) {
			throw new Error("El precio y la cantidad deben ser números");
		}

		return { nombre, precio, cantidad };
	} finally {
		rl.close();
	}
}

async function saveData(product) {
	const fileName = argv.archivo;

	try {
		if (fs.existsSync(fileName)) {
			const data = await fs.promises.readFile(fileName, "utf-8");
			const products = JSON.parse(data);
			products.push(product);
			await fs.promises.writeFile(fileName, JSON.stringify(products, null, 2), "utf-8");
		} else {
			const products = [product];
			await fs.promises.writeFile(fileName, JSON.stringify(products, null, 2), "utf-8");
		}

		console.log(`Se guardó correctamente`);
		console.log(await fs.promises.readFile(fileName, "utf-8"));
	} catch (e) {
		console.log(e);
	}
}

try {
	const product = await getData();
	await saveData(product);
} catch (e) {
	console.log(e);
}
