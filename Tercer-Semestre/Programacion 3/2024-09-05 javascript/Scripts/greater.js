// Ejercicio 1:
// Crea un script que declare tres variables: a, b, y c. Asigna a a y b valores numéricos y determina cual es el mayor. Imprime el resultado en la consola.


const greater = () =>{

    let a = 3;
    let b = 14;
    let c = 8;


    if (a > b && a>c){
        console.log('El mayor de los tres es: ' + a);
    } else if(b>a && b>c){
        console.log('El mayor de los tres es: ' + b);
    } else {
        console.log('El mayor de los tres es: ' + c);
    }
}

greater();