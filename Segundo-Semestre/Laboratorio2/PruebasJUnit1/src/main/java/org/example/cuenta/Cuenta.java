package org.example.cuenta;

public class Cuenta {


    private String persona;
    private float saldo;

        
    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String persona, float saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }
    public Cuenta() {}
}
