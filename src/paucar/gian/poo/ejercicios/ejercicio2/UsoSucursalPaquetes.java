package paucar.gian.poo.ejercicios.ejercicio2;

import java.util.Scanner;

public class UsoSucursalPaquetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int nsucursal, npackage, referencia, prioridad;
        double peso;
        String address, city, dni;


        // inputs
        System.out.println("----- INGRESE DATOS DE LA SUCURSAL -----");
        System.out.print("N° Sucursal: ");
        nsucursal = sc.nextInt();

        System.out.print("Dirección: ");
        address = sc.next();

        System.out.print("Ciudad: ");
        city = sc.next();

        Sucursal sucursal1 = new Sucursal(nsucursal, address, city);

        System.out.println("\n----- INGRESE DATOS DE PAQUETES -----");
        System.out.print("N° de paquetes a enviar: ");
        npackage = sc.nextInt();

        Paquete[] paquetes = new Paquete[npackage];

        for (int i = 0; i < paquetes.length; i++) {
            System.out.println("\nPaquete N°: " + (i + 1));

            System.out.print("Referencia: ");
            referencia = sc.nextInt();

            System.out.print("DNI del remitente: ");
            dni = sc.next();

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            System.out.println("Prioridad : \n   0 = Normal \n   1 = Alta \n   2 = Urgente");
            prioridad = sc.nextInt();

            paquetes[i] = new Paquete(referencia, peso, dni, prioridad);

        }

        System.out.println("\n--------------------------------------------");
        System.out.println("\nDatos de Sucursal");
        System.out.println("Sucursal: " + sucursal1.getNumSucursals());
        System.out.println("Dirección: " + sucursal1.getAddress());
        System.out.println("Ciudad: " + sucursal1.getCity());

        System.out.println("\nDatos de los paquetes");
        for (int i = 0; i < npackage; i++) {
            System.out.println("Paquete N°: " + (i + 1));
            System.out.println("Precio: " + sucursal1.calcularPrecio(paquetes[i]));
            System.out.println("Peso: " + paquetes[i].getPeso());
            System.out.println("Prioridad: " + paquetes[i].getPrioridadEnvio());
            System.out.println();
        }


    }
}
