package paucar.gian.entradaSalida;

import javax.swing.*;

public class EntradaJOptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tú nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu nombre: "));
        System.out.println("Tú nombre es " + nombre + " y tienes " + edad + " años");
    }
}
