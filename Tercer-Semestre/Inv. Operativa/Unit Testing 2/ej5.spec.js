// 5. Piedra Papel o Tijeras (Entrega en parte 2)
// Crea una función que dada dos entradas devuelven quien gana, en caso de empate indica empate.

// Ejemplo:
// "tijera", "papel" --> "jugador 1 gana!"
// "tijera", "piedra" --> "jugador 2 gana!"
// "papel", "papel" --> "empate!"

const piedraPapelTijera = (entrada1, entrada2) => {
    try{
        const jugadas = ["piedra", "papel", "tijera"];

        entrada1 = entrada1.toLowerCase();
        entrada2 = entrada2.toLowerCase();

        if (!jugadas.includes(entrada1) || !jugadas.includes(entrada2)) {
            throw new Error("Entrada inválida.");
        }

        if(entrada1 === entrada2){
            return "Empate";
        }

        if((entrada1 === "piedra" && entrada2 === "tijera") || (entrada1 === "tijera" && entrada2 === "papel") || (entrada1 === "papel" && entrada2 === "piedra")) {
            return "Gana el primer jugador"
        } else {
            return "Gana el segundo jugador"
        }
    } catch (error){
        console.error(error.message);
        throw error;
    }
}


test("Validar mensaje de error por entrada inválida", () =>{
    expect(() => {piedraPapelTijera("coso", "tijera")}).toThrow("Entrada inválida.");
    expect(() => {piedraPapelTijera("tijera", "asdf")}).toThrow("Entrada inválida.");
    expect(() => {piedraPapelTijera("pore", "asdf")}).toThrow("Entrada inválida.");
});

test("Validar empate", () => {
    expect(piedraPapelTijera("piedra", "piedra")).toBe("Empate");
    expect(piedraPapelTijera("papel", "papel")).toBe("Empate");
    expect(piedraPapelTijera("tijera", "tijera")).toBe("Empate");
});

test("Validar piedra, papel", () => {
    expect(piedraPapelTijera("piedra", "papel")).toBe("Gana el segundo jugador");
    expect(piedraPapelTijera("papel", "piedra")).toBe("Gana el primer jugador");
});

test("Validar tijera, papel", () => {
    expect(piedraPapelTijera("papel", "tijera")).toBe("Gana el segundo jugador");
    expect(piedraPapelTijera("tijera", "papel")).toBe("Gana el primer jugador");
});

test("Validar piedra, tijera", () => {
    expect(piedraPapelTijera("tijera", "piedra")).toBe("Gana el segundo jugador");
    expect(piedraPapelTijera("piedra", "tijera")).toBe("Gana el primer jugador");
});