package interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class DibujandoEnJFrame {
    public static void main(String[] args) {

        MarcoDibujos mimarco = new MarcoDibujos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoDibujos extends JFrame {
    public MarcoDibujos(){
        setBounds(300,300,800,450);
        LaminaDibujos miLamina = new LaminaDibujos();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaDibujos extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(20,20,125,75);
        g.drawLine(20,20,145,95);
        g.fillRect(20,200,125,75);
    }
}
