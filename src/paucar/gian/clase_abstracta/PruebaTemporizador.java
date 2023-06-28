package paucar.gian.clase_abstracta;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;


public class PruebaTemporizador {
    public static void main(String[] args) {
        Temporizador oyente = new Temporizador();
        Timer miTemporizador = new Timer(5000,oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");
    }
}

class Temporizador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date horaActual = new Date();
        System.out.println(horaActual);
    }
}