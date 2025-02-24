package U5.PRACTICA;

public class Main {
    public static void main(String[] args) {
        COAC coac = new COAC();
        Coro coro = new Coro("Los Locos", "Pedro Sanchez", "Pablo Motos", "Jordi Wild", "Pirata", 3, 2, 90);
        coac.inscribirAgrupacion(coro);

        Integrante integrante1 = new Integrante(1, "Broncano", 33, "Torremolinos");
        coro.insertarIntegrante(integrante1);

        coro.cantarLaPresentacion();
        coro.hacerTipo();
        coro.caminitoDelFalla();

        System.out.println("Total agrupaciones: " + Agrupacion.getTotalAgrupaciones());
    }
}
