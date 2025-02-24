package U5.PRACTICA;
import java.util.*;
abstract class Agrupacion implements Comparable<Agrupacion> {

    public static Comparator<? super AgrupacionOficial> compararPorAutor;
    private static int totalAgrupaciones = 0;
    protected String nombre, autor, autorMusica, autorLetras, tipo;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        totalAgrupaciones++;
    }

    public abstract void cantarLaPresentacion();

    public abstract void hacerTipo();

    public static int getTotalAgrupaciones() {
        return totalAgrupaciones;
    }

    @Override
    public int compareTo(Agrupacion o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return nombre + " - " + autor + " - " + tipo;
    }

    interface Callejera {
        void amoAEscucha();
    }
}
