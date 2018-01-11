package modelo;

import java.util.ArrayList;

public class GestionNotas {
	// almacen de las notas
	ArrayList<Double> notas = new ArrayList<>();
	
	// metodos de negocio para manejar las notas
	// son publicos para que se puedan llamar desde fuera de la clase
	// no son estaticos porque no se van a llamar desde un metodo estatico de la misma clase
	// no necesitan parametros en la definicion porque reciben el arraylist que esta definido en la clase y se van a llamar usando objeto.clase()
	
	public void agregarNota(double d) {
		notas.add(d);
	}
	
	public int aprobados() {
		int ap = 0;
		for (Double n:notas) {
			if (n >= 5) {
				ap ++;
			}
		}
		return ap;
	}
	
	public double media() {
		double suma = 0;
		for (Double n:notas) {
			suma += n;
		}
		return suma/notas.size();
	}
	
	public Double[] devolverNota() {
		return notas.toArray(new Double[0]);
	}
}
