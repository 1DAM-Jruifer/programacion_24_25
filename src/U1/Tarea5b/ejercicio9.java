//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese el día de nacimiento (1-31): ");
        int dia = teclado.nextInt();


        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = teclado.nextInt();


        String horoscopo = obtenerHoroscopo(dia, mes);


        if (horoscopo != null) {
            System.out.println("Tu horóscopo es: " + horoscopo);
        } else {
            System.out.println("Fecha inválida. Por favor, verifica los valores ingresados.");
        }
    }


    public static String obtenerHoroscopo(int dia, int mes) {
        switch (mes) {
            case 1:
                return (dia <= 19) ? "Capricornio" : "Acuario";
            case 2:
                return (dia <= 18) ? "Acuario" : "Piscis";
            case 3:
                return (dia <= 20) ? "Piscis" : "Aries";
            case 4:
                return (dia <= 19) ? "Aries" : "Tauro";
            case 5:
                return (dia <= 20) ? "Tauro" : "Géminis";
            case 6:
                return (dia <= 20) ? "Géminis" : "Cáncer";
            case 7:
                return (dia <= 22) ? "Cáncer" : "Leo";
            case 8:
                return (dia <= 22) ? "Leo" : "Virgo";
            case 9:
                return (dia <= 22) ? "Virgo" : "Libra";
            case 10:
                return (dia <= 22) ? "Libra" : "Escorpio";
            case 11:
                return (dia <= 21) ? "Escorpio" : "Sagitario";
            case 12:
                return (dia <= 21) ? "Sagitario" : "Capricornio";
            default:
                return null; // Fecha inválida
        }
    }
}

