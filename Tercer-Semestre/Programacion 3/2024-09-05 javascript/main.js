// // Crea un script que declare tres variables: a, b, y c. Asigna a a y b valores numéricos y haz que c sea la suma de a y b. Imprime el resultado en la consola.
// // Requisito: mostrar por consola el resultado de los valores declarados en el codigo si a(5), b(10) c = 15

// const add = () => {
//     let a = 5;
//     let b = 10;
//     let c = a + b;

// console.log('La suma de a y b es: ' + c); 
// }

// add();

// // Escribe un programa que pida al usuario su nombre y lo almacene en una variable. Luego, imprime un saludo en la consola que incluya el nombre del usuario.
// // Requisito: se debe utilizar la instrucción prompt y pedir mediante este elemento el nombre y luego mostrarlo en consola

// const nombre = prompt("¿Cuál es tu nombre?");

// console.log('Hola ' + nombre);

// // Crea un script que declare tres variables: a, b, y c. Asigna a a y b valores numéricos y determina cual es el mayor. Imprime el resultado en la consola.

// const greater = () =>{

//     let a = 3;
//     let b = 14;
//     let c = 8;

//     if (a > b && a>c){
//         console.log('El mayor de los tres es: ' + a);
//     } else if(b>a && b>c){
//         console.log('El mayor de los tres es: ' + b);
//     } else {
//         console.log('El mayor de los tres es: ' + c);
//     }
// }

// greater();

// // Crea un programa que pida al usuario un número y determine si es par o impar.
// // Requisitos:  utilice la instrucción propmt  si es par, debe mostrar "El número (numeroIngresado) es par", y si es impar, "El número  (numeroIngresado) es impar".

// const IS_EVEN = () => {
//     let number = Number(prompt("Ingresa un número y te diré si es par o impar"));
//     let msg = (number % 2 == 0) ? `El número ${number} es par` : `El número ${number} es impar`;
//     console.log(msg);
// }

// IS_EVEN();

// // Crea un script que inicialice una variable en 10 y luego use un bucle while para restarle 1 en cada iteración hasta que la variable sea igual a 0. Imprime el valor de la variable en cada iteración.

// const countdown = () => {
//     let a = 10;
//     while (a>0){
//         console.log(a);
//         a--;
//     }
// }

// countdown();

// // Escribe un programa que utilice un bucle do...while para pedirle al usuario que ingrese un número mayor a 100. El bucle debe repetirse hasta que el usuario ingrese un número mayor a 100.
// // Requisitos: Debe utilizarse la instrucción prompt y luego mostrar por consola el numero ingresado de la manera que se muestra abajo

// const GREATER_100 = () => {
//     let a;
//     do {
//         a = Number(prompt("Ingresa un número mayor a 100:"))
//     } while (a<100)

//     console.log(`Ingresaste un número mayor a 100: ${a}`);
// }

// GREATER_100();

// // Escribe una función llamada esPar que reciba un número como parámetro y retorne true si el número es par y false si es impar. Prueba la función con diferentes números.

// const esPar = (num) => {
//     return num %2 == 0;
// }

// console.log(esPar(222));

// // Crea una función llamada convertirCelsiusAFahrenheit que reciba un valor en grados Celsius y lo convierta a Fahrenheit. La fórmula es F = C × 1.8 + 32. Muestra el resultado en la consola.

// const convertirCelsiusAFarenheit = (celsius) => {
//     console.log(`${celsius}°C son equivalentes a ${celsius * 1.8 + 32}°F`);
// }

// convertirCelsiusAFarenheit(30);

// // Define un objeto persona con las propiedades nombre, edad, y ciudad. Luego, agrega un método que permita cambiar la ciudad de la persona. Usa el método para actualizar la ciudad y muestra las propiedades actualizadas en la consola.

// let persona = {
//     nombre: "Mauro",
//     edad: 34,
//     ciudad: "Mendoza",
//     cambiarCiudad: function(ciudad) {
//         this.ciudad = ciudad;
//     }
// };

// console.log(persona);
// persona.cambiarCiudad("Godoy Cruz");
// console.log(persona);

// //Crea un objeto libro con propiedades titulo, autor, y año. Luego, escribe un método que determine si el libro tiene más de 10 años desde su publicación. Muestra un mensaje en la consola indicando si el libro es antiguo o reciente.

