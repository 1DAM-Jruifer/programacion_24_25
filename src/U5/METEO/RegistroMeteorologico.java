package U5.METEO;
import java.util.*;
abstract class RegistroMeteorologico {
    public static Comparator<? super RegistroMeteorologico> compararFecha;
    protected String fecha, estacion;
    
    public RegistroMeteorologico(String fecha, String estacion){
        this.fecha = fecha;
        this.estacion = estacion;
        
    }

    public RegistroMeteorologico() {
        
    }

    public RegistroMeteorologico(int temperatura, int velocidad) {
    }
}
