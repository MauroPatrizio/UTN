package EJ2;

import java.util.Date;

class Servicio {
    private Date fecha;
    private String tipoDeCarga;

    public Servicio(Date fecha, String tipoDeCarga) {
        this.fecha = fecha;
        this.tipoDeCarga = tipoDeCarga;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }
}