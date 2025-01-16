//CuentaCorriente para que sea visible desde clases externas, y la visibilidad de sus atributos para que:
//
//saldo y limite no sean visibles para otras clases
//nombre sea público para cualquier clase
//dni solo sea visible por clases vecinas

package U4.Objetos;

public class Parte3 {
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    private String dni;
    // El resto permanece igual
}
