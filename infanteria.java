package proyect;

public class infanteria {

	public static void main(String[] args) {
		int facA = 1500, facB = 1300;
		 // NUMERO TOTAL DE FUERZAS DE COMBATE
		int ft = facA+facB;
		 // Numero total de bajas faccion A
		int ft2A = 0,m2A = 10, h2A= 60 , d2A=30;
		
		ft2A = m2A+h2A+d2A; 
		
		int ft3A = 0, m3A = 2, h3A = 3 ,d3A = 0;
		
		ft3A = m3A+h3A+d3A;
		
		//Numero total de bajas faccion B
		
		int ft2B = 0,m2B = 200, h2B= 180 , d2B=20;
		
		ft2B = m2B+h2B+d2B;
		
		int ft3B= 0, m3B= 10, h3B = 5,d3B=75;
		
		ft3B = m3B+h3B+d3B;
		
		// Numero total bajas
		int ft2 = ft2A+ft2B;
		int ft3 = ft3A+ft3B;
		
		System.out.println("El total de fuerzas de combate son: "+ ft);
		System.out.println("Faccion A y B tuvo un total de bajas en infanteria a lo largo de su linea de combate ");
		System.out.println("El numero total de bajas de caballeria son: "+ft2);
		System.out.println("El numero total de bajas de caballeria pesada son: "+ft3);
	}

}
