package paucar.gian.poo;

public class Vehiculos {

    public Vehiculos(int ruedas) {

        this.ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";
    }

    public void setExtra(boolean climatizador){
        this.climatizador = climatizador;
    }

    public void setExtra(boolean gps, boolean climatizador, boolean tapiceriaCuero){
        this.gps = gps;
        this.climatizador = climatizador;
        this.tapiceriaCuero = tapiceriaCuero;
    }


    public String getExtra() {
        if(climatizador) return "Tu coche tiene climatizador";
        else return "Tu coche no tiene climatizador";
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
    private boolean climatizador;
    private boolean tapiceriaCuero;
    private boolean gps;
}
