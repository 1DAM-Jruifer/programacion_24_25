//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
//Cada clase está compuesta por 5 alumnos.
//Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre, luego, las del segundo,
//y luego, las del tercero. Debemos mostrar, al final,
//la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos (que se lee por teclado).
//(Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los alumnos).

package U3.Arrays;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] trimestre1 = new int[5];
        int[] trimestre2 = new int[5];
        int[] trimestre3 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca la nota del alumno " + (i + 1) + " para el primer trimestre: ");
            trimestre1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca la nota del alumno " + (i + 1) + " para el segundo trimestre: ");
            trimestre2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca la nota del alumno " + (i + 1) + " para el tercer trimestre: ");
            trimestre3[i] = scanner.nextInt();
        }

        System.out.print("Introduzca la posición del alumno (1 a 5) para ver su media: ");
        int pos = scanner.nextInt();

        for (int trimestre = 0; trimestre < 3; trimestre++) {
            int sumaNotas = 0;
            for (int i = 0; i < 5; i++) {
                if (trimestre == 0) sumaNotas += trimestre1[i];
                if (trimestre == 1) sumaNotas += trimestre2[i];
                if (trimestre == 2) sumaNotas += trimestre3[i];
            }
            double mediaTrimestre = sumaNotas / 5.0;
            System.out.println("La media del grupo en el trimestre " + (trimestre + 1) + " es: " + mediaTrimestre);
        }

        double sumaNotasAlumno = 0;
        if (pos >= 1 && pos <= 5) {
            sumaNotasAlumno += trimestre1[pos - 1];  // pos - 1 para ajustarlo al índice 0-4
            sumaNotasAlumno += trimestre2[pos - 1];
            sumaNotasAlumno += trimestre3[pos - 1];
            double mediaAlumno = sumaNotasAlumno / 3.0;
            System.out.println("La media del alumno " + pos + " es: " + mediaAlumno);
        }
    }
}

