package interfacesGraficas.ejercicios;

import javax.swing.*;


public class VentanasGraficas {
    public static void main(String[] args) {

        GeneradorVentanas ventana1 = new GeneradorVentanas("Ventana 1", 200,200,400,400);
        GeneradorVentanas ventana2 = new GeneradorVentanas("Ventana 2", 400,400,400,400);
        GeneradorVentanas ventana3 = new GeneradorVentanas("Ventana 3", 600,600,400,400);

    }
}

class GeneradorVentanas extends JFrame {

    public GeneradorVentanas(String titulo, int posX, int posY, int ancho, int alto) {
        setTitle(titulo);
        setBounds(posX, posY, ancho, alto);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
