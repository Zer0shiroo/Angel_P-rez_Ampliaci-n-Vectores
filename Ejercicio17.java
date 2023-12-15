/**
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
 * primeros en un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le
 * dirá al usuario si son iguales o no.
 * 
 * @author Ángel Pérez
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        boolean noiguales = false;
        for (int i = 0; i < 20; i++) {// Hacemos un bucle para que el usuario rellene los dos arrays dentro y cuando
                                      // el primero se llene pasa al segundo
            if (i < array1.length) {
                System.out.println("Inserte el valor número " + (i + 1));
                array1[i] = Integer.parseInt(System.console().readLine());
            }

            if (i >= array1.length) {
                System.out.println("Inserte el valor número " + (i + 1));
                array2[i - 10] = Integer.parseInt(System.console().readLine());
            }
        }
        for (int i = 0; i < 10; i++) {// Se comparan los dos arrays y dependiendo si don iguales o no se imprimira un
                                      // mensage u otro
            if (array1[i] != array2[i]) {
                noiguales = true;
            }
        }
        if (noiguales) {
            System.out.println("Los arrays no son iguales");
        } else {
            System.out.println("Los arrays son iguales");
        }
    }
}
