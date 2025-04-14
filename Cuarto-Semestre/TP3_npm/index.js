const yargs = require("yargs");

const argv = yargs
	.command("saludar", "Muestra un saludo", {
		nombre: {
			describe: "Nombre de la persona a saludar",
			demandOption: true,
			type: "string",
		},
	})
	.command("despedir", "Muestra una despedida", {
		nombre: {
			describe: "Nombre de la persona a despedir",
			demandOption: true,
			type: "string",
		},
	})
	.command("sumar", "Suma dos números", {
		n1: {
			describe: "Primer número",
			demandOption: true,
			type: "number",
		},
		n2: {
			describe: "Segundo número",
			demandOption: true,
			type: "number",
		},
	})

	.help().argv;

if (argv._.includes("saludar")) {
	console.log(`Hola, ${argv.nombre}!`);
}

if (argv._.includes("despedir")) {
	console.log(`Adiós, ${argv.nombre}!`);
}

if (argv._.includes("sumar")) {
	console.log(`La suma es: ${argv.n1 + argv.n2}`);
}
