package lieni.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/view/Login.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String passwordIn=request.getParameter("password");
		String passwordD= "password"; //Password from database
		HttpSession session = request.getSession();
		
		
		PrintWriter out = response.getWriter();
		if(passwordIn.equals(passwordD)){
		response.sendRedirect("ListAll");
		//start session
		session.setAttribute("password", passwordIn);
		}else{
			out.println("<script type=\"text/javascript\">");
		       out.println("alert('User or password incorrect');");
		       out.println("location='Login.jsp';");
		       out.println("</script>");
		       
		       //response.sendRedirect("Login");
		}
		
	}

}
