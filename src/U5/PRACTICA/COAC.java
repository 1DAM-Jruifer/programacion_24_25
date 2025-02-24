package U5.PRACTICA;
import java.util.*;
class COAC {
    private AgrupacionOficial[] agrupaciones;
    private int numAgrupaciones;

    public COAC(int maxAgrupaciones) {
        this.agrupaciones = new AgrupacionOficial[maxAgrupaciones];
        this.numAgrupaciones = 0;
    }

    public COAC() {

    }

    public void inscribirAgrupacion(AgrupacionOficial agrupacion) {
        if (numAgrupaciones < agrupaciones.length) {
            agrupaciones[numAgrupaciones++] = agrupacion;
        } else {
            System.out.println("No se puede inscribir más agrupaciones.");
        }
    }

    public boolean eliminarAgrupacion(AgrupacionOficial agrupacion) {
        for (int i = 0; i < numAgrupaciones; i++) {
            if (agrupaciones[i].equals(agrupacion)) {
                for (int j = i; j < numAgrupaciones - 1; j++) {
                    agrupaciones[j] = agrupaciones[j + 1];
                }
                agrupaciones[--numAgrupaciones] = null;
                return true;
            }
        }
        return false;
    }

    public void ordenarPorPuntos() {
        Arrays.sort(agrupaciones, 0, numAgrupaciones, AgrupacionOficial.compararPorPuntos);
    }

    public void ordenarPorNombre() {
        Arrays.sort(agrupaciones, 0, numAgrupaciones);
    }

    public void ordenarPorAutor() {
        Arrays.sort(agrupaciones, 0, numAgrupaciones, Agrupacion.compararPorAutor);
    }
}
