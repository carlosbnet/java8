package apploja.Servlets;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import apploja.acao.Acao;
import apploja.acao.AlteraEmpresa;
import apploja.acao.ListaEmpresas;
import apploja.acao.MostraEmpresa;
import apploja.acao.NovaEmpresa;
import apploja.acao.NovaEmpresaForm;
import apploja.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class Controlador extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String paramAcao = request.getParameter("acao");
	
		String nameClass = "apploja.acao." + paramAcao;

		String redirect=null;
		

		try {
			Class classe = Class.forName(nameClass);
			Acao acao = (Acao) classe.newInstance();
			redirect = acao.executa(request, response);
		} catch (Exception e) {
			ServerException(e);
		}

		
		
		String[] typeRedirect = redirect.split(":");

		if (typeRedirect[0].equals("forward")) {

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeRedirect[1]);
			rd.forward(request, response);

		} else {
			response.sendRedirect(typeRedirect[1]);
		}

		/*
		 * 
		 * if(paramAcao.equals("listaempresas")) {
		 * 
		 * ListaEmpresas acao = new ListaEmpresas(); redirect = acao.executa(request,
		 * response);
		 * 
		 * } else if(paramAcao.equals("removeempresa")) {
		 * 
		 * RemoveEmpresa acao = new RemoveEmpresa(); redirect = acao.executa(request,
		 * response);
		 * 
		 * } else if(paramAcao.equals("mostraempresa")) {
		 * 
		 * MostraEmpresa acao = new MostraEmpresa(); redirect = acao.executa(request,
		 * response);
		 * 
		 * }else if(paramAcao.equals("novaempresa")) { NovaEmpresa acao = new
		 * NovaEmpresa(); redirect = acao.executa(request, response);
		 * 
		 * }else if(paramAcao.equals("alteraempresa")) { AlteraEmpresa acao = new
		 * AlteraEmpresa(); redirect = acao.executa(request, response);
		 * 
		 * }else if(paramAcao.equals("novaempresaform")) { NovaEmpresaForm acao = new
		 * NovaEmpresaForm(); redirect = acao.executa(request, response); }
		 * 
		 */

	}

	private void ServerException(Exception e) {
		// TODO Auto-generated method stub

	}

}
