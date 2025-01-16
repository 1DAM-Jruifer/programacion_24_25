//Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
// Para ello hacer una clase Bombilla con una variable privada que indique si está encencida o apagada
//Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas
// se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas,
// según estuvieran antes del percance. Cada bombilla se enciende o se apagan individualmente,
// pero solo responde si su interruptor particular está activado y además hay luz general.

package U4.Objetos;

public class Parte8 {
    private boolean encendida;
    private boolean interruptorActivado;

    public Parte8() {
        this.encendida = false; // Inicialmente apagada
        this.interruptorActivado = true; // Por defecto, el interruptor está activado
    }

    public void encender() {
        if (interruptorActivado) {
            encendida = true;
            System.out.println("Bombilla encendida.");
        } else {
            System.out.println("No se puede encender. El interruptor está desactivado.");
        }
    }

    public void apagar() {
        encendida = false;
        System.out.println("Bombilla apagada.");
    }

    public String estado() {
        return encendida ? "Encendida" : "Apagada";
    }

    public void activarInterruptor() {
        interruptorActivado = true;
        System.out.println("Interruptor activado.");
    }

    public void desactivarInterruptor() {
        interruptorActivado = false;
        System.out.println("Interruptor desactivado.");
    }

}
