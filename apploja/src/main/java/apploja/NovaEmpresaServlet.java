package apploja;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

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
		
		out.println("<html><body>Cadastrando a empresa</body></html>");
		
		String nomeEmpresa = request.getParameter("nome");
		
		System.out.println(nomeEmpresa);
		
	
		
		
		
		
	}

}
