// Ejercicio 4
// Desarrollar un programa en Node.js que:
// Reciba como argumento el nombre de un archivo de texto.
// Lea el contenido del archivo y cuente cuántas veces aparece una palabra específica (también pasada como argumento).
// Imprima en consola el número de apariciones de la palabra.
// Ejemplo de uso:
// node contadorPalabras.js archivo.txt palabras

// archivo.txt
// Hola mundo, este es un ejemplo de conteo de palabras en un archivo.
// Este archivo contiene palabras repetidas. Palabras, palabras y más palabras.

// Salida esperada (si la palabra aparece 3 veces en el archivo):
// La palabra "palabras" aparece 5 veces en el archivo "archivo.txt".
const fs = require("fs");
const [, , fileName, word] = process.argv;

if (!fileName || !word) {
	console.log(`Se debe poner nombre del archivo y la palabra`);
	process.exit(1);
}

fs.readFile(fileName, "utf-8", (e, data) => {
	if (e) {
		console.error(e);
		process.exit(1);
	}

	const regex = new RegExp(`\\b${word}\\b`, "gi");
	const match = data.match(regex);
	const count = match ? match.length : 0;

	console.log(
		count > 0
			? `La palabra "${word}" aparece ${count} veces en el archivo "${fileName}"`
			: `La palabra "${word}" no aparece en el archivo "${fileName}"`
	);
});
