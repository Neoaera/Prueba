package MavenEjemplo;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;
	/**
	 * @version V1.0
	 * @author Andres Ramos
	 *
	 */

public class Intentos {
	
	
public int[] test(int njuegos,String resultados) {
	//int njuegos ;
	String marinwins, jonawins;
	String comprobar, asegurar = "";
	int marintotal, jonatotal;
	int  arr[]= new int [2];
	

	while (njuegos != 0) {
		try{
		//njuegos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de juegos"));
		
		if(njuegos==0){
			break;			
		}
		if (njuegos > 0) {
			//String resultados = JOptionPane.showInputDialog(null,"Ingrese el resultado de los juegos");
			String ajustar = resultados.replace(" ", "");
			comprobar = ajustar.replace("1", "");
			asegurar = ajustar.replace("0", "");
			// Verificar que solo sean numeros
			if (!ajustar.replaceAll(" ", "").matches("([0-9]*)")) {
				return null;
			}
			if (njuegos == ajustar.length()) {
				if (comprobar.length() != 0 || asegurar.length() != 0) {
					marinwins = ajustar.replace("0", "");
					jonawins = ajustar.replace("1", "");
					marintotal = njuegos - marinwins.length();
					jonatotal = njuegos - jonawins.length();

					arr[0]=marintotal;
					arr[1]=jonatotal;
					
					njuegos=0;
				}
			} else {
				return null;
			}
		} else {
			njuegos++;
			return null;
		}
	}catch(Exception e){
		return null;
	}
	}
	return arr;
}
}
