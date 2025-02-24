package U4.PRACTICA;

import java.time.LocalDate;

public class Empleado{

        private String datos;
        private int idEmpleados;
        private int telefono;
        private LocalDate fecha;
        private Tipo tipoempleado;

    public Empleado(String datos, int idEmpleados, int telefono, LocalDate fecha, Tipo tipoempleado) {
        this.datos = datos;
        this.idEmpleados = idEmpleados;
        this.telefono = telefono;
        this.fecha = fecha;
        this.tipoempleado = tipoempleado;
    }

    public Empleado(String datos, LocalDate fecha, int telefono, int idEmpleados) {
        this.datos = datos;
        this.fecha = fecha;
        this.telefono = telefono;
        this.idEmpleados = idEmpleados;
        this.tipoempleado = Tipo.reponedor;
    }

    public void mostrarInfo(){
            System.out.println("Mostar los datos del empleado" + datos);
            System.out.println("Mostar el idEmpleados" + idEmpleados);
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipoempleado(Tipo tipoempleado) {
        this.tipoempleado = tipoempleado;
    }

    public String getDatos() {
        return datos;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public int getTelefono() {
        return telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Tipo getTipoempleado() {
        return tipoempleado;
    }
}



