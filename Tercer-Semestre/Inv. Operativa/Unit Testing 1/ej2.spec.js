// 2. Volúmen de un Tanque de Agua (Entrega parte 1)
// En una fábrica de tanques de agua en acero y inoxidable necesitan calcular de forma rápida el volúmen de los tanques. Dados el diámetro y la altura retornar el volúmen. La función debe cumplir con los siguientes requerimientos:

// El resultado debe ser expresado en litros.
// Los datos de entrada pueden ser en cm o en m.

const calVolTanque = (diametro, altura, tipoMedida) => {

    try {
        if(tipoMedida !== "cm" && tipoMedida !== "m"){
            throw new Error("Error en el tipo de medida, debe ser cm o m");
        }

        if(typeof diametro !== "number" || typeof altura !== "number"){
            throw new Error("Los valores de diametro y altura deben ser números");
        }

        if(diametro <= 0 || altura <= 0){
            throw new Error("Los valores indicados no pueden ser 0 o menos")
        }

        if(tipoMedida === "cm"){
            diametro /= 100;
            altura /= 100;
        }

        const radio = diametro / 2;
        const volumen = Math.PI * Math.pow(radio, 2) * altura;
        const litros = volumen * 1000;
        
        return litros.toFixed(2) + " litros";

    } catch (error) {
        console.log(error.message);
        return error.message;
    }
    
    
}

console.log(calVolTanque(2,5,"m"));
console.log(calVolTanque(200,500,"cm"));


test("Validar calculo en metros", () => {
    expect(calVolTanque(2,5,"m")).toBe("15707.96 litros");
});

test("Validar calculo en cm", () => {
    expect(calVolTanque(200,500,"cm")).toBe("15707.96 litros");
});

test("Validar mensaje de error por tipo de medida inadecuada", () => {
    expect(calVolTanque(2, 5, "pl")).toBe("Error en el tipo de medida, debe ser cm o m");
});

test("Validar mensaje de error por valores negativos", () => {
    expect(calVolTanque(-2, 5, "m")).toBe("Los valores indicados no pueden ser 0 o menos");
    expect(calVolTanque(2,-5, "m")).toBe("Los valores indicados no pueden ser 0 o menos");
});

test("Validar manejo de undefined", () => {
    expect(calVolTanque(2, 5, undefined)).toBe("Error en el tipo de medida, debe ser cm o m");
    expect(calVolTanque(undefined, 5, "m")).toBe("Los valores de diametro y altura deben ser números");
});