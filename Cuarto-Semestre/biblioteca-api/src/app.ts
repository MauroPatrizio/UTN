import express from "express";
import dotenv from "dotenv";
import userRoutes from "./routes/usuario.routes";

dotenv.config();

const app = express();
app.use(express.json());
app.use("/usuarios", userRoutes);

export default app;
