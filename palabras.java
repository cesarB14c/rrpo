package proyect;

public class palabras {
	
	    public static String[][] listado() {
	        String[][] palabras = {
	                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}
	        };
	        return palabras;
	    }

	    public static String[][] giro(String[][] palabras) {
	        int n = palabras[0].length;
	        String[][] palabrasG = new String[1][n];
	        for (int i = 0; i < n; i++) {
	            int posicion = (i + 3) % n;
	            palabrasG[0][posicion] = palabras[0][i];
	        }
	        return palabrasG;
	    }

	    public static void main(String[] args) {
	        String[][] palabras = listado();
	        String[][] palabrasG = giro(palabras);

	        System.out.println("Palabras Originales:");
	        imprimir(palabras);

	        System.out.println("Palabras Giradas:");
	        imprimir(palabrasG);

	        String palabra = "lpkpmtjzm";
	        String[] letras = palabra.split("");
	        String[][] palabraArr = {letras};
	        String[][] palabraG = giro(palabraArr);

	        System.out.println("Palabra Original: " + palabra);
	        System.out.println("Palabra Girada:");
	        imprimir(palabraG);
	    }

	    public static void imprimir(String[][] palabras) {
	        for (String[] fila : palabras) {
	            for (String palabra : fila) {
	                System.out.print(palabra + " ");
	            }
	            System.out.println();
	        }
	    }
	}

