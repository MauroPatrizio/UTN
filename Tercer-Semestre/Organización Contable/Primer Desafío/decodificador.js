const fs = require('fs');

function leerArchivo(ruta) {
    try {
        return fs.readFileSync(ruta, 'utf-8');
    } catch (err) {
        console.error('Error al leer el archivo:', err);
        return '';
    }
}

function cifrarCesar(texto, desplazamiento) {
    const mayusculas = 'ZYXWVUTSRQPONMLKJIHGFEDCBA';
    const minusculas = 'zyxwvutsrqponmlkjihgfedcba';
    const numLetras = 26;

    return texto.split('').map(caracter => {
        if (mayusculas.includes(caracter)) {
            const indiceOriginal = mayusculas.indexOf(caracter);
            const nuevoIndice = (indiceOriginal + desplazamiento) % numLetras;
            return mayusculas[nuevoIndice];
        } else if (minusculas.includes(caracter)) {
            const indiceOriginal = minusculas.indexOf(caracter);
            const nuevoIndice = (indiceOriginal + desplazamiento) % numLetras;
            return minusculas[nuevoIndice];
        } else {
            return caracter;
        }
    }).join('');
}

function guardarArchivo(ruta, contenido) {
    try {
        fs.writeFileSync(ruta, contenido, 'utf-8');
        console.log(`Archivo guardado en: ${ruta}`);
    } catch (err) {
        console.error('Error al escribir el archivo:', err);
    }
}

function procesarArchivo(rutaEntrada, rutaSalida, desplazamiento) {
    const contenido = leerArchivo(rutaEntrada);
    if (contenido) {
        const contenidoCifrado = cifrarCesar(contenido, desplazamiento);
        guardarArchivo(rutaSalida, contenidoCifrado);
    } else {
        console.log('No se pudo leer el archivo.');
    }
}

const rutaEntrada = 'codificado.txt';

for (let i = 0; i < 27; i++) {
    let desplazamiento = i;
    const rutaSalida = `decodificado${i}.txt`;
    procesarArchivo(rutaEntrada, rutaSalida, desplazamiento);
}

