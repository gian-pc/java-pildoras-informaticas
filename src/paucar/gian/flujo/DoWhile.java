package paucar.gian.flujo;

import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este Programa cuenta los caracteres de la palabra o frase introducida \n"
                + "Para terminar escribe salir");

        String texto;

        do {
            texto = JOptionPane.showInputDialog("Introduce el texto");
            JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() +
                    " caracteres");
        } while (!texto.equals("salir"));
        System.out.println("Has salido del programa");


    }
}
