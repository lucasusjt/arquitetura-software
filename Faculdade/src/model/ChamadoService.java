package model;
import java.util.ArrayList;

import model.Chamado;
public class ChamadoService {
	private Chamado chamado;
	
	public String abriChamado(Chamado abreChamado){
		abreChamado = chamado;
		//Processo de abrir o chamado
		return "Chamado Aberto";
	}
	public String fecharChamado(Chamado fechaChamado){
		fechaChamado	 = chamado;
		//Processo de fehcar o chamado
		return "Chamado Fechado";
	}
	public Chamado consultarChamado(int idChamado){
		Chamado consultaChamado = null;
		//Processo de busca do chamado
		return consultaChamado;
	}
	@SuppressWarnings("rawtypes")
	public ArrayList listarChamado(){
		ArrayList<Chamado> listaChamado = new ArrayList<Chamado>();
		//Processo de popular minha lista com os chamados
		return listaChamado;
	}
}

