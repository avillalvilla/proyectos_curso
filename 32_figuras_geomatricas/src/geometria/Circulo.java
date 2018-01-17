package geometria;

public class Circulo extends Figura {
	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double superficie() {
		double sup = Math.PI * radio * radio;
		return sup;
	}
}
