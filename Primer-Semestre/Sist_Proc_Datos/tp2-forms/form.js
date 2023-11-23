function mostrarDatos(){
    let apellido = document.getElementById("apellido").value;
    let nombre = document.getElementById("nombre").value;
    let dni = document.getElementById("dni").value;
    let nacimiento = document.getElementById("nacimiento").value;
    let domicilio = document.getElementById("domicilio").value;
    let localidad = document.getElementById("localidad").value;
    let spanish = document.getElementById("rngspanish").value;
    let english = document.getElementById("rngenglish").value;
    let french = document.getElementById("rngfrench").value;
    let chinese = document.getElementById("rngchinese").value;

    let message =
        "Apellido: " + apellido + "<br>" +
        "Nombre: " + nombre + "<br>" +
        "Nro DNI: " + dni + "<br>" +
        "Fecha Nacimiento: " + nacimiento + "<br>" +
        "Domicilio: " + domicilio + "<br>" +
        "Localidad: " + localidad + "<br>";
    document.write(message);
    if(spanish != 0){
        document.write("Español: " + spanish + "<br>");
    }
    if(english != 0){
        document.write("Inglés: " + english + "<br>");
    }
    if(french != 0){
        document.write("Francés: " + french + "<br>");
    }
    if(chinese != 0){
        document.write("Chino: " + chinese + "<br>");
    }
}

function habilitarInputRange(checkboxId, rangeId) {
    const checkbox = document.getElementById(checkboxId);
    const inputRange = document.getElementById(rangeId);

    if (checkbox.checked) {
        inputRange.disabled = false;
    } else {
        inputRange.disabled = true;
    }
}