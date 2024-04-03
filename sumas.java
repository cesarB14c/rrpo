package proyect;
import java.util.*;
public class sumas {

	public static void main(String[] args) {
		int n = 0;
		Scanner leer = new Scanner(System.in);
		System.out.print("Digite el numero: ");
		n = leer.nextInt();
		int suma=0;
		for (int i=0;i<=n;i++) {
			if(i%2==0) {
				suma+=i;
			}System.out.println(suma);
				
			}
		}
		
	}


