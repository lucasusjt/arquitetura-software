package FactoryMethod_Ex2_1;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
public class FactoryNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
