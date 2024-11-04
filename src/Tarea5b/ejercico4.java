package Tarea5b;
import java.util.Scanner;
public class ejercico4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;


        System.out.print("Introduce un número del 1 al 7: ");
        dia = teclado.nextInt();


        String nombreDia;


        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número no válido. Debe estar entre 1 y 7.";
        }


        System.out.println(nombreDia);


        System.out.println("Introduce un numero");
        int primernumero = teclado.nextInt();


        if (primernumero < 40){
            System.out.println(primernumero * 12);
        }


        else {System.out.println(primernumero*16);
        }




    }

}
