const fs = require('fs');

function leerArchivo(ruta) {
    return fs.readFileSync(ruta, 'utf-8');
}

function cifrarCesar(texto, desplazamiento) {
    const mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const minusculas = "abcdefghijklmnopqrstuvwxyz";
    const numeroCaracteres = 26;

    return texto.split('').map(caracter => {
        if (mayusculas.includes(caracter)) {
            const indiceOriginal = mayusculas.indexOf(caracter);
            const nuevoIndice = (indiceOriginal + desplazamiento) % numeroCaracteres;
            return mayusculas[nuevoIndice];
        } else if (minusculas.includes(caracter)) {
            const indiceOriginal = minusculas.indexOf(caracter);
            const nuevoIndice = (indiceOriginal + desplazamiento) % numeroCaracteres;
            return minusculas[nuevoIndice];
        } else {
            return caracter;
        }
    }).join('');
}

function guardarArchivo(ruta, contenido) {
    fs.writeFileSync(ruta, contenido, 'utf-8');
    console.log(`Archivo guardado en: ${ruta}`);
}

function procesarArchivo(rutaEntrada, rutaSalida, desplazamiento) {
    const contenido = leerArchivo(rutaEntrada);
    const contenidoCifrado = cifrarCesar(contenido, desplazamiento);
    guardarArchivo(rutaSalida, contenidoCifrado);
}

const rutaEntrada = 'entrada.txt';
const rutaSalida = 'codificado.txt';
const desplazamiento = 16;

procesarArchivo(rutaEntrada, rutaSalida, desplazamiento);
