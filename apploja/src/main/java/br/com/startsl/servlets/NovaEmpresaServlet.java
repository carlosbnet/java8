package apploja;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		System.out.println("Cadastrando Nova Empresa!!");
		PrintWriter out = response.getWriter();

		
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		
		
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		
		System.out.println(nomeEmpresa);
		
		System.out.println(empresa.getNome());
		
		
		//Chama o JSP
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaemprecriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
				
		rd.forward(request, response);
		
	}

}
