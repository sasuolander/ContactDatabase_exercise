package lieni.control.filter;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/SecurityFilter")
public class SecurityFilter implements Filter {
	
	private ServletContext context;

	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("AuthenticationFilter initialized");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession(true);
		String username = (String) session.getAttribute("username");
		
		String loginURL = req.getContextPath() + "/Login.jsp";
		if(req.getRequestURI().equals(loginURL)||username !=null){
			chain.doFilter(request, response);
		}else{
			res.sendRedirect("/Login.jsp");
		}			
	}
	public void destroy() {
		//close any resources here
	}
}
