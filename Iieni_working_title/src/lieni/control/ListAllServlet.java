package lieni.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lieni.control.dao.SearchContactDAO;
import lieni.model.Contact;


@WebServlet("/ListAll")
public class ListAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListAllServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Contact>contacts= new ArrayList<Contact>();
		SearchContactDAO FindAll= new SearchContactDAO();
		
		contacts = FindAll.SearchAllArray();
		
		request.setAttribute("contactList", contacts);
		String jsp = "view/Mainpage.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
		
		//Iieni(working title)/WebContent/View/Mainpage.jsp
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
