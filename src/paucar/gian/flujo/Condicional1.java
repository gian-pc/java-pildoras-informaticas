package paucar.gian.flujo;

import javax.swing.*;

public class Condicional1 {
    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));

        if(edad>=18){
            System.out.println("Eres mayor de edad, puedes pasar");
        }else {
            System.out.println("Eres menor de edad, no puedes pasar");
        }


    }
}
