import readline from "readline";
import fs from "fs";

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
	terminal: false,
});

export const datos = rl.question("¿Cuál es tu nombre? ", (nombre) => {
	rl.question("Cuál es tu edad? ", (edad) => {
		rl.question("Cuál es tu email? ", (email) => {
			const data = `Nombre: ${nombre}\nEdad: ${edad}\nEmail: ${email}`;
			fs.writeFile("user_data.txt", data, (e) => {
				if (e) {
					console.log(`No se pudo guardar el archivo, ${e}`);
					rl.close();
					return;
				}

				console.log(`Datos guardados`);
				fs.readFile("user_data.txt", "utf-8", (e, data) => {
					if (e) {
						console.log(`No se pudo leer el archivo ${e}`);
						return;
					}
					console.log(data);
				});
				rl.close();
			});
		});
	});
});
