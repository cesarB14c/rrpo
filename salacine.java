package proyect;

public class salacine {
	int fila =8, silla=8;
	int [][] asiento = new int [fila][silla];
	
	public  salacine() {
	for (int i=0; i<asiento.length ; i++) {
		for (int j=0; j< silla ; j++) {
			asiento[i][j] = 0;
		}
	}
	}
	public void mostrar() {
		  for (int i = 0; i < asiento.length; i++) {
		    for (int j = 0; j < silla; j++) {
		      System.out.print(asiento[i][j] + " ");
		    }
		    System.out.println();
		}
		  }
	public void reservar(int fila, int silla) {
		if (fila>0 || fila>asiento.length || silla <0 || silla<= asiento[0].length) {
			System.out.println("Numero de fila y silla no valida");
		return;
		} if (asiento[fila][silla]== 1) {
			System.out.println("Asiento ocupado");
			return;
		} asiento[fila][silla]= 1;
		System.out.println("Su asiento ha sido reservado");
	}
	public void canreserva(int fila, int silla) {
		if (fila>0 || fila>asiento.length || silla <0 || silla<= asiento[0].length) {
			System.out.println("Numero de fila y silla no valida");
		return;
		} if (asiento[fila][silla]== 1) {
			System.out.println("Asiento desocupado");
			return;
		} asiento[fila][silla]= 1;
		System.out.println("Su reserva ha sido cancelada");
	}
	public static void main(String[] args) {
		salacine sala = new salacine();
        sala.mostrar();
        sala.reservar(3, 4);
        sala.mostrar();
        sala.canreserva(3, 4);
       sala.mostrar();

	}

}
