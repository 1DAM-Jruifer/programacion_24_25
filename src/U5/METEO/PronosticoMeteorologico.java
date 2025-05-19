package U5.METEO;
import java.util.*;
abstract class PronosticoMeteorologico extends RegistroMeteorologico{
    private final String Fechapronostico;
    private final int probabilidadlluvia;
    private final String fuentepronostico;
    private int temperatura;
    private int velocidad;

    public PronosticoMeteorologico(int temperatura, int velocidad, String Fechapronostico, int probabilidadlluvia, String fuentepronostico){
        super(temperatura, velocidad);
        this.Fechapronostico = Fechapronostico;
        this.probabilidadlluvia = probabilidadlluvia;
        this.fuentepronostico = fuentepronostico;
    }

    interface Analizable{
        void analizarTendencia();
        void ebentoExtremo();
    }

    public String getFechapronostico() {
        return Fechapronostico;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getProbabilidadlluvia() {
        return probabilidadlluvia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getFuentepronostico() {
        return fuentepronostico;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
