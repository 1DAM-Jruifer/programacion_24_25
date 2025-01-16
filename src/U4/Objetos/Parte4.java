//Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
// Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
// Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)

package U4.Objetos;

public class Parte4 {

    private double saldo;
    private double limiteDescubierto;
    public String nombre;  // Atributo público
    private String dni;    // Atributo privado

    private static String banco = "Banco Ejemplo";  // Banco común para todas las cuentas

    public Parte4(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad <= saldo + limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Operación realizada: se han sacado " + cantidad + " euros.");
            return true;
        } else {
            System.out.println("No se puede sacar esa cantidad, saldo insuficiente.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Operación realizada: se han ingresado " + cantidad + " euros.");
        } else {
            System.out.println("Cantidad a ingresar debe ser positiva.");
        }
    }


    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println("Límite de descubierto: " + limiteDescubierto + " euros");
        System.out.println("Banco: " + banco);  // Mostrar el banco
    }


    public static void modificarNombreBanco(String nuevoNombre) {
        banco = nuevoNombre;
    }


    public static String obtenerNombreBanco() {
        return banco;
    }

    public static void main(String[] args) {

        Parte4 cuenta1 = new Parte4("Juan", "12345678A");
        cuenta1.mostrarInformacion();

        Parte4 cuenta2 = new Parte4("Ana", "87654321B");
        cuenta2.mostrarInformacion();

        Parte4.modificarNombreBanco("Nuevo Banco");


        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}