//Actividad 6: Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. Los bancos tienen las siguientes restricciones:
//Siempre tienen que tener un nombre, que no puede ser modificado
//Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros al crearse.
//El capital y la dirección de un banco son modificables.
//Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
// Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que pertenece
// (cambiar de banco, mostrar la info de la cuenta, incluidos los datos del banco si lo tiene vinculado).
// Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún banco.

package U4.Objetos;

public class Banco {
    private final String nombre;
    private double capital;
    private String direccion;


    public Banco(String nombre, String direccion) {
        this.nombre = nombre;
        this.capital = 5.2;  // Capital por defecto
        this.direccion = direccion;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public String getDireccion() {
        return direccion;
    }
}

 class Cuenta {
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    private String dni;
    private static String banco = "Banco Central";
    private Banco bancoAsociado;  // Relación con el Banco

    public Cuenta(String nombre, String dni, Banco bancoAsociado) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.bancoAsociado = bancoAsociado;
    }

    public void cambiarDeBanco(Banco nuevoBanco) {
        this.bancoAsociado = nuevoBanco;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Límite de descubierto: " + limiteDescubierto);
        if (bancoAsociado != null) {
            System.out.println("Banco: " + bancoAsociado.getNombre());
            System.out.println("Capital del banco: " + bancoAsociado.getCapital());
            System.out.println("Dirección del banco: " + bancoAsociado.getDireccion());
        } else {
            System.out.println("La cuenta no está vinculada a ningún banco.");
        }
    }
}
