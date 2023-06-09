package paucar.gian.flujo.ejercicios;

import javax.swing.*;

public class NumeroFactorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        long factorial = num;

        for (int i = num - 1; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println(num + "! = " + factorial);
    }
}
