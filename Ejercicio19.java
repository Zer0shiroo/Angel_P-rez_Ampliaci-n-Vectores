
/**
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de 
 * ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los 
 * jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las 
 * puntuaciones en orden descendente (de la más alta a la más baja).
 * 
 * @author Ángel Pérez
 */
import java.util.Arrays;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] puntuaciones = new int[8];
        for (int i = 0; i < puntuaciones.length; i++) {//Se almacenan en este bucle los valores de los jugadores

            System.out.println("Dime el valor número " + (i + 1) + ":");
            puntuaciones[i] = Integer.parseInt(System.console().readLine());

        }
        Arrays.sort(puntuaciones);//A través de Arrays.sort se ordenarán en orden ascendente
        for (int i = 0; i < puntuaciones.length / 2; i++) {//Se ordenan en orden descendente con este bucle 
            int auxiliar = puntuaciones[i];
            puntuaciones[i] = puntuaciones[puntuaciones.length - 1 - i];
            puntuaciones[puntuaciones.length - 1 - i] = auxiliar;
        }
        System.out.println("--------------------------RANKING--------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println("Posición" + (i + 1) + ": " + puntuaciones[i]);
        }

    }
}
