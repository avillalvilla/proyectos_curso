package principal;

public class Primitiva {

	public static void main (String[] args) {

		int[] numeros = combinacion();	
		ordenar(numeros);

		for (int i = 0;  i < numeros.length; i++) {
			System.out.println(numeros[i]);		
		}
	}

	private static int[] combinacion() {
		int[] numeros = new int[6];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.floor(Math.random() * 49 + 1);
			for (int j = i - 1; j >= 0; j--) {			
				if (numeros[i] == numeros[j]) {
					numeros[i] = (int)Math.floor(Math.random() * 49 + 1);
				}
			}
		}
		return numeros;
	}

	public static void ordenar(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {			
				if (numeros[j] < numeros[i]) {
					final int aux = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
				}
			}
		}

	}

}
