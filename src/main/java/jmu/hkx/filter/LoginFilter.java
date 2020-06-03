package jmu.hkx.filter;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession ses = req.getSession();
		
		if( "/user/login".equals(req.getServletPath() ) || "/user/checkuserID".equals(req.getServletPath() ) || "/static/css/style.css".equals(req.getServletPath() )
		   || "/static/js/jquery.min.js".equals(req.getServletPath() )	||  "/user/register".equals(req.getServletPath() )|| ses.getAttribute("loginUser") != null || "/static/js/index.js".equals(req.getServletPath() ))
		{
			chain.doFilter(req, response);
		}
		else
		{  
			req.getRequestDispatcher("/user/loginPage").forward(req, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
