package Hijas;

import Padre.Animales;

public class Vaca extends Animales{

    private float lecheV;	
    private int años= 365,semanas= 7;
    
	
	public Vaca(int cdrp, String fecAdq, int edad, String raza, int leche) {
		super(cdrp, fecAdq, edad, raza, leche);
		this.lecheV = lecheV;
		this.semanas = semanas;
		this.años = años;
	}

	public float getLecheV() {
		return lecheV;
	}

	public void setLecheV(int lecheV) {
		this.lecheV = lecheV;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
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
		
    	float lecheVA = lecheV/años;
    	
		return (int) lecheVA;
	}

	@Override
	public String toString() {
		return super.toString()+"Vaca [lecheV=" + lecheV + ", años=" + años + ", semanas=" + semanas + "]";
	}
	
	
    
    

}
