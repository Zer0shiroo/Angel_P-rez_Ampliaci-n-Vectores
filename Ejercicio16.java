
/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 * 
 * @author Ángel Pérez
 */

import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {// A través de un bucle hacemos que con la propia variable del bucle se
                                                 // rellene dentro del array ese mismo número de veces
            Arrays.fill(array, 0, i, i);
            System.out.println(Arrays.toString(array));
        }

    }
}
