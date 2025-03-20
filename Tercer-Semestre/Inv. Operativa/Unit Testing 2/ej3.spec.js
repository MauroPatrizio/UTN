// 3. Paseo en bicicleta (Entrega en parte 2)
// Franco sabe que es importante mantenerse hidratado, toma 0,5 litros de agua por hora de pedaleo. Dado el tiempo que Franco está pedaleando, calcular la cantidad de agua, en litros, que Franco va a tomar.

// Redondea el valor al número mas bajo.
// Ejemplos:
// Tiempo = 3 --> litros = 1
// Tiempo = 6.7 --> litros = 3
// Tiempo = 11.8 --> litros = 5

const litrosAgua = (tiempo) => {
    try {
        if (tiempo < 0) {
            throw new Error ("Viajaste al pasado, no se necesita agua");
        }

        if (tiempo === 0){
            console.warn("El tiempo es 0, por lo tanto no se consume agua.");
            return 0;
        } else {
            return Math.floor(tiempo * 0.5)
        }
    } catch (error) {
        console.error(error.message);
        return null;
    }
    
}


// console.log(litrosAgua(-4));
// console.log(litrosAgua(0));
// console.log(litrosAgua(3));
// console.log(litrosAgua(6.7));
// console.log(litrosAgua(11.8));

beforeAll(() => {
    jest.spyOn(console, "error").mockImplementation(() => {});
    jest.spyOn(console, "warn").mockImplementation(() => {});
});

test("Validar retorno null para tiempo negativo", () => {
    expect(litrosAgua(-4)).toBeNull();
});

test("Validar mensaje error con números negativos", () => {
    expect(console.error).toHaveBeenCalledWith("Viajaste al pasado, no se necesita agua");
});

test("Validar retorno 0 para tiempo = 0 ", () => {
    expect(litrosAgua(0)).toBe(0);
});

test("Validar mensaje para el tiempo = 0 ", () => {
    expect(console.warn).toHaveBeenCalledWith("El tiempo es 0, por lo tanto no se consume agua.");
});

test("Validar resultado", () => {
    expect(litrosAgua(3)).toBe(1);
    expect(litrosAgua(6.7)).toBe(3);
    expect(litrosAgua(11.8)).toBe(5);
})

