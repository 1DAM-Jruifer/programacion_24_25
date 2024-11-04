//Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:
//
//verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
//
//falso. En caso contrario.
//
//Escribe el código necesario para inicializar "jasp" en una línea.

package U1.Tarea7;

public class ejercicio2 {
    public static void main(String[] args) {
        int edad = 27;
        int nivel_de_estudios = 4;
        double ingresos = 30000;


        boolean jasp = (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000);


        System.out.println("¿Es jasp?: " + jasp);
    }

}
