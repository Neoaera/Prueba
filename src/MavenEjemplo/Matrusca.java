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
		int numdemunh= Integer.parseInt(JOptionPane.showInputDialog("Cuantas Muñecas hay?"));
		int tamdemun[]=new int[numdemunh];
		for(int i=0;i<tamdemun.length;i++){
			int j=i+1;
			tamdemun[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de la Matryoshka numero "+j));
			if(i!=0){
				int k = i-1;
				if(tamdemun[i]==tamdemun[k]){
					JOptionPane.showMessageDialog(null, "LA ACCION NO SE PUEDE REALIZAR\nEL PROGRAMA SE CERRARÁ");;
					break;
				}else{
					System.out.println("Pato");
				}
			}
		}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"SOLAMENTE INGRESE NUMEROS ENTEROS");
		}
	}

}
