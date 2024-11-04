//a tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho.
// El precio base de una bandera es de un céntimo de euro el centímetro cuadrado.
// Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño.
// Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.println("Seleccione la altura de la bandera en cm: ");
        double cm = teclado.nextInt();
        System.out.println("Seleccione la anchura de la bandera: ");
        double anchura = teclado.nextInt();
        System.out.println("Quiere su escudo bordado? (si/no): ");
        System.out.println("1- si (+2,50)");
        System.out.println("2- no (+0)");
        double escudo = teclado.nextInt();
        System.out.println("Gracias aqui tiene el desglose de su compra: ");
        double preciob = anchura * cm;
        System.out.println("Su bandera es de: " + cm * anchura + "cm2:" + preciob + "$");
        System.out.println("Sus gastos de envio son de 3,25$");
        double envio = 3.25;
        System.out.println("Total: " + (preciob + envio) /100);

    }

}
