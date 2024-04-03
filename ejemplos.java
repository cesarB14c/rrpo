package proyect;

import java.util.Scanner;

public class ejemplos {

	public static int operacion(int num1, int num2) {
		return num1+num2;
	}
		
	public static void main(String[] args) {
		int n1 = 2, n2 = 3, res=0;
		res=operacion(n1,n2);
		System.out.println("El resultado de la suma es: " + res);
	}
	

}
