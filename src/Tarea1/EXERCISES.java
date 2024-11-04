package Tarea1;

import java.util.Scanner;

public class EXERCISES {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elija un sabor: (manzana, fresa o chocolate)");
        String sabor = teclado.next();

        int precio = 0;
        double nata = 2.50;
        double nombre = 2.75;

        double total = 0;

        switch (sabor) {
            case "chocolate":
                System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
                String color = teclado.next();
                if (color.equalsIgnoreCase("negro")) {
                    precio = 14;
                } else if (color.equalsIgnoreCase("blanco")) {
                    precio = 15;
                }
                break;
            case "manzana":
                precio = 18;
                break;

            case "fresa":
                precio = 16;
                break;}

                System.out.println("¿Quieres nata? (si o no):");
                String natita = teclado.next();

                if (natita.equalsIgnoreCase("si")) {
                    total = nata;
                }

        System.out.println("¿Quieres nombre? (si o no):");
        String nombrecito = teclado.next();

        if (nombrecito.equalsIgnoreCase("si")) {
            total += nombre;
        }
            total = precio + total;
        System.out.println("Total:" + total);

    }
}
