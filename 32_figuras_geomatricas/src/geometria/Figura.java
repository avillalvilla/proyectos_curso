package geometria;

public abstract class Figura {
	// atributos
	private String color;
	
	// constructor
	public Figura(String color) { 
		this.color = color;
	}
	// metodos estandar
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	// metodos abstract
	public abstract double superficie();
}
