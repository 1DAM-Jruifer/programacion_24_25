package U5;
//EJERCICIO DEL 1 AL 4 DE HERENCIA
public class Ejercicio1 {
    class Hora {
        protected int hora;
        protected int minuto;

        public Hora(int hora, int minuto) {
            setHora(hora);
            setMinutos(minuto);
        }

        public void inc() {
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora = (hora + 1) % 24;
            }
        }

        public void setMinutos(int valor) {
            if (valor >= 0 && valor < 60) {
                this.minuto = valor;
            }
        }

        public void setHora(int valor) {
            if (valor >= 0 && valor < 24) {
                this.hora = valor;
            }
        }

        public String toString() {
            return String.format("%02d:%02d", hora, minuto);
        }
    }

    class Hora12 extends Hora {
        private String periodo;

        public Hora12(int hora, int minuto, String periodo) {
            super((hora >= 1 && hora <= 12) ? hora : 1, minuto);
            this.periodo = ("am".equalsIgnoreCase(periodo) || "pm".equalsIgnoreCase(periodo)) ? periodo : "am";
        }

        public void cambiarPeriodo() {
            this.periodo = this.periodo.equals("am") ? "pm" : "am";
        }

        @Override
        public void inc() {
            super.inc();
            if (hora == 12 && minuto == 0) {
                cambiarPeriodo();
            }
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d %s", hora, minuto, periodo);
        }
    }

    class HoraExacta extends Hora {
        private int segundo;

        public HoraExacta(int hora, int minuto, int segundo) {
            super(hora, minuto);
            setSegundo(segundo);
        }

        public void setSegundo(int valor) {
            if (valor >= 0 && valor < 60) {
                this.segundo = valor;
            }
        }

        @Override
        public void inc() {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                super.inc();
            }
        }

        public boolean equals(HoraExacta otra) {
            return this.hora == otra.hora && this.minuto == otra.minuto && this.segundo == otra.segundo;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        }
    }
}
