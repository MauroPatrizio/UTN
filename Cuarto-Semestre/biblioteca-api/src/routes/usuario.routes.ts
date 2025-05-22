import express from "express";
import {
	deleteUsuarioController,
	getAllUsuariosController,
	getUsuarioByIdController,
	postUsuarioController,
	putUsuarioController,
} from "../controllers/usuario.controller";

const router = express.Router();

router.get("/", getAllUsuariosController);
router.get("/:id", getUsuarioByIdController);
router.post("/", postUsuarioController);
router.put("/:id", putUsuarioController);
router.delete("/:id", deleteUsuarioController);

export default router;
