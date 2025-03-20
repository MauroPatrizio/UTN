// Ejercicio 3

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
const [, , name, tel, mail] = process.argv;

if (!fs.existsSync("Results")) {
	fs.mkdirSync("Results");
}

const initialData = {
	nombre: "Mauro",
	telefono: "123456789",
	email: "mauro@mail.com",
};

if (!fs.existsSync("./Results/contactos.json")) {
	fs.mkdirSync("./Results/contactos.json");
}
fs.writeFileSync("./Results/contactos.json", JSON.stringify(initialData));

function addContact(name, tel, mail) {
	fs.appendFileSync("./Results/contactos.json", JSON.pa);
}

if ((name, tel, mail)) {
	addContact(name, tel, mail);
} else {
	console.log(`Debe dar el nombre, telefono y mail`);
}

function showContacts() {
	console.log(fs.readFileSync("./Results/contactos.json", "utf8"));
}

function deleteContact(nombre) {
	const contacts = JSON.parse(fs.readFileSync("contactos.json", "utf-8"));
	const initialQty = contacts.length();
	contacts = contacts.filter((contact) => contact.name !== name);
	if (contacts.length() < initialQty) {
	}
}

showContacts();

console.log(typeof initialData);
