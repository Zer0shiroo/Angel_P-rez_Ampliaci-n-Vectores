/**
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
 * entero
 * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado
 * un valor N y se
 * mostrará por pantalla si N existe en el array, además de cuantas veces.
 * 
 * @author Ángel Pérez
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {// Se crean los valores aleatorios y se almacenan en el array mediante
                                                // el bucle
            array[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("Dime el valor que desea buscar");// Se le pide al usuario que diga qué valor buscar y cada
                                                             // vez que encuentre ese mismo valor se le sumará uno al contador
        int valor = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                contador++;
            }
        }
        if (contador > 0) {//Si el contador almacenó algo le saldrá cuántos valores fueron sino imprimirá que no existen valores
            System.out.println("El valor si existe en el array");
            System.out.println("Se repite " + contador + " veces");
        } else {
            System.out.println("El valor no existe en el array");
        }
    }
}
