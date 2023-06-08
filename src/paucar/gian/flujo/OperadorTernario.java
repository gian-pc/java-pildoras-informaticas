package paucar.gian.flujo;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
        double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));
        double salarioMayor;

        salarioMayor = (salariot1 > salariot2) ? salariot1 : salariot2;
        System.out.println("El salario mayor es: "+salarioMayor);
    }
}
