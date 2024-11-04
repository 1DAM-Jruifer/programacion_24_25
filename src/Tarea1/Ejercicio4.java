package Tarea1;

import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione el cargo del empleado:");
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Senior");
        System.out.println("3 - Jefe de Proyecto");
        int cargo = teclado.nextInt();


        System.out.println("Ingrese los días que ha estado de viaje visitando clientes:");
        int diasViaje = teclado.nextInt();


        System.out.println("Seleccione el estado civil:");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        int estadoCivil = teclado.nextInt();

        double sueldoBase = 0;
        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("Cargo no válido.");
                return;
        }

        double dietas = diasViaje * 30;

        double sueldoBruto = sueldoBase + dietas;

        double irpf = (estadoCivil == 1) ? 0.25 : 0.20;
        double cantidadIRPF = sueldoBruto * irpf;

        double sueldoNeto = sueldoBruto - cantidadIRPF;

        System.out.println("\n--- Nómina del Empleado ---");
        System.out.println("Sueldo Base: " + sueldoBase + " euros");
        System.out.println("Dietas (por " + diasViaje + " días de viaje): " + dietas + " euros");
        System.out.println("Sueldo Bruto: " + sueldoBruto + " euros");
        System.out.println("IRPF (" + (irpf * 100) + "%): " + cantidadIRPF + " euros");
        System.out.println("Sueldo Neto: " + sueldoNeto + " euros");


    }
}
