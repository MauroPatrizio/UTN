import { PrismaClient } from "@prisma/client";

const prisma = new PrismaClient();

export const getAllUsuariosService = async () => {
	return prisma.usuario.findMany();
};

export const getUsuarioByIdService = async (id: string) => {
	return prisma.usuario.findUnique({
		where: { id },
		select: {
			id: true,
			email: true,
			nombre: true,
			password: true,
		},
	});
};

export const postUsuarioService = async (nombre: string, email: string, password: string) => {
	return prisma.usuario.create({
		data: { nombre, email, password },
	});
};

export const putUsuarioService = async (
	id: string,
	nombre: string,
	email: string,
	password: string
) => {
	return prisma.usuario.update({
		where: { id },
		data: { nombre, email, password },
	});
};

export const deleteUsuarioService = async (id: string) => {
	return prisma.usuario.delete({
		where: { id },
	});
};
