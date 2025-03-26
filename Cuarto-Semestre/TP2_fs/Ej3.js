// //Ejercicio 3

// Instrucciones:
// Crear un archivo llamado contactos.json con el siguiente contenido inicial:

// json
// Copiar
// Editar
// [
//     {
//         "nombre": "Juan Pérez",
//         "telefono": "123-456-7890",
//         "email": "juan@example.com"
//     }
// ]
// Crear una función en Node.js que agregue un nuevo contacto al archivo contactos.json. El contacto debe ser un objeto con los siguientes campos:

// json
// Copiar
// Editar
// {
//     "nombre": "[Tu Nombre]",
//     "telefono": "[Tu Teléfono]",
//     "email": "[Tu Email]"
// }
// crear una funcion para Leer y mostrar en la consola todos los contactos almacenados en contactos.json.

// Agregar una función que elimine un contacto dado su nombre.

// // Código de prueba
// agregarContacto('Carlos López', '987-654-3210', 'carlos@example.com');
// mostrarContactos();
// eliminarContacto('Juan Pérez');
// mostrarContactos();

const fs = require("fs");

const FILE_PATH = "./Results/contactos.json";

if (!fs.existsSync("Results")) {
	fs.mkdirSync("Results");
}

if (!fs.existsSync(FILE_PATH)) {
	fs.writeFileSync(FILE_PATH, JSON.stringify([], null, 2));
}

function leerContactos() {
	try {
		const data = fs.readFileSync(FILE_PATH, "utf8");
		return JSON.parse(data) || [];
	} catch (error) {
		return [];
	}
}

function agregarContacto(nombre, telefono, email) {
	const contactos = leerContactos();
	if (!Array.isArray(contactos)) {
		console.error("Error: el archivo de contactos no tiene un formato válido.");
		return;
	}
	contactos.push({ nombre, telefono, email });
	fs.writeFileSync(FILE_PATH, JSON.stringify(contactos, null, 2));
	console.log(`Contacto ${nombre} agregado.`);
}

function mostrarContactos() {
	const contactos = leerContactos();
	console.log("Lista de contactos:");
	console.log(contactos);
}

function eliminarContacto(nombre) {
	let contactos = leerContactos();
	if (!Array.isArray(contactos)) {
		console.error("Error: el archivo de contactos no tiene un formato válido.");
		return;
	}
	const nuevosContactos = contactos.filter((contacto) => contacto.nombre !== nombre);
	if (contactos.length === nuevosContactos.length) {
		console.log(`No se encontró el contacto: ${nombre}`);
		return;
	}
	fs.writeFileSync(FILE_PATH, JSON.stringify(nuevosContactos, null, 2));
	console.log(`Contacto ${nombre} eliminado.`);
}

agregarContacto("Carlos López", "987-654-3210", "carlos@example.com");
mostrarContactos();
eliminarContacto("Juan Pérez");
mostrarContactos();
