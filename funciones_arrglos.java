package proyect;
import java.util.*;
public class funciones_arrglos {
		
	    public static int obtenerNumeroDeEstudiantes() {
	        Scanner leer = new Scanner(System.in);
	        System.out.print("Ingrese el número de estudiantes: ");
	        return leer.nextInt();
	    }

	    public static int[] ingresarCalificaciones(int n) {
	        int[] calificaciones = new int[n];
	        Scanner leer = new Scanner(System.in);
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
	            calificaciones[i] = leer.nextInt();
	        }
	        return calificaciones;
	    }

	   

	    public static int calificacionMaxima(int[] calificaciones) {
	        int max = calificaciones[0];
	        for (int calificacion : calificaciones) {
	            if (calificacion > max) {
	                max = calificacion;
	            }
	        }
	        return max;
	    }

	    public static int calificacionMinima(int[] calificaciones) {
	        int min = calificaciones[0];
	        for (int calificacion : calificaciones) {
	            if (calificacion < min) {
	                min = calificacion;
	            }
	        }
	        return min;
	    }

	    public static int promedioCalificaciones(int[] calificaciones) {
	    	int suma = 0;
	        for (int calificacion : calificaciones) {
	            suma += calificacion;
	        }
	        return suma / calificaciones.length;
	    }
	    public static void mostrarEstadisticas(int[] calificaciones) {
	        System.out.println("La calificación más alta es: " + calificacionMaxima(calificaciones));
	        System.out.println("La calificación más baja es: " + calificacionMinima(calificaciones));
	        System.out.println("El promedio de calificaciones es: " + promedioCalificaciones(calificaciones));
	    }


	    public static int[] distribucionCalificaciones(int[] calificaciones) {
	        int[] distribucion = new int[4];
	        for (int calificacion : calificaciones) {
	            if (calificacion >= 90) {
	                distribucion[0]++;
	                System.out.println("Excelente: " + distribucion[0]);
	            } else if (calificacion >= 70) {
	                distribucion[1]++;
	                System.out.println("Bueno: " + distribucion[1]);
	            } else if (calificacion >= 50) {
	                distribucion[2]++;
	                System.out.println("Regular: " + distribucion[2]);
	            } else {
	                distribucion[3]++;
	                System.out.println("Insuficiente: " + distribucion[3]);
	            }
	        }
	        return distribucion;
	    }
	
	
	
	public static void main(String[] args) {
    int n = obtenerNumeroDeEstudiantes();
    int[] calificaciones = ingresarCalificaciones(n);
    mostrarEstadisticas(calificaciones);
   
}

}
