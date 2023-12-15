/**
 * Crea un programa que pida la usuario dos valores N y M y luego cree un array
 * de tamaño N que contenga M en todas sus posiciones. Luego muestra el array
 * por pantalla.
 * 
 * @author Ángel Pérez
 */
public class Ejercicio15 {
    public static void main(String args[]) {
        System.out.println("Dime el primer valor");// Se piden dos valores
        int valorN = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el segundo valor");
        int valorM = Integer.parseInt(System.console().readLine());
        int[] array = new int[valorN];
        for (int i = 0; i < array.length; i++) {// A trevés del bucle se inserta el valorM al array de tamaño N
            array[i] = valorM;
            System.out.println("Posición " + (i + 1) + ": " + array[i]);
        }

    }
}