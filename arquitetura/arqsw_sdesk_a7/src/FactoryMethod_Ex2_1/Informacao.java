package FactoryMethod_Ex2_1;
/**
 * 
 * @author Lucas Oliveira de Paula
 * 			816122485
 *
 */
public class Informacao extends Nome{
	
	public Informacao(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println(nome + " " + sobrenome + "\n" + sobrenome + ", " + nome);
	}
	
}
