package FactoryMethod_Ex2_3;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
import javax.swing.JOptionPane;

public class TesteNumero {
	
	public static void main(String[] args) {
		
		String men = "";
		FactoryNumero fn = new FactoryNumero();
		
		men = JOptionPane.showInputDialog(null, "Digite qual arquivo deseja criar\n***Obs: console ou log");
		fn.mostrar(men);
		
		
		System.exit(0);
	}

}
