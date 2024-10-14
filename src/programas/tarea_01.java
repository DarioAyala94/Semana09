
package programas;
import java.util.Scanner;
public class tarea_01 {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        // Crear un arreglo para almacenar los pesos
        double[] pesos = new double[n];
        // Variable para almacenar la suma total de los pesos
        double sumaPesos = 0;
        // Ingresar los pesos y calcular la suma
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            sumaPesos += pesos[i];
        }
        // Calcular el peso promedio
        double pesoPromedio = sumaPesos / n;
        // Mostrar el peso promedio
        System.out.println("El peso promedio de las " + n + " personas es: " + pesoPromedio + " kg");
        // Cerrar el scanner
        scanner.close();
    } 
}
