console.log(`Ejercicio 2: corriendo desde TypeScript`);


//3. Crea variables de diferentes tipos de datos (string, number, boolean, Date). Muestra sus valores en el HTML. Utiliza los siguientes tipos: string, number, boolean, Date

let texto: string = "Hola, TypeScript!";
let numero: number = 123;
let booleano: boolean = true;
let fecha: Date = new Date(2024, 8, 8);
let fechaFormateada: string = fecha.toLocaleDateString("es-AR");

const ej3 = document.getElementById("ej3");

const ej3output = `
<h2>Tipos de Datos</h2>

<p>Texto: ${texto}</p>
<p>Número: ${numero}</p>
<p>Booleano: ${booleano}</p>
<p>Fecha: ${fechaFormateada}</p>`;

if (ej3) {
    ej3.innerHTML = ej3output;
} else {
    console.error("No existe elemento con id: ej3")
}

//4.  Crea una función que convierta un número a una cadena de texto. Muestra el resultado en el HTML. La función debe recibir un número y devolver su representación en cadena.
const numberToString = (num: number): string => {
    return num.toString();
}
    
let num:number = 456;
let numString: string = numberToString(num);

const ej4 = document.getElementById("ej4");

if(ej4){
    ej4.innerHTML = `
    <p>Número convertido a cadena: ${numString}</p>
    `
} else {
    console.error(`No existe elemento con id: ej4`);
    
}


//5.  Crea un array de números y una función que sume todos los elementos del array. Muestra la suma en el HTML. La función debe recibir un array de números y devolver la suma de todos sus elementos.
const numeros: number[] = [1, 2, 3, 4, 5];

const sumarElementosArray = (numeros: number[]): number => {
    return numeros.reduce((cont, valorActual) => cont + valorActual, 0);
};

const ej5 = document.getElementById("ej5");

if(ej5){
    ej5.innerHTML = `
    <p>Suma del array: ${sumarElementosArray(numeros)}</p>
    `
}else{
    console.error(`No existe elemento con id: ej5`);
};

//6. Crea un objeto que representa a un estudiante con nombre, edad y curso. Muestra al estudiante y sus propiedades en el HTML.  El objeto debe tener propiedades para el nombre, edad y curso del estudiante.

interface Estudiante{
    nombre: string;
    edad: number;
    curso: string;
}

const ej6 = document.getElementById("ej6");

const student: Estudiante = {
    nombre: "Juan",
    edad: 20,
    curso: "Matemáticas"
};

if(ej6){
    ej6.innerHTML = `
        <p>Estudiante: ${student.nombre}</p>
        <p>Edad: ${student.edad}</p>
        <p>Curso: ${student.curso}</p>
    `
} else {
    console.error(`No existe elemento con id: ej6`)
};


//7. Define un “type” personalizado para representar una dirección con calle, ciudad y código postal. Usa este tipo para crear una dirección y muéstrala en el HTML. El tipo debe tener propiedades para calle, ciudad y código postal.

type Direccion = {
    calle: string;
    ciudad: string;
    cp: number;
}

const direccion: Direccion = {
    calle: "Av. Principal",
    ciudad: "Ciudad",
    cp: 12345
};

const ej7 = document.getElementById("ej7");

if(ej7){
    ej7.innerHTML = `
    <p>Dirección: Calle:${direccion.calle}, Ciudad:${direccion.ciudad}, CP:${direccion.cp}</p>
    `
}else{
    console.error(`No existe elemento con id: ej7`);
};

//8.  Define una interfaz para un usuario que tenga nombre, correo y un método para saludar. Implementa esta interfaz en un objeto y muestra el saludo en el HTML. La interfaz debe definir propiedades para nombre, correo y un método que devuelva un saludo.

interface Usuario {
    nombre: string;
    correo: string;
    saludar(): void;
};

const ana: Usuario = {
    nombre: "Ana",
    correo: "ana@gmail.com",
    saludar(){
        return `Hola, mi nombre es ${this.nombre}`
    }   
};


const ej8 = document.getElementById("ej8");

if(ej8){
    ej8.innerHTML = `
    <p>${ana.saludar()}</p>
    `
}

//9.  Crea una clase `Persona` con propiedades para nombre y edad. Implementa un método para presentarse y muestra el resultado en el HTML. La clase debe tener un constructor para inicializar nombre y edad, y un método que devuelva una cadena con la presentación.

class Persona {
    nombre: string;
    edad: number;

    constructor(nombre: string, edad: number){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    presentarse(){
        return `Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`
    }
}   

const carlos = new Persona("Carlos", 30);

const ej9 = document.getElementById("ej9");

if(ej9){
    ej9.innerHTML = `
    <p>${carlos.presentarse()}</p>
    `
} else{
    console.error(`No existe elemento con id: ej9`);
};


//10.  Crea una clase genérica `Caja` que almacena un valor de tipo genérico. Implementa un método para obtener el valor y muestra los resultados en el HTML. La clase debe permitir almacenar y obtener un valor de cualquier tipo.
// –  Requisitos:
// • llamar la función pasándole el type string
// • llamar la función pasándole el type number 
// • verificar que el tipo de dato pasado y el parámetro se muestran correctamente

class Caja<T> {
    private valor: T;

    constructor(valor: T){
        this.valor = valor;
    }

    obtenerValor(): T {
        return this.valor;
    }
}

const ej10 = document.getElementById("ej10");

const valorString = new Caja<string>("Mensaje secreto");
const valorNumber = new Caja<number>(42);

if(ej10){
    ej10.innerHTML = `
    <p>Contenido de cajaDeTexto: ${valorString.obtenerValor()}</p>
    <p>Contenido de cajaDeNumero: ${valorNumber.obtenerValor()}</p>
    `
} else {
    console.error(`No existe elemento con id: ej10`)
};

//11. Crea una función genérica `identidad` que devuelva el mismo valor que recibe. Usa esta función para diferentes tipos y muestra los resultados en el HTML. La función debe aceptar un valor de cualquier tipo y devolverlo sin modificarlo.

const identidad = <T>(dato: T): T => {
    return dato;
}

const ej11 = document.getElementById("ej11");

if(ej11){
    ej11.innerHTML = `
    <p>Identidad del número: ${identidad(123)}</p>
    <p>Identidad del texto: ${identidad("texto")}</p>
    `
}else{
    console.error(`No existe elemento con id: ej11`);
};

//12. Define una enumeración `Color` con valores para diferentes colores. Usa esta enumeración para asignar un color favorito a una variable y muéstralo en el HTML. La enumeración debe incluir al menos tres colores diferentes.
// –Requisitos:
//     • Genera un enum con tres colores
//     • Asigna a una variable el enum

enum Color{
    Azul = "Azul",
    Amarillo = "Amarillo",
    Rojo = "Rojo"
};

let colorFavorito = Color.Azul;

const ej12 = document.getElementById("ej12");

if(ej12){
    ej12.innerHTML = `
        <p>Color favorito: ${colorFavorito}
    `
}