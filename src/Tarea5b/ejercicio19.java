// Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos),
// calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
// Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h

package Tarea5b;
import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.print("Introduce un día de la semana (lunes a viernes): ");
        String dia = teclado.nextLine().toLowerCase();




        System.out.print("Introduce la hora (formato HH:MM): ");
        String hora = teclado.nextLine();




        int minutosFaltantes = calcularMinutosHastaFinDeSemana(dia, hora);
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");




    }


    public static int calcularMinutosHastaFinDeSemana(String dia, String hora) {


        int diaIndex = switch (dia) {
            case "lunes" -> 0;
            case "martes" -> 1;
            case "miércoles" -> 2;
            case "jueves" -> 3;
            case "viernes" -> 4;
            default -> -1;
        };


        String[] partesHora = hora.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);




        int minutosActuales = diaIndex * 24 * 60 + horas * 60 + minutos;


        int minutosFinSemana = 4 * 24 * 60 + 15 * 60;


        return minutosFinSemana - minutosActuales;
    }

}
