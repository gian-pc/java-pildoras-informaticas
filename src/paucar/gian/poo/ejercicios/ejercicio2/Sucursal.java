package paucar.gian.poo.ejercicios.ejercicio2;

public class Sucursal {

    private int numSucursals;
    private String address, city;


    public Sucursal(int numSucursals, String address, String city) {
        this.numSucursals = numSucursals;
        this.address = address;
        this.city = city;
    }

    public int getNumSucursals() {
        return numSucursals;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public double calcularPrecio(Paquete pack1){
        double precio;
        precio = pack1.getPeso();

        if(pack1.getPrioridadEnvio()==1) precio +=10;
        if(pack1.getPrioridadEnvio()==2) precio +=20;

        return precio;
    }




}
