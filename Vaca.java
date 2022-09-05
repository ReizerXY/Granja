package Hijas;

import Padre.Animales;

public class Vaca extends Animales{

    private float lecheV;	
    private int a�os= 365,semanas= 7;
    
	
	public Vaca(int cdrp, String fecAdq, int edad, String raza, int leche) {
		super(cdrp, fecAdq, edad, raza, leche);
		this.lecheV = lecheV;
		this.semanas = semanas;
		this.a�os = a�os;
	}

	public float getLecheV() {
		return lecheV;
	}

	public void setLecheV(int lecheV) {
		this.lecheV = lecheV;
	}

	public int getA�os() {
		return a�os;
	}

	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

	public int getSemanas() {
		return semanas;
	}

	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}
	
	public int lechePorS (float lecheV) {
		
		float lecheVS = lecheV/semanas;
		
		return (int) lecheVS;
	}
	
    public int lechePorA (float lecheV) {
		
    	float lecheVA = lecheV/a�os;
    	
		return (int) lecheVA;
	}

	@Override
	public String toString() {
		return super.toString()+"Vaca [lecheV=" + lecheV + ", a�os=" + a�os + ", semanas=" + semanas + "]";
	}
	
	
    
    

}
