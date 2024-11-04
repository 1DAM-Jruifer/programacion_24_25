//Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
// Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".

package Tarea6;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        String nombreMes = "";
        switch (mes) {
            case 1:  nombreMes = "enero"; break;
            case 2:  nombreMes = "febrero"; break;
            case 3:  nombreMes = "marzo"; break;
            case 4:  nombreMes = "abril"; break;
            case 5:  nombreMes = "mayo"; break;
            case 6:  nombreMes = "junio"; break;
            case 7:  nombreMes = "julio"; break;
            case 8:  nombreMes = "agosto"; break;
            case 9:  nombreMes = "septiembre"; break;
            case 10: nombreMes = "octubre"; break;
            case 11: nombreMes = "noviembre"; break;
            case 12: nombreMes = "diciembre"; break;
            default: nombreMes = "Mes no válido"; break;
        }

        System.out.println("El mes es: " + nombreMes);
    }

}
