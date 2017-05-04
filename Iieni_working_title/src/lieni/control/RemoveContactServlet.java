package lieni.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RemoveContactServlet")
public class RemoveContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RemoveContactServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String remove = request.getParameter("");
		int id = Integer.parseInt(remove);
		
		response.sendRedirect("ListAll");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
