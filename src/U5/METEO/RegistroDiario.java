package U5.METEO;
import java.util.*;
abstract class RegistroDiario extends RegistroMeteorologico{
    protected int temperatura;
    protected int humedad;
    protected int precipitacion;
    protected int velocidad;

    public RegistroDiario(String fecha, String estacion, int temperatura, int humedad, int precipitacion, int velocidad){
        super();
        this.fecha = fecha;
        this.estacion = estacion;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.precipitacion = precipitacion;
        this.velocidad = velocidad;
    }

    interface Analizable{
        void analizarTendencia();
        void ebentoExtremo();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(int precipitacion) {
        this.precipitacion = precipitacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
