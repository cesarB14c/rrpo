package proyect;
import java.util.Scanner;
public class promedio {

	public static void main(String[] args) {
		int np;
		Scanner leer = new Scanner(System.in);
		System.out.print("Cuantos numeros quiere promediar: ");
		np = leer.nextInt();
		int suma = 0;
		for (int i = 0; i < np; i++) {
			System.out.print("Ingrese numero " + (i + 1));
			int n = leer.nextInt();
			suma += n;
		}
		double res = suma / np;
		System.out.print("El promedio es: " + res);
	}
}
