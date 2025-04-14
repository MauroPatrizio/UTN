import { config } from "dotenv";
import { sumar } from "./math.js";
import readline from "readline";
import { datos } from "./ej4.js";
datos;
// config();

// console.log(process.env.DB_HOST);
// console.log(process.env.DB_USER);
// console.log(process.env.DB_PASS);

// console.log(sumar(2, 5));

// const rl = readline.createInterface({
// 	input: process.stdin,
// 	output: process.stdout,
//  terminal:false,
// });

// rl.question("¿Cuál es tu nombre? ", (nombre) => {
// 	console.log(`Hola, ${nombre}!`);
// 	rl.question("Cuál es tu edad?", (edad) => {
// 		const year = new Date().getFullYear() - parseInt(edad);
// 		console.log(`Tu nacimiento fue en el año ${year}`);
// 		rl.close();
// 	});
// });
