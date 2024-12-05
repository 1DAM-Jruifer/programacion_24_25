//Actividad 8: Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

package U3;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Javi: Cambia aqui el caracter que quieras.

        divisores(14);
    }
    static void divisores(int num){

        int contador = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                contador++;
            }

        }
        System.out.println("El numero " + num + " tiene " + contador);
    }

}

