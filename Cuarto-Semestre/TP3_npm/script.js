const yargs = require("yargs");
const fs = require("fs");

const argv = yargs
	.command("leer", "Lee un archivo JSON", {
		file: {
			describe: "Ruta archivo JSON",
			demandOption: true,
			type: "string",
		},
	})
	.help().argv;

if (argv._.includes("leer")) {
	(async () => {
		try {
			const rf = await fs.promises.readFile(argv.file, "utf8");
			const jsonData = JSON.parse(rf);
			console.log(jsonData);
		} catch (error) {
			console.error(`Error al leer el archivo ${argv.file}`);
		}
	})();
}
