package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controlador
 */
@WebServlet("/controlador")
public class controlador extends HttpServlet {
	
	PersonaDao dao= new PersonaDao();
	Persona p= new Persona();
	
	static final long serialVersionUID = 1L;
	
    public controlador() {
        super();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String accion= request.getParameter("accion");
      
      switch (accion) {
      case "listar":
    	  List<Persona> datos = dao.listar();
    	  request.setAttribute("datos", datos);
    	  request.getRequestDispatcher("index.jsp").forward(request, response);
 
    	   break;
    	   
    	   
       case "Agregar":
    	   
    request.getRequestDispatcher("Agregar.jsp").forward(request, response);
    break;
    //metodo para guardar si el usuario presiona el boton aca lo redirecciona//
       case "guardar":
    	   String id=request.getParameter("txtid");
    	   String nom=request.getParameter("txtnom");
    	
           
            p.setId(id);
            p.setNom(nom);
            dao.agregar(p);
            //agregamos al metodo listar automaticamente al agregar//
            request.getRequestDispatcher("controlador?accion=listar").forward(request, response);
    
    
    
    default: throw new AssertionError();
      }
			
		
}}