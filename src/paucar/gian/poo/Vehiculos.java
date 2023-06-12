package paucar.gian.poo;

public class Vehiculos {

    public Vehiculos(int ruedas) {

        this.ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getDatosVehiculo(){
        return "Tu vehículo tiene "+ ruedas + " ruedas. Además tiene "+largo+ " m de largo";
    }

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;
}
