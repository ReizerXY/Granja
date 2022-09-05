package Hijas;

import Padre.Animales;

public class Cabra  extends Animales{

	private float lecheC;
	private int mes = 30;
	
	

	public Cabra(int cdrp, String fecAdq, int edad, String raza, int leche) {
		super(cdrp, fecAdq, edad, raza, leche);
		this.lecheC =lecheC;
		this.mes = mes;
	}

	public float getLecheC() {
		return lecheC;
	}

	public void setLecheC(float lecheC) {
		this.lecheC = lecheC;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
    public int lechePorM (float lecheC) {
		
		float lecheVS = lecheC/mes;
		
		return (int) lecheVS;
	}

	@Override
	public String toString() {
		return super.toString()+"Cabra [lecheC=" + lecheC + ", mes=" + mes + "]";
	}
	
	
	
}
