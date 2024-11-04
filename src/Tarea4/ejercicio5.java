package Tarea4;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class ejercicio5 {
    public static void main(String[] args) {


        LocalTime horaActual = LocalTime.now();


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("La hora actual es: " + horaActual.format(formato));
    }

}
