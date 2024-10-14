
package programas;
import java.util.Scanner;
public class tarea_03 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        // Crear un arreglo para almacenar las compras
        double[] compras = new double[n];
        // Variables para almacenar el total, compra mayor y menor
        double totalCompras = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;
        // Ingresar las compras y calcular el total, la compra mayor y menor
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            totalCompras += compras[i];
            // Actualizar la compra mayor si es necesario
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            // Actualizar la compra menor si es necesario
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        // Calcular el promedio de compras
        double promedioCompras = totalCompras / n;
        // Mostrar el total, el promedio, la compra mayor y la compra menor
        System.out.println("\nResultados:");
        System.out.println("Total de las compras: " + totalCompras);
        System.out.println("Promedio de las compras: " + promedioCompras);
        System.out.println("Compra mayor: " + compraMayor);
        System.out.println("Compra menor: " + compraMenor);
        // Cerrar el scanner
        scanner.close();
    }
}
