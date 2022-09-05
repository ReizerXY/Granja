package Arreglo;

import Padre.Animales;
import Hijas.Vaca;
import Hijas.Cabra;
import Metodos.Operaciones;

public class Array {

	private Animales Ani[];
	private byte i;
	
	public Array() {
		Ani = new Animales[20];
		i = -1;
	} 
	
	public boolean arrayVacio() {
		return i==-1;
	}
	
	public boolean espacioArray() {
		return i<Ani.length-1;
	}
	
	public Vaca crearObjetoVaca() {
		
		return (new Vaca(12345,"23/02/2000",23,"Roja",23));
	}
	
    public Cabra crearObjetoCabra() {
		
		return (new Cabra(67890,"23/02/2001",32,"Blanca",23));
	}
    
    public int lechePorS (float lecheV) {
    	int semanas= 7;
		
		float lecheVS = lecheV/semanas;
		
		return (int) lecheVS;
	}
    
    public int lechePorA (float lecheV) {
    	
    	int años=365;
		
    	float lecheVA = lecheV/años;
    	
		return (int) lecheVA;
	}

    
    public int lechePor (float lecheC) {
		
    	int mes=30;
    	
		float lecheVS = lecheC/mes;
		
		return (int) lecheVS;
	}
    
    public void imprimirUni() {
		String cad= "Imprision de editorial\n";
		for (int f=0; f<=i;f++) {
			cad+= f+")"+Ani[f].toString()+"\n";
		}
	}
	
	public void agregarFigurasArray()
	  {
	  String sel; 
	  if (espacioArray())
	  {
	  do {
	  sel=Operaciones.seleccionBoton("Selecciona opcion:\n");
	  switch (sel) {
	  case "Leche vaca sem":  Ani[i+1]=crearObjetoVaca();
			 lechePorS(i); i++;break;
	  case "Leche vaca anual":   Ani[i+1]=crearObjetoVaca(); i++;break;  
	  case "Leche cabra men": Ani[i+1]=crearObjetoCabra(); i++;break;
	      }
	  } while (!"SALIR".equals(sel));

	  }
	  
	  else Operaciones.imprimirErrorMSJE("Arreglo lleno!!!!!!!!!!!!!!!");  
	}
	
}
