package proyect;
import java.util.*;
public class ejercicios_arrglos {

	public static void main(String[] args) {
		int[] numeros = new int [20];
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < numeros.length ; i++) {
			System.out.print("Ingrese numero: ");
			 numeros [i]= leer.nextInt();
		}for (int i = 0; i < numeros.length ; i++) {
			System.out.println("Los numeros son: "+ numeros[i]);
		}
	}

}
