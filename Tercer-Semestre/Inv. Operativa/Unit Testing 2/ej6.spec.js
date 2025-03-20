// 6. Validador de Direcciones (Entrega en parte 2)
// Una distribuidora necesita validar las direcciones enviadas por los clientes antes de enviar el repartidor. Se les pide crear un validador de direcciones que vienen en formato JSON según los siguientes requerimientos:

// Una Dirección debe contener los siguientes campos:

// campo	Required	Type
// street	yes	string
// number	yes	number
// floor_apartment	no	string
// zip_code	yes	number
// town	no	string
// city	yes	string
// province	yes	string

// Ejemplo
// {
// 	"street": "Salta",
// 	"number": 359,
// 	"floor_apartment": "D3",
// 	"zip_code": 5500,
// 	"town": "",
// 	"city": "Mendoza",
// 	"province": "Mendoza"
// }
const validarDireccion = (direccion) => {

    if(!direccion || typeof direccion !== "object") {
        return ["Se debe proporcionar un objero válido"];
    };
    
    const requeridos = {
        street: 'string',
        number: 'number',
        zip_code: 'number',
        city: 'string',
        province: 'string'
    };

    errores = [];

    for (const campo in requeridos) {
        const tipo = requeridos[campo];
        const actualType = typeof direccion[campo];

        if (!(campo in direccion)) {
            errores.push(`el campo: ${campo} es requerido`);
        } else if (actualType !== tipo) {
            errores.push(`el campo ${campo} debe ser de tipo ${tipo}.`);
        }
    };

    if (direccion.floor_apartment && typeof direccion.floor_apartment !== 'string') {
        errores.push('floor_apartment debe ser de tipo string');
    };

    if (direccion.town && typeof direccion.town !== 'string') {
        errores.push('town debe ser de tipo string');
    };

    if (errores.length > 0) {
        return errores;
    }else{
        return 'La dirección es válida';
    };
}

test("Validar dirección correcta", () => {
    const direccion = {
        "street": "Salta",
        "number": 359,
        "floor_apartment": "D3",
        "zip_code": 5500,
        "town": "",
        "city": "Mendoza",
        "province": "Mendoza"
    }
    expect(validarDireccion(direccion)).toBe('La dirección es válida');
});

test("Validar mensaje de error por tipo incorrecto de dato", () => {
    const direccion = {
        "street": 486,
        "number": "coso",
        "floor_apartment": true,
        "zip_code": "sdfs",
        "town": 123456,
        "city": 123465,
        "province": 456789
    };

    expect(validarDireccion(direccion)).toEqual(["el campo street debe ser de tipo string.", "el campo number debe ser de tipo number.", "el campo zip_code debe ser de tipo number.", "el campo city debe ser de tipo string.", "el campo province debe ser de tipo string.", "floor_apartment debe ser de tipo string", "town debe ser de tipo string"]);
});

test("Validar que acepte direcciones sin datos no requeridos", () => {
    const direccion = {
        "street": "Salta",
        "number": 359,
        "zip_code": 5500,
        "city": "Mendoza",
        "province": "Mendoza"
    }
    expect(validarDireccion(direccion)).toBe('La dirección es válida');
});

test("Validar mensaje de error por datos requeridos faltantes", () => {
    const direccion = {

    }
    expect(validarDireccion(direccion)).toEqual(["el campo: street es requerido", "el campo: number es requerido", "el campo: zip_code es requerido", "el campo: city es requerido", "el campo: province es requerido"]);
});

test("Validar que el parametro no sea null", () => {
    const direccion = null;
    expect(validarDireccion(direccion)).toEqual(["Se debe proporcionar un objero válido"])
});