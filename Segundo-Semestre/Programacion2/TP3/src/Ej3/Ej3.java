package Ej3;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        List<String> diasSemana = new ArrayList<>();

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        diasSemana.add(4, "Juernes");

        System.out.println("Posicion 3: " + diasSemana.get(3) + "\nPosicion 4: " + diasSemana.get(4));
        System.out.println("Primer elemento: " + diasSemana.get(0) + "\nUltimo elemento: " + diasSemana.get(diasSemana.size() -1));

        diasSemana.remove("Juernes");
        System.out.println(diasSemana.get(4));

        diasSemana.iterator();
        for(String dia: diasSemana){
            System.out.println(dia);
        }

        System.out.println(diasSemana.contains("Lunes"));

        System.out.println(diasSemana.contains("Lunes"));

        diasSemana.clear();
        System.out.println("lista borrada");
        for(String dia: diasSemana){
            System.out.println(dia);
        }



    }
}
