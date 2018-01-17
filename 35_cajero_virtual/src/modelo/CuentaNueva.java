package modelo;

import java.util.ArrayList;

public class CuentaNueva extends Cuenta {

    private double limite;
    private ArrayList<Double> movs = new ArrayList<>();

	public CuentaNueva(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Double> getMovs() {
        return movs;
    }

    public void setMovs(ArrayList<Double> movs) {
        this.movs = movs;
    }

    @Override
	public void ingresar(double cant) {
        super.ingresar(cant);
	    movs.add(cant);
	}

	@Override
	public void extraer(double cant) {
	    super.extraer(cant);
    	movs.add(-cant);
	}
	
}
