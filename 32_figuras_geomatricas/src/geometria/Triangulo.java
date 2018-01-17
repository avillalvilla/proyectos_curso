package geometria;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public Triangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double superficie() {
		double sup = base * altura / 2.0; // ponemos 2.0 para que devuelva un double sin perder los decimales de la division
		return sup;
	}
}
