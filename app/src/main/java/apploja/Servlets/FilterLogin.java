package apploja.Servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterLogin implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
			
	 
	       HttpServletRequest request = (HttpServletRequest) servletRequest;
	        HttpServletResponse response = (HttpServletResponse) servletResponse;

	        String paramAcao = request.getParameter("acao");
	        
	        System.out.println("Entrou no Filtro de Login");

	        HttpSession sessao = request.getSession();
	        boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
	        boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
	        
	        
	        if(ehUmaAcaoProtegida & usuarioNaoEstaLogado) {
	            response.sendRedirect("entrada?acao=LoginForm");
	            return;
	        }

	        chain.doFilter(request, response);

	    }

	
	
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}
	

}