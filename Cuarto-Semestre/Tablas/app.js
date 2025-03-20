const fs = require("fs");
console.log(process.argv);
const [, , base = 5] = process.argv;

const basePased =
  typeof base === "string" && base.includes("=")
    ? parseInt(base.split("=")[1])
    : parseInt(base);

let table = `tabla del ${basePased}\n`;
for (let i = 0; i <= 10; i++) {
  table += `${basePased} * ${i} = ${basePased * i}\n`;
}

if (fs.existsSync("Ctabla")) {
  console.log("la carpeta ya existia, procedo a hacer el archivo");
  crearArchivo(table);
} else {
  try {
    fs.mkdirSync(`Ctabla`);
    crearArchivo(table);
  } catch (err) {
    if (err) throw err;
  }
}
function crearArchivo(tabla) {
  try {
    fs.writeFileSync(`./Ctabla/tabla${basePased}.txt`, tabla, "utf-8");
  } catch (err) {
    if (err) throw err;
  }
}
