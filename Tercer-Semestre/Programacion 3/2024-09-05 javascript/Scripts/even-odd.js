// Ejercicio 2:
// Crea un programa que pida al usuario un número y determine si es par o impar.
// Requisitos:  utilice la instrucción propmt  si es par, debe mostrar "El número (numeroIngresado) es par", y si es impar, "El número  (numeroIngresado) es impar".


const IS_EVEN = () => {
    let number = Number(prompt("Ingresa un número y te diré si es par o impar"));
    let msg = (number % 2 == 0) ? `El número ${number} es par` : `El número ${number} es impar`;
    console.log(msg);
}

IS_EVEN();