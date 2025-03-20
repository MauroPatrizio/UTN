// Ejercicio 2
// Desarrollar un programa en Node.js que realice las siguientes operaciones utilizando el módulo `fs`:

// 1. Crear un archivo llamado `datos.txt` y escribir en él el siguiente contenido:
//    ```
//    Nombre: [Tu Nombre]
//    Edad: [Tu Edad]
//    Carrera: [Tu Carrera]
//    ```

// 2. Leer el archivo `datos.txt` e imprimir su contenido en la consola.

// 3. Agregar al final del archivo la fecha y hora actuales en el siguiente formato:
//    ```
//    Fecha de modificación: [YYYY-MM-DD HH:MM:SS]
//    ```

// 4. Renombrar el archivo `datos.txt` a `informacion.txt`.

// 5. Eliminar el archivo `informacion.txt` tras 10 segundos de haber sido renombrado.

const fs = require("fs");

if (!fs.existsSync("Results")) {
	fs.mkdirSync("Results");
}

const content = `Nombre: Mauro\nEdad: 34\nCarrera: Programación`;

fs.writeFileSync("./Results/datos.txt", content);

console.log(fs.readFileSync("./Results/datos.txt", "utf8"));

function getCurrentDate() {
	const date = new Date();
	return date.toISOString().replace("T", " ").substring(0, 19);
}

fs.appendFileSync("./Results/datos.txt", `\nFecha de modificación: ${getCurrentDate()}`);

fs.renameSync("./Results/datos.txt", "./Results/informacion.txt");

setTimeout(() => {
	fs.unlinkSync("./Results/informacion.txt");
}, 10000);
