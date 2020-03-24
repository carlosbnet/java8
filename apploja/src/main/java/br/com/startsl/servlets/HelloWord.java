package apploja;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/contato")
public class HelloWord extends HttpServlet {


	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Ola me chamo carlos vandson</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	
}
