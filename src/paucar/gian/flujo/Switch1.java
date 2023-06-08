package paucar.gian.flujo;

import javax.swing.*;

public class Switch1 {
    public static void main(String[] args) {

        int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce n° de hijos"));

        switch (hijos) {
            case 0:
                System.out.println("La natalidad es baja");
                break;
            case 1:
                System.out.println("Por algo se empieza");
                break;
            case 2:
                System.out.println("Tienes la pareja");
                break;
            case 3:
                System.out.println("Vas en aumento");
                break;
            case 4:
                System.out.println("Familia numerosa");
                break;
            default:
                System.out.println("Fuera de rango");
        }

    }
}
