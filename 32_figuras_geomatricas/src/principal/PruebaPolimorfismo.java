package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

public class PruebaPolimorfismo {

	public static void main(String[] args) {
		// usando polimorfismo
		mostrar(new Circulo("rojo", 2));
		mostrar(new Triangulo("verde", 5, 3));
	}

	// creamos un metodo que recibe un objeto de la superclase y se le puede llamar con cualquier objeto hijo, 
	//siempre que los metodos existan en la superclase (aunque sean abstract y se hayan sobreescrito en las clases hijas)
	public static void mostrar(Figura f) { 
		System.out.println("Color: " + f.getColor());
		System.out.println("Superficie: " + f.superficie()); // es importante que superficie() se haya sobreescrito para que se pueda reutilizar por polimorfismo
	}
}
