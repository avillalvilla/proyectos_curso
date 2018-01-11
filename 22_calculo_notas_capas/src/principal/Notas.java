package principal;

import java.util.Scanner;

import modelo.GestionNotas;

public class Notas {
	
	public static void main(String[] args) {
		GestionNotas gnotas = new GestionNotas(); // hay que crear un objeto de la clase de negocio
		int opcion;
		Scanner sc = new Scanner(System.in); 

		do {
			System.out.println("Elija una opción: ");
			System.out.println("1. Añadir nota");
			System.out.println("2. Ver aprobados ");
			System.out.println("3. Nota media");
			System.out.println("4. Mostrar todas las notas");
			System.out.println("5. Salir");

			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:  
				System.out.println("Introduce nota: ");
				double d = sc.nextDouble();
				gnotas.agregarNota(d);
				break;
			case 2:
				System.out.println("El número de aprobados es: " + gnotas.aprobados() + "\n");
				break;
			case 3:
				System.out.println("La nota media es: " + gnotas.media() + "\n");
				break;
			case 4:
				mostrarNotas(gnotas.devolverNota()); // devolverNota() devuelve un array con las notas
				break;
			case 5:
				System.out.println("Hasta pronto!");
				break;
			default:
				System.out.println("Opción no válida \n");
			}
		} while (opcion!=5);
	
	}
	
	private static void mostrarNotas(Double[] valores) { // recibe el array con las notas y lo recorre para imprimirlas
		System.out.println("Las notas son: ");
		for (Double d:valores) {
			System.out.println(d);
		}
		System.out.println();
	}
	
}
