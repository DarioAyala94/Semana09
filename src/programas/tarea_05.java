
package programas;
import java.util.Scanner;
public class tarea_05 {
    public static void main(String[] args){
        // Arreglos a y b con 5 elementos cada uno
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        // Crear el arreglo c con tamaño el doble de a y b
        int[] c = new int[10];
        // Intercalar los valores de a y b en c
        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];     // Elemento de a en posiciones pares de c
            c[2 * i + 1] = b[i]; // Elemento de b en posiciones impares de c
        }
        // Mostrar los valores del arreglo c intercalados
        System.out.println("El arreglo intercalado c es:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
