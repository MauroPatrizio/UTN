// 4. Calcular el Siglo (Entrega parte 1)
// Se necesita una función que recibe un valor de año y devuelva el Siglo correspondiente.

// 1705 --> 18
// 1900 --> 19
// 1601 --> 17


const yearToCentury = (year) => {
    try {
        if (!Number.isInteger(year)){
            throw new Error("El año debe ser un número entero")
        }

        if(year === 0){
            throw new Error("No existe el año 0")
        }
        let yearAbsolute = Math.abs(year);
        let yearString = yearAbsolute.toString();
        let century = parseInt(yearString.substring(0,2), 10);
        if(yearAbsolute%100 != 0){
            century ++;
        }
        
        if(year<0){
            return century + " AC";
        } else {
            return century + " DC";
        }


    } catch (error) {
        console.log(error.message);
        return error.message;
    }
}

test("Validar siglo para años terminados en 0", () => {
    expect(yearToCentury(1900)).toBe("19 DC");
});

test("Validar siglo para años que no terminan en 0", () => {
    expect(yearToCentury(1601)).toBe("17 DC");
    expect(yearToCentury(1699)).toBe("17 DC");
});

test("Validar siglo para años negativos", () => {
    expect(yearToCentury(-1601)).toBe("17 AC");
    expect(yearToCentury(-1699)).toBe("17 AC");
});

test("Validar mensaje de error para año 0", () => {
    expect(yearToCentury(0)).toBe("No existe el año 0");
});

test("Validar mensaje de error para tipo de parámetro ingresado", () => {
    expect(yearToCentury("asdf")).toBe("El año debe ser un número entero");
});