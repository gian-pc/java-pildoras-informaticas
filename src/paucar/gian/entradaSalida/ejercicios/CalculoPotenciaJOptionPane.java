package paucar.gian.entradaSalida.ejercicios;

import javax.swing.*;

public class CalculoPotenciaJOptionPane {
    public static void main(String[] args) {

        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + Math.pow(base, exponente));

    }
}
