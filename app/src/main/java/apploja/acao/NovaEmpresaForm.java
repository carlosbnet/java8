package apploja.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apploja.modelo.Banco;
import apploja.modelo.Empresa;

public class NovaEmpresaForm implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		
		return "forward:FormEmpresa.jsp";
		


	}

}