// let libro = {
//     titulo: "El Quijote",
//     autor: "Miguel de Cervantes",
//     year: 1605,
//     esAntiguo: function(){
//         const currentYear = new Date().getFullYear();

//         const antiguo = currentYear - this.year > 10;
        
//         console.log(`El libro "${this.titulo}" es antiguo: ${antiguo}` );
//     }
// };

// console.log(libro);
// libro.esAntiguo();

// //Declara un array llamado numeros con los números del 1 al 10. Escribe un bucle que multiplique cada número por 2 y almacene los resultados en un nuevo array. Muestra el array original y el nuevo array en la consola.

// const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const results = [];

// numeros.forEach(element => {
//     results.push(element*2);
// });

// console.log(`Números originales: ${numeros}`);
// console.log(`Números multiplicados por 2: ${results}`);

// //Crea un array vacío llamado pares. Escribe un bucle for que itere hasta 20 y que agregue los primeros 10 números pares al array. Al final, imprime el array pares en la consola.

// const pares = [];

// for (let i = 0; i < 20; i++) {
//     if(i%2 ==  0 && pares.length< 10){
//         pares.push(i);
//     }
// }

// console.log(pares);

// //En el html muestra tres elementos de tipo <p> y haz un botón que dispara una función y nos permita cambiar todos nuestros elementos de tipo p en nuestra pagina de color azul

// const button = document.getElementById("btn-azul");

// const parrafos = document.getElementById("parrafos")

// const handleStyleButton = () => {
//     if (parrafos.classList.contains("blueButton")){
//         parrafos.classList.remove("blueButton")
//     } else {
//     parrafos.classList.add("blueButton")
//     }
// };

// button.addEventListener("click",() => {
//     handleStyleButton();
// })

// //Crea un formulario simple con un campo de texto y un botón. Escribe un script en JavaScript que muestre una alerta con el valor ingresado en el campo de texto cuando el usuario haga clic en el botón.

// const btnForm = document.getElementById("btn-form");


// const getDataInput = () => {
//     const texto = document.getElementById('texto').value;
//     alert("Has ingresado: " + texto)
// };

// btnForm.addEventListener("click", () => {
//     getDataInput();
// });

// //Crea una lista (<ul>) con varios elementos (<li>). Escribe un script que agregue un evento click a cada elemento de la lista para que, cuando se haga clic en un li, se muestre su texto en la consola.

// const lista = document.querySelectorAll("#lista li");

// lista.forEach(item => {
//     item.addEventListener('click', function() {
//         console.log(this.textContent);
//     })
// })

// //Crea un campo de texto y un botón en una página HTML. Escribe un script que haga que el botón deshabilite el campo de texto cuando se haga clic en él. Luego, añade otro botón que vuelva a habilitar el campo de texto.
// //Requisitos: al estar deshabilitado nuestro input no puede apretarse, no tiene hover y al habilitarse si

// const txt = document.getElementById("txt-ej2");
// const btnDeshabilitar = document.getElementById("deshabilitar");
// const btnHabilitar = document.getElementById("habilitar");

// btnHabilitar.disabled = true;

// btnDeshabilitar.addEventListener("click", () => {
//     txt.disabled = true;
//     txt.style.cursor = "not-allowed";
//     btnHabilitar.disabled = false;
//     btnDeshabilitar.disabled = true;
// });

// btnHabilitar.addEventListener("click", () => {
//     txt.disabled = false;
//     txt.style.cursor = "text";
//     btnHabilitar.disabled = true;
//     btnDeshabilitar.disabled = false;
// });

//Crea un formulario con un campo para el correo electrónico. Escribe un script que guarde el correo en localStorage cuando el usuario envíe el formulario. si este existe muestralo en el dom debajo del input y tambien haz un botón de eliminar este elemento, al recargar la pagina este debe mostrarse si existe

const emailButton = document.getElementById("email__button");

const getDataInputs = () => {
    const email = document.getElementById("email").value;
    
    localStorage.setItem("emails", JSON.stringify({email}));
    
    if(email){
        const storedEmail = document.getElementById("stored_email");
        storedEmail.innerHTML = `
        <p>Correo Guardado: ${email}</p>
        <button id="delete_email">Eliminar Correo Guardado</button>`

        document.getElementById("delete_email").addEventListener("click", () => {
            localStorage.removeItem("emails");
        })
    }
};



emailButton.addEventListener("click", (event) => {
    event.preventDefault();
    getDataInputs();
})