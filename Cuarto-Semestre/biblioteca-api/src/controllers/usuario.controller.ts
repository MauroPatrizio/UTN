import { Request, Response } from "express";
import { deleteUsuarioService, getAllUsuariosService, getUsuarioByIdService, postUsuarioService, putUsuarioService } from "../services/usuarios.service";


export const getAllUsuariosController = async (_req: Request, res: Response) => {
	try {
		const usuarios = await getAllUsuariosService();
		res.json(usuarios);
	} catch (error) {
		res.status(500).json({ message: "error al obtener la lista de usuarios", error });
	}
};

export const getUsuarioByIdController = async (req: Request, res: Response): Promise<void> => {
	try {
		const { id } = req.params;
		const usuario = await getUsuarioByIdService(id);
		if (!usuario) {
			res.status(404).json({ message: "Usuario no encontrado" });
		}
		res.json(usuario);
	} catch (error) {
		console.error(error);
		res.status(500).json({ message: "Error al obtener usuario", error });
	}
};

export const postUsuarioController = async (req: Request, res: Response) => {
	try {
		const { nombre, email, password } = req.body;
		const usuario = await postUsuarioService(nombre, email, password);
		res.status(201).json({ message: "Usuario creado" });
	} catch (error) {
		res.status(500).json({ message: "error al registrar un usuario", error });
	}
};

export const putUsuarioController = async (req: Request, res: Response) => {
	try {
		const { id } = req.params;
		const { nombre, email, password } = req.body;
		const usuario = await putUsuarioService(id, nombre, email, password);
		res.status(201).json({ message: "usuario actualizado" });
	} catch (error) {
		res.status(500).json({ message: "Error al actualizar usuario", error });
	}
};

export const deleteUsuarioController = async (req: Request, res: Response) => {
	try {
		const { id } = req.params;
		const usuarioEliminado = await deleteUsuarioService(id);
		res.status(204).send();
	} catch (error) {
		res.status(500).json({ message: "Error al eliminar usuario", error });
	}
};
