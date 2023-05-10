package com.company;
import java.util.Scanner;

public class iva {



    public static void main(String[] args) {

        double precio=0.0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio: \n");
        precio = leer.nextDouble();
        precio = PrecioIva(precio);

        System.out.println("El precio con el iva incluido es: " + precio);
        System.out.println("\n\n¡Que tenga Buen día!");


    }

    static double PrecioIva(double precio){
        return precio*1.19;
    }
}
