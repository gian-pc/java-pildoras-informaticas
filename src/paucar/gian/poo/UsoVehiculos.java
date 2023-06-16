package paucar.gian.poo;

public class UsoVehiculos {
    public static void main(String[] args) {

        Vehiculos miCoche = new Vehiculos(4);
        miCoche.setColor("rojo");

        System.out.println(miCoche.getDatosVehiculo());
        System.out.println(miCoche.getColor());

        Vehiculos miCoche2 = new Vehiculos(4);
        miCoche2.setExtra(true);
        System.out.println(miCoche2.getExtra());
    }
}
