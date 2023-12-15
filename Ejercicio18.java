/**
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
 * aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los
 * mostrará por pantalla
 * 
 * @author Ángel Pérez
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        float[] array = new float[30];
        for (int i = 0; i < array.length - 1; i++) {// Creamos valores aleatorios en el array
            array[i] = (float) Math.random() * 10;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int h = 0; h < array.length - i - 1; h++) {
                if (array[h] > array[h + 1]) {// Con ayuda de un auxiliar organizamos los valores del arrays en orden
                                              // ascendente
                    float auxiliar = array[h];
                    array[h] = array[h + 1];
                    array[h + 1] = auxiliar;
                }
            }
        }
        System.out.println("Valores del array ordenados de menor a mayor:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor número " + (i + 1) + ": " + array[i]);
        }
    }
}
