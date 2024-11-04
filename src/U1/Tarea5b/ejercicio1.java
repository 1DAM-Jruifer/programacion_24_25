//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce un día de la semana (lunes, martes, miércoles, jueves, viernes): ");
        String dia = teclado.nextLine();


        String asignatura;


        switch (dia) {
            case "lunes":
                asignatura = "Base de datos";
                break;
            case "martes":
                asignatura = "Base de datos";
                break;
            case "miércoles":
                asignatura = "IPE";
                break;
            case "jueves":
                asignatura = "Programación";
                break;
            case "viernes":
                asignatura = "Base de datos";
                break;
            default:
                asignatura = "Día no válido. Por favor, introduce un día de la semana correcto.";
        }


        System.out.println("La asignatura que toca a primera hora el " + dia + " es: " + asignatura);


    }
}
