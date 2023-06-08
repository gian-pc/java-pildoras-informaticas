package paucar.gian.flujo;

import javax.swing.*;

public class While1 {
    public static void main(String[] args) {

        String clave = "Gian";

        String acceso = "";

        while(!clave.equals(acceso)){
            acceso = JOptionPane.showInputDialog("Introduce la clave de acceso");
            if(!clave.equals(acceso)){
                System.out.println("Clave incorrecta");
            }
        }
        System.out.println("Bienvenido a la zona de usuarios");

    }
}
