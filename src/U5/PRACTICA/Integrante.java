package U5.PRACTICA;
import java.util.*;
class Integrante {
    private int numeroParticipante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numeroParticipante, String nombre, int edad, String localidad) {
        this.numeroParticipante = numeroParticipante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return numeroParticipante + " - " + nombre + " - " + edad + " años - " + localidad;
    }
}

