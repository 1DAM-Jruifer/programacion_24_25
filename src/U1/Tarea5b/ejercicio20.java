//Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), el tipo de IVA aplicado
// (general, reducido o superreducido) y el código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
// Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción,
// el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos,
// aunque los números no estén tabulados.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce una base imponible: ");
        double base = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Inttroduzca el tipo de IVA: ");


        String IVA = teclado.nextLine();


        System.out.println("Introduca el codigo promocional: ");


        String promo = teclado.next();


        int numIVA = 0;


        switch (IVA) {
            case "general":
                numIVA = 21;
                break;
            case "reducido":
                numIVA = 10;
                break;
            case "Superreducido":
                numIVA = 4;
                break;
        }


        double iva = base * numIVA / 100;
        double preciosindescuento = base + iva;




        double numCodigo = 0;


        switch (promo) {
            case "nopro":
                break;
            case "mitad":
                numCodigo = preciosindescuento / 2;
            case "meno5":
                numCodigo = preciosindescuento - 5;
            case "5porc":
                numCodigo = preciosindescuento * 0.05;
                break;
        }
        double total = preciosindescuento - numCodigo;


        System.out.println("Base imponible: " + base);




        System.out.println("IVA:" + iva);


        System.out.println("Precio con IVA" + numIVA);


        System.out.println("cod promo: " + promo);


        System.out.println("Total: " + total);

    }

}
