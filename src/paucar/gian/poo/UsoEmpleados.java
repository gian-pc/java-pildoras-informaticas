package paucar.gian.poo;

public class UsoEmpleados {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Ana");
        empleado1.setSeccion("RRHH");
        System.out.println(empleado1.getDatosEmpleado());

    }
}

class Empleados{

    private final String nombre;
    private String seccion;

    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "Administración";
    }

    public void setSeccion(String seccion){
        this.seccion = seccion;
    }

    public String getDatosEmpleado(){
        return "El empleado " + nombre + " pertenece a la sección " + seccion;
    }
}
