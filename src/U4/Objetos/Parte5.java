// Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:

//La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
//Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.
//Igualmente, permite añadir una cadena, al principio o al final del texto,
//siempre y cuando no se rebase el tamaño máximo establecido.
//Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

package U4.Objetos;

public class Parte5 {
    private StringBuilder texto;
    private int maxLength;

    public Parte5(int maxLength) {
        this.maxLength = maxLength;
        this.texto = new StringBuilder();
    }

    public boolean agregarCaracterInicio(char c) {
        if (texto.length() < maxLength) {
            texto.insert(0, c);
            return true;
        }
        return false;
    }

    public boolean agregarCaracterFinal(char c) {
        if (texto.length() < maxLength) {
            texto.append(c);
            return true;
        }
        return false;
    }

    public boolean agregarCadenaInicio(String cadena) {
        if (texto.length() + cadena.length() <= maxLength) {
            texto.insert(0, cadena);
            return true;
        }
        return false;
    }

    public boolean agregarCadenaFinal(String cadena) {
        if (texto.length() + cadena.length() <= maxLength) {
            texto.append(cadena);
            return true;
        }
        return false;
    }

    public int contarVocales() {
        int contador = 0;
        String textoStr = texto.toString().toLowerCase();
        for (char c : textoStr.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
