const express = require("express");
const path = require("path");

const startServer = (options) => {
	const app = express();
	const distPath = path.join(__dirname, "../../../dist");

	app.use(express.static(distPath));

	app.get("/", (req, res) => {
		res.sendFile(path.join(distPath, "index.html"));
	});
};

module.exports = {
	startServer,
};
