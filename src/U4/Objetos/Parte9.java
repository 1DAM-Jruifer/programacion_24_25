package U4.Objetos;
import java.util.ArrayList;
import java.util.List;

public class Parte9 {

    public class Maquinista {
        private String nombreCompleto;
        private String dni;
        private double sueldoMensual;
        private String rango;

        public Maquinista(String nombreCompleto, String dni, double sueldoMensual, String rango) {
            this.nombreCompleto = nombreCompleto;
            this.dni = dni;
            this.sueldoMensual = sueldoMensual;
            this.rango = rango;
        }
    }

    public class Mecanico {
        private String nombreCompleto;
        private String telefono;
        private String especialidad;

        public Mecanico(String nombreCompleto, String telefono, String especialidad) {
            this.nombreCompleto = nombreCompleto;
            this.telefono = telefono;
            this.especialidad = especialidad;
        }
    }

    public class JefeEstacion {
        private String nombreCompleto;
        private String dni;

        public JefeEstacion(String nombreCompleto, String dni) {
            this.nombreCompleto = nombreCompleto;
            this.dni = dni;
        }
    }

    class Vagon {
        private int capacidadMaxima;
        private int capacidadActual;
        private String tipoMercancia;

        public Vagon(int capacidadMaxima, int capacidadActual, String tipoMercancia) {
            this.capacidadMaxima = capacidadMaxima;
            this.capacidadActual = capacidadActual;
            this.tipoMercancia = tipoMercancia;
        }
    }

    public class Locomotora {
        private String matricula;
        private int potenciaMotor;
        private int anioFabricacion;
        private Mecanico mecanico;

        public Locomotora(String matricula, int potenciaMotor, int anioFabricacion, Mecanico mecanico) {
            this.matricula = matricula;
            this.potenciaMotor = potenciaMotor;
            this.anioFabricacion = anioFabricacion;
            this.mecanico = mecanico;
        }
    }

    public class Tren {
        private Locomotora locomotora;
        private List<Vagon> vagones;
        private Maquinista maquinista;

        public Tren(Locomotora locomotora, Maquinista maquinista) {
            this.locomotora = locomotora;
            this.maquinista = maquinista;
            this.vagones = new ArrayList<>();
        }

        public boolean agregarVagon(Vagon vagon) {
            if (vagones.size() < 5) {
                vagones.add(vagon);
                return true;
            }
            return false;
        }
    }
}
