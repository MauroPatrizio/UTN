function cantFrigorias(ancho, alto, profundo) {
	if (typeof ancho !== "number" || typeof alto !== "number" || typeof profundo !== "number") {
		console.error("Los datos deben ser numéricos");
		return null;
	}

	if (ancho <= 0 || alto <= 0 || profundo <= 0) {
		console.error("No puede haber una medida menor o igual a 0");
		return null;
	}

	return ancho * alto * profundo * 50;
}

test("Validar calculo con datos correctos de frigorias", () => {
	const resultado = cantFrigorias(2, 5, 7);
	expect(resultado).toBe(3500);
});

test("Mostrar mensaje error si hay al menos un dato que sea 0", () => {
	const spy = jest.spyOn(console, "error").mockImplementation();
	cantFrigorias(-2, 1, 5);
	expect(spy).toHaveBeenCalledWith("No puede haber una medida menor o igual a 0");
	spy.mockRestore();
});

test("Retornar null si hay datos incorrectos", () => {
	const result1 = cantFrigorias(0, 2, 2);
	const result2 = cantFrigorias(0, 0, 2);
	const result3 = cantFrigorias(2, 2, 0);
	expect(result1).toBeNull();
	expect(result2).toBeNull();
	expect(result3).toBeNull();
});

test("Mensaje de error si los datos son string", () => {
	const spy = jest.spyOn(console, "error").mockImplementation();
	cantFrigorias("0", "1", " 5");
	expect(spy).toHaveBeenCalledWith("Los datos deben ser numéricos");
	spy.mockRestore();
});

test("Retornar null si hay datos string", () => {
	const result1 = cantFrigorias("1", 2, 2);
	const result2 = cantFrigorias(9, 1, "2");
	const result3 = cantFrigorias(2, "2", 1);
	expect(result1).toBeNull();
	expect(result2).toBeNull();
	expect(result3).toBeNull();
});

test("Mensaje de error si los datos son booleanos", () => {
	const spy = jest.spyOn(console, "error").mockImplementation();
	cantFrigorias(true, false, true);
	expect(spy).toHaveBeenCalledWith("Los datos deben ser numéricos");
	spy.mockRestore();
});

test("Retornar null si hay datos booleanos", () => {
	const result1 = cantFrigorias(true, 2, 2);
	const result2 = cantFrigorias(9, 1, false);
	const result3 = cantFrigorias(2, false, 1);
	expect(result1).toBeNull();
	expect(result2).toBeNull();
	expect(result3).toBeNull();
});
