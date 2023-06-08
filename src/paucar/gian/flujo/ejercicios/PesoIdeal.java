package paucar.gian.flujo.ejercicios;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {

        // variables
        int altura;
        double pesoIdeal = 0;
        String genero;

        // inputs
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm: "));
        genero = JOptionPane.showInputDialog("Ingrese su género H - M: ");

        if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 120;

        } else if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = altura - 110;

        } else {
            System.out.println("Ingrese un género válido");
        }

        System.out.println("Tú peso ideal es: " + pesoIdeal + " kg");


    }
}
