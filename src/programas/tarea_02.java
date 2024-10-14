
package programas;
import java.util.Scanner;
public class tarea_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        // Crear un arreglo para almacenar los ingresos
        double[] ingresos = new double[n];
        // Variables para la suma total de ingresos y el mayor ingreso
        double sumaIngresos = 0;
        double ingresoMayor = 0;
        // Ingresar los ingresos y calcular la suma y el mayor ingreso
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i];
            // Actualizar el mayor ingreso si es necesario
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        // Calcular el ingreso promedio
        double ingresoPromedio = sumaIngresos / n;
        // Mostrar el ingreso promedio y el mayor ingreso
        System.out.println("El ingreso promedio de las " + n + " personas es: " + ingresoPromedio);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
        // Cerrar el scanner
        scanner.close();
    } 
}
