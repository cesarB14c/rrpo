package proyect;
import java.util.Scanner;
public class dias_año {
	public static boolean añob (int año) {
		if ((año % 4==0)&&(año % 100 !=0)&& (año%400==0)){
			System.out.println("El año es bisiesto");
			return true;
		}else {
			System.out.println("El año no es bisiesto");
		return false;
		}
	}
	public static int diasmes(int mes,int año) {
		switch (mes) {
		case 1: //enero
		case 3: //marzo
		case 5: //mayo
		case 7: //julio
		case 8: //agosto
		case 10://octubre
		case 12://diciembre
			return 31;
		case 4: //abril
		case 6: //junio
		case 9: //septiembre
		case 11://noviembre
			return 30;
		case 2: //febrero
			if (añob(año)){
				return 29;
			}else {
				return 28;
			}
		default:	
		}
		return año;}
		
	
	public static void main(String[] args) {
		int año =0,mes=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite el año: ");
		año = leer.nextInt();
		System.out.println("Digite el numero del mes: ");
		mes = leer.nextInt();
		int dias = diasmes(mes,año);
		System.out.println("El mes de "+mes+" tiene "+dias+ " de dias ");
		}
	}


