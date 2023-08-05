package interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class PrimerJFrame {
    public static void main(String[] args) {

        /*
        JFrame miVentana = new JFrame();
        miVentana.setSize(600, 350);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocation(600,350);
        miVentana.setVisible(true); Se recomienda colocar en último lugar, porque no tiene autorefresh
         */

        MiJFrame miVentana = new MiJFrame();
    }
}

class MiJFrame extends JFrame {
    public MiJFrame() {
        //setSize(600, 350);
        //setLocationRelativeTo(null);
        setBounds(600,350,450,450);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocation(600, 350);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Ventana de pruebas");
        Toolkit miSistema = Toolkit.getDefaultToolkit();
        Image miIcono = miSistema.getImage("src/interfacesGraficas/react.png");
        setIconImage(miIcono);
        setVisible(true);

    }
}