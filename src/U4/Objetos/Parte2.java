//sobrecargar los constructores para que permitan crear objetos:
//solo con el saldo inicial, no serán necesarios los datos del titular.
// Por defecto el límite de descubierto será 0 euros.
//con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.

package U4.Objetos;

public class Parte2{
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    private String dni;
    private static String banco = "Banco Ejemplo"; // Nombre único del banco

    // Constructor por defecto con saldo y límite de descubierto
    public Parte2(double saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = 0;
        this.nombre = "Desconocido";
        this.dni = "Desconocido";
    }

    // Constructor con saldo inicial, límite de descubierto y DNI
    public Parte2(double saldo, double limiteDescubierto, String dni) {
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
        this.dni = dni;
        this.nombre = "Desconocido";
    }

    // Constructor con nombre y dni (como en la actividad 1)
    public Parte2(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
    }
}