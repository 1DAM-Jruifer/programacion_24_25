package U5.PRACTICA;

public class Coro extends AgrupacionOficial{
    private int numBandurrias, numGuitarras;
    private String nombre;
    private String tipo;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numBandurrias, int numGuitarras, int puntos) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    @Override
    public void cantarLaPresentacion() {
        System.out.println("Cantando la presentación del Coro " + nombre);
    }

    @Override
    public void hacerTipo() {
        System.out.println("El Coro " + nombre + " va de " + tipo);
    }

    @Override
    public void caminitoDelFalla() {
        System.out.println("El Coro " + nombre + " va caminito del Falla");
    }
}
