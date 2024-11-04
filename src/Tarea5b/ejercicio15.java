//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel.
// El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
// Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos.
// A continuación se listan las preguntas del test.

package Tarea5b;
import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Este es un test que te dira si te es infiel");
        int puntuacion = 0 ;
        System.out.println(" Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        int respuesta = teclado.nextInt();
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        System.out.println(" Ha aumentado sus gastos de vestuario");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        respuesta = teclado.nextInt();
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        System.out.println(" Ha perdido el interés que mostraba anteriormente por ti");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println(" Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println(" No te deja que mires la agenda de su teléfono móvil");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println(" A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println("  Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println(" Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println(" Has notado que últimamente se perfuma más");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println(" (1) Verdadero");
        System.out.println(" (2) Falso");
        if(respuesta==1){
            puntuacion = puntuacion + 3;
        }
        respuesta = teclado.nextInt();
        if (10 >= puntuacion) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (22 >= puntuacion) {
            System.out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (22<= puntuacion); {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }

}
