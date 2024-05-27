package proyect;

import java.util.Scanner;

public class contadorpersonas {
	public static String [][]ingresar(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de personas:");
		int cantidad = leer.nextInt();
		leer.nextLine();
		String [][] perso = new String[cantidad][2];
		for (int i=0; i<cantidad; i++) {
			System.out.println("Ingrese nombre de la persona "+(i+1));
			perso [i][0] = leer.nextLine();
			System.out.println("Ingrese edad de "+perso [i][0]);
			perso [i][1] = leer.nextLine();
		}
		return perso;
	}
	public static int contar (String [][] perso) {
		int mayor = 0;
		for (int i=0; i<perso.length; i++) {
			int edad = Integer.parseInt(perso [i][1]);
			if (edad>=18) {
				mayor++;
			}
		}
		return mayor;
	}
	public static void main(String[] args) {
		String[][]perso = ingresar();
		int mayor = contar (perso);
		System.out.println ("Personas mayores de edad: "+ mayor);
		for (int i=0; i<perso.length;i++) {
			System.out.println ("Nombre: "+ perso [i][0] + " ,Edad: " + perso [i][1]);
		}
	}

}
