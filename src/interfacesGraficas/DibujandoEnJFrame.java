package interfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

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

        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(200,100,200,150);

        float midash[]={10.0f};
        //BasicStroke milapiz = new BasicStroke(4);
        BasicStroke milapiz = new BasicStroke(4,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10,midash,0);
        g2.setStroke(milapiz);
        g2.draw(rectangulo);
    }
}
