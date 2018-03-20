package br.usjt.arqsw.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Usuario;
import br.usjt.arqsw.service.UsuarioService;

public class UsuarioController {
	UsuarioService us;
	
	@Autowired
	public UsuarioController(UsuarioService us){
		this.us = us;
	}
	/**
	 * 
	 * @return Chama a p�gina de autentica��o Login.jsp
	 */
	@RequestMapping("telaLogin")
	public String telaLogin(){
		return "Login";
	}
	
	/**
	 * 
	 * @param usuario Valida usu�rio
	 * @param session 
	 * @return JSP inicial
	 */
	@RequestMapping("/fazer_Login")
	public String fazerLogin(@Valid Usuario usuario, HttpSession session){
		try {
			if(us.validar(usuario)){
				session.setAttribute(Usuario.LOGADO, usuario);
				return "index";
			}else{
				return "telaLogin";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	/*@RequestMapping("fazer_Login")
    public String efetuaLogin(@Valid Usuario usuario, HttpSession session) throws IOException {
        if(us.validar(usuario)) {
            session.setAttribute("usuarioLogado", usuario);
            return "index";
        }else{
        	return "redirect:telaLogin";
        }
        
    }*/
}
