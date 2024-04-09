package Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Departamento> departamentos = new ArrayList<>();

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
}
