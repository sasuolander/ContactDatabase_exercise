package lieni.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lieni.control.dao.ContactDAO;


@WebServlet("/RemoveContact")
public class RemoveContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RemoveContactServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String remove = request.getParameter("contactid");
		int id = Integer.parseInt(remove);
		ContactDAO.Remove(id);
		response.sendRedirect("ListAll");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
