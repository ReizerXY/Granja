package Metodos;

import javax.swing.JOptionPane;

public class Operaciones {
	
	public static void imprimirMSJE(String Msje) {
		
		JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.QUESTION_MESSAGE);
	}
	
   public static void imprimirErrorMSJE(String Msje) {
		
		JOptionPane.showMessageDialog(null, Msje,"Salida",JOptionPane.ERROR_MESSAGE);
	}
	
   public static String seleccionBoton(String menu) {
	   String opcion[]= {"Leche vaca sem","Leche vaca anual","Leche cabra men"};
	   int n;
	   n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
	   return (opcion[n]);
   }
   
   public static Float leerFloat(String msje) {
		
		return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
	}
   
   public static int leerInt(String msje) {
		
		return(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura",JOptionPane.QUESTION_MESSAGE)));
	}
   
   public  static  String leerString(String msje){ 
		
		return  JOptionPane.showInputDialog(null,"Entrada de datos",msje,JOptionPane.QUESTION_MESSAGE);
	}

}
