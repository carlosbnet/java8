package apploja.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import apploja.modelo.Banco;
import apploja.modelo.Usuario;

public class Login implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();

		Usuario usuario = banco.existeUsuario(login,senha);
		
		
		
		if(usuario != null) {
			System.out.println("Usuario "+login+" acabou de logar");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			System.out.println(sessao.getId());
			return "redirect:/entrada?acao=ListaEmpresas";
		}else {
			return "redirect:/entrada?acao=LoginForm";
		}
	}

}
