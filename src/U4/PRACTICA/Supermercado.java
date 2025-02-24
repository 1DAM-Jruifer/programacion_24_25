package U4.PRACTICA;

import java.util.Arrays;

public class Supermercado{
        private String nombre;
        private String productos;
        private String empleados;

        public Supermercado(String nombre, String productos, String empleados) {
            this.nombre = nombre;
            this.productos = productos;
            this.empleados = empleados;
        }

    public String getNombre() {
        return nombre;
    }

    public String getProductos() {
        return productos;
    }

    public String getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setEmpleados(String empleados) {
        this.empleados = empleados;
    }
}

