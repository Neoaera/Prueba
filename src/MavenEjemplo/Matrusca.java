package MavenEjemplo;

import javax.swing.JOptionPane;

public class Matrusca {
/**
 * @author Andres Ramos
 * @version 0,1
 * 
 */
	public static void main(String[] args) {
		try{
		int numdemunh= Integer.parseInt(JOptionPane.showInputDialog("Cuantas Mu�ecas hay?"));
		int tamdemun[]=new int[numdemunh];
		for(int i=0;i<tamdemun.length;i++){
			int j=i+1;
			tamdemun[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tama�o de la Matryoshka numero "+j));
			if(i!=0){
				int k = i-1;
				if(i==k){
					System.out.println("IMPOSIBURUUUU!!");
				}else{
					System.out.println("Pato");
				}
			}
		}
		}catch(Exception e){
			System.out.println("solamente tiene que ingresar numeros enteros");
		}
	}

}