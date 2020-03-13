package apploja;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		Empresa empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		Empresa empresa3 = new Empresa();
		
		
		
		empresa.setNome("Alura Plus");
		empresa2.setNome("Codigo Fonte");
		empresa3.setNome("Alura Live");
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		banco.adiciona(empresa2);
		banco.adiciona(empresa3);
		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();

		List<Empresa> lista = banco.getEmpresas();
	
		
		//Enviando para o JSP
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaempresas.jsp");
		
		request.setAttribute("empresas", lista);
		
		rd.forward(request, response);

					
				
				
	
		
	}



}
