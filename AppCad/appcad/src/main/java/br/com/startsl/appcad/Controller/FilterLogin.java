package br.com.startsl.appcad.Controller;

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

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		
		HttpServletRequest request =  (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String acao = request.getParameter("acao");
		
		
		//Se o cokkie estiver setado entao na logica ele tem que esta logado
		
		HttpSession session = request.getSession();
		
		boolean isLog = (session.getAttribute("userLog") == null);
		
		//temos que fazer um redirecionamento toda vez que indicar que nao esta logado
		//vamos trabalhar no conceito de permissão quais serão as paginas que ele pode usar
		
		boolean isProtected = !(acao.equals("login"));
		
		
		
		if(isLog && isProtected) {

		    response.sendRedirect("index.jsp");
		   
            return;
			
			//Desvia a rota para o inicio
		}
		
		chain.doFilter(request, response);

	}
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	
	}

}
