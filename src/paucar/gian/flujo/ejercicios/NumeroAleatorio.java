package paucar.gian.flujo.ejercicios;

import javax.swing.*;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random() * 100);
        int numUser = 0;
        int intentos = 0;


        while (numAleatorio != numUser) {

            numUser = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de 1 - 100"));

            if (numUser > numAleatorio) {
                System.out.println((intentos + 1) + ") El número es menor");

            } else if (numUser < numAleatorio) {
                System.out.println((intentos + 1) + ") El número es mayor");
            }

            intentos++;
        }
        System.out.println("[ Correcto] lo lograste con " + intentos + " intentos");

    }
}
