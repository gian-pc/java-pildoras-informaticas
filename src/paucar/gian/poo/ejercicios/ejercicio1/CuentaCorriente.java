package paucar.gian.poo.ejercicios.ejercicio1;

import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String titular;
    private long numeroCuenta;

    public CuentaCorriente(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
        Random rndNumCuenta = new Random();
        this.numeroCuenta = Math.abs(rndNumCuenta.nextLong());

    }

    public void setIngreso(double ingreso) {

        if (ingreso < 0) System.out.println("Ingreso no permitido");
        else saldo += ingreso;

    }

    public void setReintegro(double reintegro) {
        saldo -= reintegro;
    }

    public String getSaldo() {
        return "Saldo de la cuenta: " + saldo;
    }

    public String getDatosCuenta() {
        return "Titular: " + titular + "\n" +
                "N° de cuenta: " + numeroCuenta + "\n" +
                "Saldo: " + saldo;
    }

    public static void transferencia(CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
        titu1.saldo -= cantidad;
        titu2.saldo += cantidad;

    }


}
