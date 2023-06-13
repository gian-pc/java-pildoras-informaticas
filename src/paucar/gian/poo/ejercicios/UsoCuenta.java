package paucar.gian.poo.ejercicios;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Gian", 1500);
        CuentaCorriente cuenta2 = new CuentaCorriente("Maria", 2500);

        CuentaCorriente.transferencia(cuenta2, cuenta1,200);

        System.out.println(cuenta1.getDatosCuenta());
        System.out.println();
        System.out.println(cuenta2.getDatosCuenta());


    }
}
