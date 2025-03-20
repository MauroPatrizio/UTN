import { ChangeEvent, FC, FormEvent, useEffect, useState } from "react";
import { tareaStore } from "../../../Store/tareaStore";
import styles from "./Modal.module.css";
import { ITarea } from "../../../types/iTarea";
import { useTareas } from "../../../Hooks/useTareas";

type IModal = {
	handleCloseModal: VoidFunction;
};

const initialState: ITarea = {
	titulo: "",
	descripcion: "",
	fechaLimite: "",
};

export const Modal: FC<IModal> = ({ handleCloseModal }) => {
	const tareaActiva = tareaStore((state) => state.tareaActiva);
	const setTareaActiva = tareaStore((state) => state.setTareaActiva);

	const { crearTarea, putTareaEditar } = useTareas();

	const [formValues, setFormValues] = useState<ITarea>(initialState);

	useEffect(() => {
		if (tareaActiva) setFormValues(tareaActiva);
	}, []);

	const handleChange = (e: ChangeEvent<HTMLInputElement | HTMLTextAreaElement>) => {
		const { name, value } = e.target;
		setFormValues((prev) => ({ ...prev, [`${name}`]: value }));
	};

	const handleSubmit = (e: FormEvent) => {
		e.preventDefault();
		if (tareaActiva) {
			putTareaEditar(formValues);
		} else {
			crearTarea({ ...formValues, id: Date.now().toString() });
		}
		setTareaActiva(null);
		handleCloseModal();
	};

	return (
		<div className={styles.containerPrincipalModal}>
			<div className={styles.contentPopUp}>
				<div>
					<h3 className={styles.h3ModalTitle}>{tareaActiva ? "Editar Tarea" : "Crear Tarea"}</h3>
				</div>
				<form
					onSubmit={handleSubmit}
					className={styles.formContent}
				>
					<div>
						<input
							type="text"
							required
							autoComplete="off"
							value={formValues.titulo}
							name="titulo"
							placeholder="Ingrese un título"
							onChange={handleChange}
						/>
						<textarea
							name="descripcion"
							required
							placeholder="Ingrese una Descripción"
							value={formValues.descripcion}
							onChange={handleChange}
						></textarea>
						<input
							type="date"
							name="fechaLimite"
							required
							autoComplete="off"
							value={formValues.fechaLimite}
							onChange={handleChange}
						/>
					</div>
					<div className={styles.buttonCard}>
						<button onClick={handleCloseModal}>Cancelar</button>
						<button type="submit">
							{tareaActiva ? "Editar Tarea" : "Crear Tarea"}
						</button>
					</div>
				</form>
			</div>
		</div>
	);
};
