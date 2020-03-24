package apploja.Servlets;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import apploja.acao.Acao;
import apploja.acao.AlteraEmpresa;
import apploja.acao.ListaEmpresas;
import apploja.acao.MostraEmpresa;
import apploja.acao.NovaEmpresa;
import apploja.acao.NovaEmpresaForm;
import apploja.acao.RemoveEmpresa;
import apploja.modelo.Banco;
import apploja.modelo.Empresa;

@WebServlet("/empresas")
public class ListaEmpresaService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String valor = request.getHeader("Accept");

		Gson gson = new Gson();

		List<Empresa> empresas = new Banco().getEmpresas();

		XStream xstream = new XStream();

		if (valor.endsWith("xml")) {
			
			xstream.alias("empresa", Empresa.class);
			String xml = xstream.toXML(empresas);

			response.setContentType("application/xml");
			response.getWriter().print(xml);
			
		} else if (valor.endsWith("json")) {
			
			String json = gson.toJson(empresas);

			response.setContentType("application/json");
			response.getWriter().print(json);

		}else {
			response.getWriter().print("{'message': 'no content'}");
		}

	}
}
