package FactoryMethod_Ex2_2;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FactoryTexto {
	public Texto getTexto(String texto){
		return new Info(texto);
	}
	
	public void publico(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream(
		          "Public.txt"));
		 
		        out.println(" Este arquivo é público " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
	
	public void confidencial(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream(
		          "Confidencial.txt"));
		 
		        out.println(" Este arquivo é confidencial " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
}
