package U4.PRACTICA;

    public class producto{
        private String nombreProducto;
        private double precioProducto;
        private String[] tipoProducto = {"frutas", "verduras", "lacteos", "panaderia", "carne"};
        private int unidades;

        public producto(String nombreProducto, double precioProducto, String[] tipoProducto, int unidades){
            this.nombreProducto = nombreProducto;
            this.precioProducto = precioProducto;
            this.tipoProducto = tipoProducto;
            this.unidades = unidades;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public double getPrecioProducto() {
            return precioProducto;
        }

        public String[] getTipoProducto() {
            return tipoProducto;
        }

        public int getUnidades() {
            return unidades;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public void setPrecioProducto(double precioProducto) {
            this.precioProducto = precioProducto;
        }

        public void setTipoProducto(String[] tipoProducto) {
            this.tipoProducto = tipoProducto;
        }

        public void setUnidades(int unidades) {
            this.unidades = unidades;
        }
    }
