// Los bancos utilizan un código PIN numérico como parte de la autenticación de los usuarios. Dicho PIN debe cumplir con los siguientes requerimientos:

// PIN de exáctamente 4 o 6 dígitos.
// No puede contener letras.
// La función debe retornar Verdadero si es el PIN es válido, caso contrario Falso.


const isValidPin = (pin) => {
    const regex = /^(\d{4}|\d{6})$/;
    return regex.test(pin);
}

test("Validar pin de 4 digitos", () => {
    expect(isValidPin("1234")).toBe(true);
});
test("Validar pin de 6 digitos", () => {
    expect(isValidPin("123412")).toBe(true);
});
test("Validar pin no sea de menos de 4 digitos", () => {
    expect(isValidPin("123")).toBe(false);
});
test("Validar no sea de más de 6 digitos", () => {
    expect(isValidPin("1234567")).toBe(false);
});
test("Validar no sea de 5 digitos", () => {
    expect(isValidPin("12345")).toBe(false);
});
