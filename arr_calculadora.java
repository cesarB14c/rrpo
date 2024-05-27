package proyect;
import java.util.*; 
public class arr_calculadora {
	// Función para ingresar cantidad, nombres y edades de las personas
    public static String[][] ingresarPersonas() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();
         // Consumir el salto de línea después del número

        // Crear una matriz para almacenar los nombres y las edades
        String[][] personas = new String[cantidadPersonas][2];

        // Solicitar al usuario que ingrese los nombres y las edades uno por uno
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona #" + (i + 1) + ": ");
            personas[i][0] = scanner.nextLine();

            System.out.print("Ingrese la edad de " + personas[i][0] + ": ");
            personas[i][1] = scanner.nextLine();
        }

        return personas;
    }

    // Función para contar cuántas personas son mayores de edad
    public static int contarMayoresEdad(String[][] personas) {
        int mayoresEdad = 0;
        for (int i = 0; i < personas.length; i++) {
            int edad = Integer.parseInt(personas[i][1]);
            if (edad >= 18) {
                mayoresEdad++;
            }
        }
        return mayoresEdad;
    }

    public static void main(String[] args) {
        String[][] personas = ingresarPersonas();

        // Contar cuántas personas son mayores de edad
        int mayoresEdad = contarMayoresEdad(personas);
        System.out.println("Personas mayores de edad: " + mayoresEdad);

        // Mostrar los nombres y edades ingresados
        System.out.println("\nPersonas ingresadas:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i][0] + ", Edad: " + personas[i][1]);
        }
    }
}