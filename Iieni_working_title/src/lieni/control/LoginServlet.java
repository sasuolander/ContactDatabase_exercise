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

import lieni.control.dao.UserDAO;
import lieni.model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/view/Login.jsp";
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String usernameIn = request.getParameter("username");
		String passwordIn = request.getParameter("password");
		User user = null;
		user = UserDAO.FindUser(usernameIn);
		System.out.println(user.getId());
		String passwordD = user.getPassword();
		System.out.println(passwordD);
		String usernameD = user.getName();
		
		
		
		
		
		
		PrintWriter out = response.getWriter();

		if (!(user.equals(null))) {
			boolean right = usernameIn.equals(usernameD)
					&& passwordIn.equals(passwordD);
			boolean wrong_password = usernameIn.equals(usernameD);
			if (right) {
				HttpSession session = request.getSession();
				session.setAttribute("username", usernameD);
				// session last 30 min
				session.setMaxInactiveInterval(30*60);
				//response.sendRedirect("ListAll");
				
				RequestDispatcher rd=request.getRequestDispatcher("ListAll");
				rd.forward(request, response);
			
			} else if (wrong_password) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User name or password incorrect');");
				out.println("location='Login.jsp';");
				out.println("</script>");
			}
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User name or password incorrect');");
			out.println("location='Login.jsp';");
			out.println("</script>");
		}
	}

}