package FactoryMethod_Ex2_1;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
public class TesteNome {

	public static void main(String[] args) {
		FactoryNome fn = new FactoryNome();
		
		String nome = "José";
		String sobrenome = "Roberto";
		
		fn.getNome(nome, sobrenome);

	}

}
