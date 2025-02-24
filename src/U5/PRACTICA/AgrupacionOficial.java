package U5.PRACTICA;
import java.util.*;
abstract class AgrupacionOficial {
    protected int puntos;
    protected List<Integrante> integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntos) {
        super();
        this.puntos = puntos;
        this.integrantes = new ArrayList<>();
    }

    public void insertarIntegrante(Integrante i) {
        integrantes.add(i);
    }

    public boolean eliminarIntegrante(Integrante i) {
        return integrantes.remove(i);
    }

    public abstract void cantarLaPresentacion();

    public abstract void hacerTipo();

    public abstract void caminitoDelFalla();

    public static Comparator<AgrupacionOficial> compararPorPuntos = Comparator.comparingInt(a -> a.puntos);
}
