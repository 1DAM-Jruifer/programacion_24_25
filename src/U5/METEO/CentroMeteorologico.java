package U5.METEO;

import java.util.Arrays;

class CentroMeteorologico {
    private int numregistros;
    private RegistroMeteorologico[] registros;
    private int pronosticos;

    public CentroMeteorologico(int maxRegistros){
        this.registros = new RegistroMeteorologico[maxRegistros];
        this.pronosticos = 0;
        this.numregistros = 0;
   }

   public void agregarRegistro(RegistroMeteorologico registro){
        if (numregistros < registros.length){
            registros[numregistros++] = registro;
        }else {
            System.out.println("No se pueden añadir más regstros.");
        }
   }

   public boolean eliminarRegistro(RegistroMeteorologico registro){
        for (int i = 0; i < numregistros; i++) {
            if (registros[i].equals(registro)){
                for (int j = i; j < numregistros -1; j++){
                    registros[j] = registros[j +1];
                }
                registros[--numregistros] = null;
                return true;
            }
        }
        return false;
   }

   public void buscarPorFecha(){
       Arrays.sort(registros, 0, numregistros, RegistroMeteorologico.compararFecha);
   }
}

