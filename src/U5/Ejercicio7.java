package U5;
//EJERCICIO DEL 7 AL 8 DE HERENCIA
enum Unidades {
    CM, M;
}
public class Ejercicio7 {

    class Caja {
        private final double ancho;
        private final double alto;
        private final double fondo;
        private final Unidades unidad;
        private String etiqueta;

        public Caja(double ancho, double alto, double fondo, Unidades u) {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
            this.unidad = u;
        }

        public double getVolumen() {
            double factor = (unidad == Unidades.CM) ? 0.01 : 1.0;
            return (ancho * factor) * (alto * factor) * (fondo * factor);
        }

        public void setEtiqueta(String etiqueta) {
            this.etiqueta = etiqueta;
        }

        @Override
        public String toString() {
            return String.format("Caja de %.2f x %.2f x %.2f %s, Volumen: %.4f m3, Etiqueta: %s",
                    ancho, alto, fondo, unidad, getVolumen(), etiqueta);
        }
    }

    class CajaCarton extends Caja {
        private static double superficieTotalCarton = 0;
        private final int etiquetaNumerica;

        public CajaCarton(double ancho, double alto, double fondo, int etiquetaNumerica) {
            super(ancho, alto, fondo, Unidades.CM);
            this.etiquetaNumerica = etiquetaNumerica;
            double superficie = 2 * (ancho * alto + ancho * fondo + alto * fondo);
            superficieTotalCarton += superficie;
        }

        @Override
        public double getVolumen() {
            return super.getVolumen() * 0.8;
        }

        public static double getSuperficieTotalCarton() {
            return superficieTotalCarton;
        }

        @Override
        public String toString() {
            return String.format("Caja de cartón %.2f x %.2f x %.2f cm, Volumen efectivo: %.4f m3, Etiqueta ID: %d",
                    super.getVolumen() * 100, super.getVolumen() * 100, super.getVolumen() * 100, getVolumen(), etiquetaNumerica);
        }
    }
}
