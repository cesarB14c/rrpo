package proyect;

import java.util.Scanner;

public class sistema_calificacion {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese numero de estudiantes: ");
		int n = leer.nextInt();
		int[] calificaciones = new int[n];

		System.out.println("Ingrese las calificaciones finales de los estudiantes:");
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.printf("Calificación del estudiante: ", i + 1);
			int calificacion = leer.nextInt();
			if (calificacion < 0 || calificacion > 100) {
				System.out.println("La calificación debe estar en el rango de 0 a 100. Inténtelo de nuevo.");
				i--;
			} else {
				calificaciones[i] = calificacion;
			}
		}int max = calificaciones[0];
        int min = calificaciones[0];
        double suma = 0;
        for (int calificacion : calificaciones) {
            if (calificacion > max) max = calificacion;
            if (calificacion < min) min = calificacion;
            suma += calificacion;
            double promedio = suma/n; 
        }int excelentes =0, bueno=0, regular =0,insuficiente =0;
        
	}
}
