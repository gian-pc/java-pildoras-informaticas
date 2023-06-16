package paucar.gian.poo.ejercicios.ejercicio2;

public class Paquete {
    private int referenceEnvio, prioridadEnvio;
    private double peso;
    private String dni;

    public Paquete(int referenceEnvio, double peso, String dni, int prioridadEnvio) {
        this.referenceEnvio = referenceEnvio;
        this.peso = peso;
        this.dni = dni;
        this.prioridadEnvio = prioridadEnvio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrioridadEnvio(int prioridadEnvio) {
        this.prioridadEnvio = prioridadEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridadEnvio() {
        return prioridadEnvio;
    }
}
