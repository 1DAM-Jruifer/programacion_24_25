//Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
// El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate.
//La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco;
// la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Elija un sabor: (manzana, fresa o chocolate)");
        String sabor = teclado.next();


        int precio = 0;
        double nata = 2.50;
        double nombre = 2.75;


        double total = 0;


        switch (sabor) {
            case "chocolate":
                System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
                String color = teclado.next();
                if (color.equalsIgnoreCase("negro")) {
                    precio = 14;
                } else if (color.equalsIgnoreCase("blanco")) {
                    precio = 15;
                }
                break;
            case "manzana":
                precio = 18;
                break;


            case "fresa":
                precio = 16;
                break;}


        System.out.println("¿Quieres nata? (si o no):");
        String natita = teclado.next();


        if (natita.equalsIgnoreCase("si")) {
            total = nata;
        }


        System.out.println("¿Quieres nombre? (si o no):");
        String nombrecito = teclado.next();


        if (nombrecito.equalsIgnoreCase("si")) {
            total += nombre;
        }
        total = precio + total;
        System.out.println("Total:" + total);


    }

}
