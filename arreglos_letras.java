package proyect;

import java.util.Scanner;

public class arreglos_letras {

	public static void main(String[] args) {
		String[] palabras = new String [5];
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < palabras.length ; i++) {
			System.out.print("Ingrese la palabra: ");
			palabras [i]= leer.nextLine();
		}for (int i = 0; i < palabras.length ; i++) {
			System.out.println("Las palabras son: "+ palabras[i]);
		}
	

	}

}
