package interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {

        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto(){
        setBounds(400,200,600,450);
        setTitle("Escritura en JFrame");
        setVisible(true);
        PrimerPanel miLamina = new PrimerPanel();
        add(miLamina);
    }
}

class PrimerPanel extends JPanel{

    public PrimerPanel(){
        setBackground(new Color(10));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Color miColor = new Color(255,0,0);
        g.setColor(miColor);

        Font miLetra = new Font("Courier",3,20);
        g.setFont(miLetra);
        g.drawString("Primer panel", 40,40);
    }
}
