// Escribe una función llamada esPar que reciba un número como parámetro y retorne true si el número es par y false si es impar. Prueba la función con diferentes números.

const esPar = (num) => {
    return num %2 == 0;
}

console.log(esPar(222));

// Crea una función llamada convertirCelsiusAFahrenheit que reciba un valor en grados Celsius y lo convierta a Fahrenheit. La fórmula es F = C × 1.8 + 32. Muestra el resultado en la consola.

const convertirCelsiusAFarenheit = (celsius) => {
    console.log(`${celsius}°C son equivalentes a ${celsius * 1.8 + 32}°F`);
}

convertirCelsiusAFarenheit(30);

// Define un objeto persona con las propiedades nombre, edad, y ciudad. Luego, agrega un método que permita cambiar la ciudad de la persona. Usa el método para actualizar la ciudad y muestra las propiedades actualizadas en la consola.

let persona = {
    nombre: "Mauro",
    edad: 34,
    ciudad: "Mendoza",
    cambiarCiudad: function(ciudad) {
        this.ciudad = ciudad;
    }
};

console.log(persona);
persona.cambiarCiudad("Godoy Cruz");
console.log(persona);

//Crea un objeto libro con propiedades titulo, autor, y año. Luego, escribe un método que determine si el libro tiene más de 10 años desde su publicación. Muestra un mensaje en la consola indicando si el libro es antiguo o reciente.

let libro = {
    titulo: "El Quijote",
    autor: "Miguel de Cervantes",
    year: 1605,
    esAntiguo: function(){
        const currentYear = new Date().getFullYear();

        const antiguo = currentYear - this.year > 10;
        
        console.log(`El libro "${this.titulo}" es antiguo: ${antiguo}` );
    }
};

console.log(libro);
libro.esAntiguo();

//Declara un array llamado numeros con los números del 1 al 10. Escribe un bucle que multiplique cada número por 2 y almacene los resultados en un nuevo array. Muestra el array original y el nuevo array en la consola.

const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const results = [];

numeros.forEach(element => {
    results.push(element*2);
});

console.log(`Números originales: ${numeros}`);
console.log(`Números multiplicados por 2: ${results}`);

//Crea un array vacío llamado pares. Escribe un bucle for que itere hasta 20 y que agregue los primeros 10 números pares al array. Al final, imprime el array pares en la consola.

const pares = [];

for (let i = 0; i < 20; i++) {
    if(i%2 ==  0 && pares.length< 10){
        pares.push(i);
    }
}

console.log(pares);