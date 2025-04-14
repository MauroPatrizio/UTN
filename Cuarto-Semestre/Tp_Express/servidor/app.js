const { envs } = require("./src/config/env");
const { startServer } = require("./src/server/server");
const main = () => {
	startServer({
		port: envs.PORT,
		public_path: envs.PUBLIC_PATH,
	});
};

(async () => {
	main();
})();
