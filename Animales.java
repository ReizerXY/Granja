package Padre;

public class Animales {
	
	private int cdrp;
	private String fecAdq;
	private int edad;
	private String raza;
	
	public Animales(int cdrp, String fecAdq, int edad, String raza) {
		this.cdrp = cdrp;
		this.fecAdq = fecAdq;
		this.edad = edad;
		this.raza = raza;
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

	
}
