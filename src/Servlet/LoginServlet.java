package Servlet;

import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  

/**
 * Servlet implementation class servlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  response.setContentType("text/html");  
	       PrintWriter out=response.getWriter();  

		String user =request.getParameter("user");
		String pass =request.getParameter("pass");
		if(user.equals("admin")&&pass.equals("1234")){  
	       // out.print("Welcome, "+user);  
	        HttpSession session=request.getSession();  
	       // session.setAttribute("name",user);
	        request.getRequestDispatcher("index.jsp").include(request, response);
	       // response.sendRedirect("index.jsp");
	        }  
	        else{ 
	        	//out.print("<html>, <body>");
	        	 //out.print("<a href='index.jsp'>Inicio</a>");
	        	 //out.print("</html>, </body>");
	        	 
	        	 request.getRequestDispatcher("error.jsp").include(request, response);
	        }  
	        out.close();
		
		
	}	
	}


