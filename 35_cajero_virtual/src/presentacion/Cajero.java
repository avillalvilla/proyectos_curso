package presentacion;

import java.util.Scanner;

import modelo.CuentaNueva;

/* Al iniciar el programa se solicita al usuario el saldo inicial y el limite de la cuenta (la m�xima cantidad que se va a poder extraer)
 * Hay que utilizar una clase que herede Cuenta con los a�adidos que sean necesarios, no se puede modificar la clase Cuenta
 * Menu:
 * 1. Ingresar -> se solicita la cantidad a ingresar y se procede al ingreso
 * 2. Extraer -> se solicita la cantidad a extraer; si es >= que el l�mite, se realiza la extracci�n
 * 3. Movimientos y saldo -> Muestra los movimientos realizados en la cuenta y el saldo final; cada movimiento se caracteriza por un tipo (ingreso o extracci�n) y una cantidad
 * 4. Salir
 */


public class Cajero {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int opcion;
	    System.out.println("Bienvenido al Cajero Virtual");
	    System.out.println("Introduce el saldo inicial de la cuenta: ");
	    double saldo = sc.nextDouble();
	    System.out.println("Introduce el límite para sacar dinero de la cuenta: ");
	    double limite = sc.nextDouble();
		CuentaNueva cuenta = new CuentaNueva(saldo, limite);
		
		do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Ingresar");
            System.out.println("2. Extraer");
            System.out.println("3. Movimientos y saldo");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
            {
                System.out.println("Introduce la cantidad a ingresar: ");
                double cant = sc.nextDouble();
                cuenta.ingresar(cant);
                break;
            }
            case 2:
            {
                System.out.println("Introduce la cantidad a extraer: ");
                double cant = sc.nextDouble();
                if (cant <= limite) {
                    if (cant <= cuenta.getSaldo()) {
                        cuenta.extraer(cant);
                    }
                    else {
                        System.out.println("La cantidad indicada es superior al saldo actual");
                    }
                }
                else {
                    System.out.println("La cantidad indicada excede el límite");
                }
                break;
            }
            case 3:
                System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                mostrarMovs(cuenta);
                break;
            case 4:
                System.out.println("Hasta pronto!");
                break;
            default:
                System.out.println("Opcion no valida \n");
            } 
		} while (opcion != 4);
	}
	public static void mostrarMovs(CuentaNueva cuenta) {
	    String tipo;
	    for (Double d:cuenta.getMovs()) {
	        if (d <= 0) {
	            tipo = "Extraccion";
	        }
	        else {
	            tipo = "Ingreso";
	        }
	        System.out.println(tipo + "\t" + Math.abs(d));
	    }
	}
}
