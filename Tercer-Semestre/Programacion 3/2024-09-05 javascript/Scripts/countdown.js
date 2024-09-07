// Ejercicio 1:
// Crea un script que inicialice una variable en 10 y luego use un bucle while para restarle 1 en cada iteración hasta que la variable sea igual a 0. Imprime el valor de la variable en cada iteración.


const countdown = () => {
    let a = 10;
    while (a>0){
        console.log(a);
        a--;
    }
}

countdown();