//Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
// concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
// (down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
//Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al inicio,
// el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se sobrepasa uno de los dos límites,
// la frecuencia sintonizada debe pasar a ser la del extremo contrario.

package U4.Objetos;

public class Parte7 {
    private double frecuencia;
    private final double MIN_FRECUENCIA = 80.0;
    private final double MAX_FRECUENCIA = 108.0;
    private final double SALTO_FRECUENCIA = 0.5;

    public Parte7() {
        this.frecuencia = MIN_FRECUENCIA;
    }

    public void subir() {
        frecuencia += SALTO_FRECUENCIA;
        if (frecuencia > MAX_FRECUENCIA) {
            frecuencia = MIN_FRECUENCIA; // Si supera el límite, se reinicia al mínimo
        }
    }

    public void bajar() {
        frecuencia -= SALTO_FRECUENCIA;
        if (frecuencia < MIN_FRECUENCIA) {
            frecuencia = MAX_FRECUENCIA; // Si baja del límite inferior, se reinicia al máximo
        }
    }

    public void mostrarFrecuencia() {
        System.out.printf("Frecuencia actual: %.1f MHz%n", frecuencia);
    }
}
