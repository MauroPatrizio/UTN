// Escribe un programa que utilice un bucle do...while para pedirle al usuario que ingrese un número mayor a 100. El bucle debe repetirse hasta que el usuario ingrese un número mayor a 100.
// Requisitos: Debe utilizarse la instrucción prompt y luego mostrar por consola el numero ingresado de la manera que se muestra abajo


const GREATER_100 = () => {
    let a;
    do {
        a = Number(prompt("Ingresa un número mayor a 100:"))
    } while (a<100)

    console.log(`Ingresaste un número mayor a 100: ${a}`);
}

GREATER_100();