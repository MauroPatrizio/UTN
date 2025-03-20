import { FC } from "react";
import { ITarea } from "../../../types/iTarea";
import styles from "./CardList.module.css";
import { useTareas } from "../../../Hooks/useTareas";

type ICardList = {
	tarea: ITarea;
	handleOpenModalEdit: (tarea: ITarea) => void;
};

export const CardList: FC<ICardList> = ({ tarea, handleOpenModalEdit }) => {
	const { eliminarTarea } = useTareas();

	const eliminarTareaById = () => {
		eliminarTarea(tarea.id!);
	};
	const editarTarea = () => {
		handleOpenModalEdit(tarea);
	};

	return (
		<div className={styles.containerCard}>
			<div>
				<h3>Titulo: {tarea.titulo}</h3>
				<p>Descripción: {tarea.descripcion}</p>
				<p>
					Fecha Límite: <b>{tarea.fechaLimite}</b>
				</p>
			</div>
			<div className={styles.actionCard}>
				<button onClick={eliminarTareaById}>Eliminar</button>
				<button onClick={editarTarea}>Editar</button>
			</div>
		</div>
	);
};
