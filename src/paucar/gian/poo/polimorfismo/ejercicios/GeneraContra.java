package paucar.gian.poo.polimorfismo.ejercicios;

import javax.swing.*;

public class GeneraContra {
    public static void main(String[] args) {

        int tamanioArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        int longitudPass = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del password"));

        CreaPassword ArrayPasswords[] = new CreaPassword[tamanioArray];

        for (int i = 0; i < ArrayPasswords.length; i++) {
            ArrayPasswords[i] = new CreaPassword(longitudPass);
            System.out.println("Password: "+ArrayPasswords[i].getPassword() + " Longitud: " + ArrayPasswords[i].getLongitud()+
                    " caracteres " + " "+ArrayPasswords[i].esSegura());

        }


    }
}
