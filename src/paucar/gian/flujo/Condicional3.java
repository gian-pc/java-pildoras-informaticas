package paucar.gian.flujo;

import javax.swing.*;

public class Condicional3 {
    public static void main(String[] args) {

        int distanciaColegio;
        double rentaFamiliar;
        byte hermanosCentro;

        distanciaColegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio: "));
        rentaFamiliar = Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar: "));
        hermanosCentro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el n° de hermanos: "));

        if (distanciaColegio > 10 && rentaFamiliar < 20000 && hermanosCentro >= 2) {
            System.out.println("El alumno tiene beca");
        } else {
            System.out.println("El alumno no tien beca");
        }


    }
}
