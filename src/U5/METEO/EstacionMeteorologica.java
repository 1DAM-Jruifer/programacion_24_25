package U5.METEO;
import java.util.*;
abstract class EstacionMeteorologica {
    protected int altitud;
    protected String id, ubicacion, sensores;

    public  EstacionMeteorologica(String id, String ubicacion, int altitud, String sensores){
        super();
        this.altitud = altitud;
        this.id = id;
        this.ubicacion = ubicacion;
        this.sensores = sensores;

    }


}
