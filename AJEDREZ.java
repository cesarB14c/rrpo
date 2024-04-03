package proyect;

public class AJEDREZ {

	public static void main(String[] args) {
		String [][] tabla = {
				{"T","C","A","R","Q","A","C","T"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"P","P","P","P","P","P","P","P"},
				{"T","C","A","Q","R","A","C","T"},
				 
		};
	for (int i =0; i < tabla.length; i++) {
		for (int j =0; j < tabla[i].length ; j++) {
			System.out.print(tabla [i][j]);
		}System.out.println();
	}
	}

}
		
