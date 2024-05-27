package proyect;

import java.util.Scanner;

public class palindromo {
	public static int[] ingreseN() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de datos para vericar: ");
		int cantN = leer.nextInt();
		int[] nume= new int[cantN];
		System.out.println("Ingrese los numeros uno por uno: ");
			for(int i=0;i < cantN;i++) {
				System.out.println("Ingrese los numeros "+ (i+1) + ": ");
				nume [i] = leer.nextInt();
			}return nume;
	}
	public static boolean siespa(int num) {
		int ori=num;
		int inv= 0;
		while (num>0) {
			int digito = num % 10;
			inv = inv * 10 +digito;
			num/=10;
	}return ori==inv;
	}
	public static void main(String[] args) {
	int [] nume = ingreseN();
	System.out.println("Resultados:");
		for (int i=0;i< nume.length;i++) {
			if(siespa(nume[i])) {
				System.out.println((nume[i])+" Si es palindromo.");
			}else {
				System.out.println((nume[i])+" No es palindromo.");
			}
		}
		
	}

}
