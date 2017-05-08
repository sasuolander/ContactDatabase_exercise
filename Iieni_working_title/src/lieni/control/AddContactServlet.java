package lieni.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lieni.control.dao.ContactDAO;
import lieni.model.Contact;


@WebServlet("/AddContact")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddContactServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/view/NewContact.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = 0;
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Title = request.getParameter("Title");;
		String Organisation = request.getParameter("Organisation");
		String Address = request.getParameter("Address");
		String ZipCode = request.getParameter("ZipCode");
		String City = request.getParameter("City ");
		String Country = request.getParameter("Country");
		
		Contact contact = new Contact(id, FirstName, LastName, Title, Organisation, Address, ZipCode, City, Country);
		ContactDAO.Add(contact);
		response.sendRedirect("ListAll");
	}

}
