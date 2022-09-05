package Padre;

public class Animales {
	
	private int cdrp;
	private String fecAdq;
	private int edad;
	private String raza;
	private float leche;
	
	public Animales(int cdrp, String fecAdq, int edad, String raza, int leche) {
		this.cdrp = cdrp;
		this.fecAdq = fecAdq;
		this.edad = edad;
		this.raza = raza;
		this.leche = leche;
	}
	public int getCdrp() {
		return cdrp;
	}
	public void setCdrp(int cdrp) {
		this.cdrp = cdrp;
	}
	public String getFecAdq() {
		return fecAdq;
	}
	public void setFecAdq(String fecAdq) {
		this.fecAdq = fecAdq;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public float getLeche() {
		return leche;
	}
	public void setLeche(float leche) {
		this.leche = leche;
	}
	@Override
	public String toString() {
		return "Animales [cdrp=" + cdrp + ", fecAdq=" + fecAdq + ", edad=" + edad + ", raza=" + raza + "]";
	}

	
}
