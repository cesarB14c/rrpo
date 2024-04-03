package proyect;

import java.util.Scanner;

public class calculadora {
	public static void calcula(int nume) {
		int nume, res = 0;
		Scanner leer = new Scanner(System.in);
		switch (numero) {
		case 1:
			System.out.print("Con cuantos numeros quiere realizar la operacion: ");
			nume = leer.nextInt();
			for (int i = 1; i <= nume; i++) {
				System.out.print("Ingrese numero " + (i));
				int n = leer.nextInt();
				res = res + n;
			}
			System.out.println("El resultado de la suma es: " + res);

			break;
		case 2:
			System.out.print("Con cuantos numeros quiere realizar la operacion: ");
			nume = leer.nextInt();
			for (int i = 1; i <= nume; i++) {
		        System.out.print("Ingrese numero " + i + ": ");
		        int n = leer.nextInt();
		        if (i == 1) {
		        	res = n;
		        } else {
		            res -= n;
		        }
		    }
			System.out.println("El resultado de la resta es: " + res);

			break;
		case 3:
			System.out.print("Con cuantos numeros quiere realizar la operacion: ");
			nume = leer.nextInt();
			for (int i = 1; i <= nume; i++) {
				System.out.print("Ingrese numero " + (i));
				int n = leer.nextInt();
				res *= n;
			}
			System.out.println("El resultado de la multiplicacion es: " + res);

			break;

		}
	}

	public static void main(String[] args) {
		System.out.println("Ingrese que operacion quiere usar \n1.Suma\n2.Resta\n3.Multiplicacion");
		Scanner leerope = new Scanner(System.in);
		int OPE = leerope.nextInt();
		calcula(OPE);

	}
}
