//Actividad 11: Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
// Realizar una versión iterativa y otra recursiva.

package U3;

public class Ejercicio11 {
    // Versión iterativa
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= a;  // Multiplicamos a por sí mismo n veces
        }
        return resultado;
    }

    // Versión recursiva
    public static double potenciaRecursiva(double a, int n) {
        // Caso base: cualquier número elevado a 0 es 1
        if (n == 0) {
            return 1;
        }
        // Llamada recursiva
        return a * potenciaRecursiva(a, n - 1);
    }

    public static void main(String[] args) {

        //Javi:Aqui realizamos las comprobaciones

        double base = 3.0; // Ejemplo con base 3
        int exponente = 4; // Ejemplo con exponente 4

        // Usando la versión iterativa
        double resultadoIterativo = potenciaIterativa(base, exponente);
        System.out.println("Resultado (Iterativo): " + base + "^" + exponente + " = " + resultadoIterativo);

        // Usando la versión recursiva
        double resultadoRecursivo = potenciaRecursiva(base, exponente);
        System.out.println("Resultado (Recursivo): " + base + "^" + exponente + " = " + resultadoRecursivo);
    }
}
