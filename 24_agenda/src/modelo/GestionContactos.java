package modelo;

import java.util.HashMap;

public class GestionContactos {
	HashMap<String, String> contactos = new HashMap<>();
	
	// añadir pidiendo email y nombre, si ya existe a error
	public boolean anadir(String email, String nombre) {
		if (!contactos.containsKey(email)){
			contactos.put(email, nombre);
			return true;
		}
		else { 
			return false;
		}
	}
	
	// buscar contacto por el email
	public String buscar(String email) {
		return contactos.get(email);
	}
	// eliminar contacto por el email
	public boolean eliminar(String email) {
		if (contactos.containsKey(email)) {
			contactos.remove(email);
			return true;
		}
		else {
			return false;
		}
	}
	
	// mostrar todos los nombres de contactos
	public String[] devolverNombres() {
		String [] nombres = (contactos.values()).toArray(new String[0]);
		return nombres;
	}
}
