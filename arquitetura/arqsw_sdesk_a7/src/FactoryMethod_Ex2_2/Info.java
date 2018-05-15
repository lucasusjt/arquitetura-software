package FactoryMethod_Ex2_2;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
public class Info extends Texto{
	
	public Info(){
		
	}
	public Info(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
