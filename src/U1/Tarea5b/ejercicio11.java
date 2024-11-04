//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto.
// El programa mostrará al final la calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan
// de conocimientos en las diferentes asignaturas del curso.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int score = 0;


        String[][] questions = {
                {"¿Que objeto transforma la corriente alterna en corriente continua?", "A) Grafica", "B) RAM", "C) Fuente", "D) Caja", "C"},
                {"¿Qué objeto almacena memoria caché?", "A) ROM", "B) RAM", "C) Grafica", "D) Altavoces", "B"},
                {"¿Que objeto almacena memoria de forma permanente?", "A) RAM", "B) SSD", "C) ROM", "D) Microfono", "B"},
                {"¿Que lenguaje utilizamos en programación", "A) Binario", "B) De signos", "C) Oral", "D) Abecedario", "A"},
                {"¿Que objeto utilizamos para controlar las acciones de un pc?", "A) Monitor", "B) Teclado", "C) Movil", "D) Microfono", "B"},
                {"¿Que objeto utilizamos para visualizar información del pc?", "A) Monitor", "B) Cascos", "C) Grafica", "D) Fuente alimentación", "A"},
                {"¿Qué objeto quita calor del pc?", "A) Caja", "B) Grafica", "C) Ventiladores", "D) Fuente", "C"},
                {"¿Que utilizamos para modificar el aspecto de un html?", "A) Firefox", "B) Paint", "C) CSS", "D) Valorant", "C"},
                {"¿Que utilizamos para crear paginas online?", "A) Trivago", "B) Una puerta", "C) Html", "D) Google", "C"},
                {"¿Que utilizamos para conocer un dispositivo en concreto?", "A) WIFI", "B) IP", "C) Caixa", "D) APP BBVA", "B"}
        };


        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Tu respuesta: ");
            String answer = teclado.nextLine().toUpperCase();
            if (answer.equals(questions[i][5])) {
                score++;
            }
            System.out.println();
        }


        System.out.println("Tu calificación es: " + score + "/" + questions.length);
        teclado.close();
    }

}
