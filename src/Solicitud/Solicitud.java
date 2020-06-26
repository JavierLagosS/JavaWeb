package Solicitud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Solicitud
 */
@WebServlet("/Solicitud")
public class Solicitud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Solicitud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html:charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		 ConexionBd c = new ConexionBd();
		 if(request.getParameter("accion")!=null) {
			 LinkedList <persona> lista= c.consultaPersona("select * FROM  INGRESO;");
		
		 for (int i=0;i<lista.size();i++) {
			 response.sendRedirect("tabla.jsp?ID="+lista.get(i).getId()+"&NOMBRE="+lista.get(i).getNombre()+"&APELLIDO"+lista.get(i).getApellido()+"&RUT"+lista.get(i).getRut()
					 +"&CIUDAD"+lista.get(i).getCiudad()+"&EMAIL="+lista.get(i).getEmail()+"TELEFONO="+lista.get(i).getTelefono());
			 
			 
		 }
		 }
	}
}
		 
	


