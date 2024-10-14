
package programas;
import java.util.Scanner;
public class tarea_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Crear un arreglo para almacenar 5 nombres
        String[] nombres = new String[5];
        // Ingresar los nombres de las personas
        System.out.println("Ingrese los nombres de 5 personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        // Solicitar el nombre a buscar
        System.out.print("\nIngrese el nombre de la persona a buscar: ");
        String nombreBuscado = scanner.nextLine();
        // Realizar la búsqueda
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {  // Comparar ignorando mayúsculas/minúsculas
                encontrado = true;
                posicion = i;
                break;
            }
        }
        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("La persona '" + nombreBuscado + "' fue encontrada en la posición " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("La persona '" + nombreBuscado + "' no existe en el arreglo.");
        }
        // Cerrar el scanner
        scanner.close();
    }
}
