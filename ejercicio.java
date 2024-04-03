package proyect;
import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		int lon = 0,anc = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite la longitud del rectangulo: ");
		lon = leer.nextInt();
		System.out.println("Digite el ancho del rextangulo: ");
		anc = leer.nextInt();
		int area = lon*anc;
		int perimetro = 2*(lon+anc);
		System.out.println("El area del rectangulo es : "+ area + " El perimetro del rectangulo es: "+ perimetro );
				

	}

}
