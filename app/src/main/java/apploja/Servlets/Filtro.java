package apploja.Servlets;


	import java.io.IOException;
	import java.rmi.ServerException;

	import javax.servlet.*;
	import javax.servlet.annotation.WebFilter;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import apploja.acao.Acao;
	import apploja.acao.AlteraEmpresa;
	import apploja.acao.ListaEmpresas;
	import apploja.acao.MostraEmpresa;
	import apploja.acao.NovaEmpresa;
	import apploja.acao.NovaEmpresaForm;
	import apploja.acao.RemoveEmpresa;




	@WebFilter("/entrada")
	public class Filtro implements Filter {

	    
	    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
	            throws IOException, ServletException {

	    	 HttpServletRequest request = (HttpServletRequest) servletRequest;
		     HttpServletResponse response = (HttpServletResponse) servletResponse;
	    	
	    	
	        System.out.println("MonitoramentoFilter");

	        long antes = System.currentTimeMillis();

	        String acao = request.getParameter("acao");

	        chain.doFilter(request, response);
   
	        long depois = System.currentTimeMillis();
	        System.out.println("Tempo de execução da acao " + acao + " -> " + (depois - antes));

	    }
	    
	    public void init(FilterConfig filterConfig) throws ServletException {
	    	// TODO Auto-generated method stub
	    
	    }


	}

