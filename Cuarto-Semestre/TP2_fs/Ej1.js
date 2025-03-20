// Ejercicio 1

// Escribir en el archivo un mensaje de inicio cada vez que el programa se ejecuta, con la fecha y hora actual en el formato:

// [YYYY-MM-DD HH:MM:SS] - Inicio del programa
// Simular la ejecución de una tarea que tarda 5 segundos. Mientras la tarea se ejecuta, escribir en log.txt:

// [YYYY-MM-DD HH:MM:SS] - Ejecutando tarea...
// Cuando la tarea finaliza, escribir en log.txt:

// [YYYY-MM-DD HH:MM:SS] - Tarea completada

const fs = require("fs");

function getCurrentDate() {
	const date = new Date();
	return date.toISOString().replace("T", " ").substring(0, 19);
}

if (!fs.existsSync("Results")) {
	fs.mkdirSync("Results");
}

function writeMessage(message) {
	const logMessage = `[${getCurrentDate()}] - ${message}\n`;
	fs.appendFileSync("./Results/ResultsEj1.txt", logMessage);
}

writeMessage("Inicio del programa");

setTimeout(() => {
	writeMessage("Ejecutando tarea...");
}, 3000);

setTimeout(() => {
	writeMessage("Tarea completada");
}, 3000);
