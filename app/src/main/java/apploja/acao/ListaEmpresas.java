package apploja.acao;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apploja.modelo.Banco;
import apploja.modelo.Empresa;

public class ListaEmpresas implements Acao{

	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		
		return "forward:ListaEmpresas.jsp";
		
	}
	
	
}
