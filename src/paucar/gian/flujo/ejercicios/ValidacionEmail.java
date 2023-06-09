package paucar.gian.flujo.ejercicios;

import javax.swing.*;

public class ValidacionEmail {
    public static void main(String[] args) {

        boolean valido = false;

        do {

            String email = JOptionPane.showInputDialog("Ingrese su email");

            int countArroba = 0;
            boolean punto = false;


            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    countArroba++;
                }
                if (email.charAt(i) == '.') {
                    punto = true;
                }
            }

            if (countArroba == 1 && punto == true && email.length() >= 4) {
                valido = true;
            }else{
                JOptionPane.showMessageDialog(null,"Email invalido");
            }

        } while (valido == false);

        System.out.println("Email correcto!!");


    }


}
