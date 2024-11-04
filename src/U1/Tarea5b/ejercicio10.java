//Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la hora (0-23): ");
        int horas = teclado.nextInt();


        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = teclado.nextInt();


        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora o minutos inválidos. Por favor, verifica los valores ingresados.");
        } else {
            int segundosHastaMedianoche = calcularSegundosHastaMedianoche(horas, minutos);
            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para medianoche.");
        }


    }


    public static int calcularSegundosHastaMedianoche(int horas, int minutos) {

        int segundosPasados = (horas * 3600) + (minutos * 60);



        int segundosEnUnDia = 24 * 3600;



        return segundosEnUnDia - segundosPasados;
    }

}
