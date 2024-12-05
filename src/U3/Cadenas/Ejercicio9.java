//Realizar un programa que haga lo siguiente:
//
//Crear un StringBuilder con la cadena "Manteca colorá" y mostrarla por consola.
//Mostrar por consola su capacidad y longitud.
//Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
//Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
//Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
//Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
//Mostrar por consola la capacidad y longitud del StringBuilder final.
//Realizar el mismo ejercicio con la clase StringBuffer.

package U3.Cadenas;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Usando StringBuilder
        System.out.println("Usando StringBuilder:");

        // Crear StringBuilder con la cadena "Manteca colorá"
        StringBuilder sb = new StringBuilder("Manteca colorá");
        System.out.println("Cadena inicial: " + sb);

        // Mostrar la capacidad y longitud del StringBuilder
        System.out.println("Capacidad: " + sb.capacity());
        System.out.println("Longitud: " + sb.length());

        // Modificar la cadena a "Chicharrones de Chiclana"
        sb.replace(0, sb.length(), "Chicharrones de Chiclana");
        System.out.println("Modificado a: " + sb);

        // Modificar la cadena a "Hay 5000 Chicharrones"
        int numero = 5000;
        sb.replace(0, sb.length(), "Hay " + numero + " Chicharrones");
        System.out.println("Modificado a: " + sb);

        // Modificar la cadena a "Hay 5000 Chicharrones en Chiclana"
        sb.append(" en Chiclana");
        System.out.println("Modificado a: " + sb);

        // Almacenar en un String los últimos 4 caracteres
        String lastFour = sb.substring(sb.length() - 4);
        System.out.println("Últimos 4 caracteres: " + lastFour);

        // Mostrar la capacidad y longitud del StringBuilder final
        System.out.println("Capacidad final: " + sb.capacity());
        System.out.println("Longitud final: " + sb.length());

        // Usando StringBuffer
        System.out.println("\nUsando StringBuffer:");

        // Crear StringBuffer con la cadena "Manteca colorá"
        StringBuffer sbf = new StringBuffer("Manteca colorá");
        System.out.println("Cadena inicial: " + sbf);

        // Mostrar la capacidad y longitud del StringBuffer
        System.out.println("Capacidad: " + sbf.capacity());
        System.out.println("Longitud: " + sbf.length());

        // Modificar la cadena a "Chicharrones de Chiclana"
        sbf.replace(0, sbf.length(), "Chicharrones de Chiclana");
        System.out.println("Modificado a: " + sbf);

        // Modificar la cadena a "Hay 5000 Chicharrones"
        sbf.replace(0, sbf.length(), "Hay " + numero + " Chicharrones");
        System.out.println("Modificado a: " + sbf);

        // Modificar la cadena a "Hay 5000 Chicharrones en Chiclana"
        sbf.append(" en Chiclana");
        System.out.println("Modificado a: " + sbf);

        // Almacenar en un String los últimos 4 caracteres
        String lastFourBuffer = sbf.substring(sbf.length() - 4);
        System.out.println("Últimos 4 caracteres: " + lastFourBuffer);

        // Mostrar la capacidad y longitud del StringBuffer final
        System.out.println("Capacidad final: " + sbf.capacity());
        System.out.println("Longitud final: " + sbf.length());
    }
}
