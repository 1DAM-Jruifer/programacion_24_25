//Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro

package U3;

public class Ejercicio9 {
    static void divisoresPrimos(int num){
        for (int i = 2; i < num; i++) {
            if (num % i ==0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        //Javi:Aqui realizamos las comprobaciones

        divisoresPrimos(14);
    }
}
