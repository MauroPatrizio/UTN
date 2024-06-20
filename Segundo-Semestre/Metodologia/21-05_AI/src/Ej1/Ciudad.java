package Ej1;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private double impuesto1;
    private double impuesto2;
    private double impuesto3;
    private double impuesto4;
    private double impuesto5;
    private double gastosMantenimiento;

    public Ciudad(String nombre, int poblacion, double impuesto1, double impuesto2, double impuesto3, double impuesto4, double impuesto5, double gastosMantenimiento) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.impuesto1 = impuesto1;
        this.impuesto2 = impuesto2;
        this.impuesto3 = impuesto3;
        this.impuesto4 = impuesto4;
        this.impuesto5 = impuesto5;
        this.gastosMantenimiento = gastosMantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getImpuesto1() {
        return impuesto1;
    }

    public double getImpuesto2() {
        return impuesto2;
    }

    public double getImpuesto3() {
        return impuesto3;
    }

    public double getImpuesto4() {
        return impuesto4;
    }

    public double getImpuesto5() {
        return impuesto5;
    }

    public double getGastosMantenimiento() {
        return gastosMantenimiento;
    }

    public double getTotalIngresos() {
        return impuesto1 + impuesto2 + impuesto3 + impuesto4 + impuesto5;
    }

    public boolean tieneDeficit() {
        return getTotalIngresos() < gastosMantenimiento;
    }
}
