package presentacion;

import java.util.Scanner;

import modelo.GestionContactos;

public class Agenda {

	public static void main(String[] args) {
		GestionContactos agenda = new GestionContactos();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Elija una opción: ");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Buscar contacto ");
			System.out.println("3. Eliminar contacto");
			System.out.println("4. Mostrar contactos");
			System.out.println("5. Salir");

			/* usar el mismo scanner para nextInt y nextLine da problemas, no se puede hacer lectura de numeros y despues de lineas
			opcion = sc.nextInt();
			Se soluciona usando siempre nextLine, y pasando a int o usando dos scanner distintos
			*/
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:  
				String email;
				String nombre;
				System.out.println("Introduce email: ");
				email = sc.nextLine();
				System.out.println("Introduce nombre: ");
				nombre = sc.nextLine();
				if (agenda.anadir(email, nombre)) {
					System.out.println("Contacto añadido");
				}
				else {
					System.out.println("El email ya existe");
				}
				break;
			case 2:
				System.out.println("Introduce email: ");
				email = sc.nextLine(); 
				nombre = agenda.buscar(email);
				if (nombre == null){
					System.out.println("El contacto no existe");
				}
				else {
					System.out.println(nombre);

				}
				break;
			case 3:
				System.out.println("Introduce email: ");
				email = sc.nextLine(); 
				if (agenda.eliminar(email)) {
					System.out.println("Contacto añadido");
				}
				else {
					System.out.println("El email ya existe");
				}
				break;
			case 4:
				mostrar(agenda.devolverNombres()); // devolverNota() devuelve un array con las notas
				break; 
			case 5:
				System.out.println("Hasta pronto!");
				break;
			default:
				System.out.println("Opción no válida \n");
			}
		} while (opcion!=5);

	}
	
	private static void mostrar(String[] nombres) { // recibe el array con las notas y lo recorre para imprimirlas
		System.out.println("Los contactos son: ");
		for (String s:nombres) {
			System.out.println(s);
		}
		System.out.println();
	}

}
