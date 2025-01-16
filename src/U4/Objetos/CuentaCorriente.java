//Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
// saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero),
// nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
//
//Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros.
//Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto.
//Ingresar dinero: se incrementa el saldo.
//Mostrar información: muestra la información de la cuenta corriente.

package U4.Objetos;

public class CuentaCorriente {

    private double saldo;
    private double limiteDescubierto;
    private String nombreTitular;
    private String dniTitular;

    public CuentaCorriente(String nombre, String dni) {
        this.nombreTitular = nombre;
        this.dniTitular = dni;
        this.saldo = 0.0; // El saldo inicial es 0
        this.limiteDescubierto = -50.0; // El límite de descubierto es de -50 euros
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad <= saldo - limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Operación realizada con éxito. Has sacado " + cantidad + " euros.");
            return true;
        } else {
            System.out.println("No es posible realizar la operación. No tienes suficiente saldo.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + " euros. El saldo actual es: " + saldo);
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta corriente:");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println("Límite de descubierto: " + limiteDescubierto + " euros");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }
}
