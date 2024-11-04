package Tarea6;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor del radio: ");
        double radio = sc.nextDouble();

        System.out.println("Elige una opción:");
        System.out.println("1. Calcular diámetro");
        System.out.println("2. Calcular perímetro");
        System.out.println("3. Calcular área");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                double diametro = 2 * radio;
                System.out.println("El diámetro es: " + diametro);
                break;
            case 2:
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El perímetro es: " + perimetro);
                break;
            case 3:
                double area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área es: " + area);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}
