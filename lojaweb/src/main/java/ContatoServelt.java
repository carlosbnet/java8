import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.alura.maven.Produto;
import br.com.caelum.stella.tinytype.CPF;


@WebServlet(urlPatterns = {"/contato"})
public class ContatoServelt extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        new CPF("22265926302").isValido();

        new Produto("Salame",1.5);

        PrintWriter write = response.getWriter();

        write.println("<html><h2>Fale conosco</h2></html>");
        write.close();

    }


}
