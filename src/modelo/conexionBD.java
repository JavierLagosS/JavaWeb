package modelo;

import java.sql.Connection;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class conexionBD
 */
@WebServlet("/conexionBD")
public class conexionBD {

	private static final String BD="xe";
	private static final String CONTROLADOR="com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:1521/"+BD;
	private static final String USUARIO="tryData";
	private static final String CLAVE ="12345";
	 
	public Connection conectar() {
		
		Connection conexion = null;
		try { Class.forName(CONTROLADOR);
		conexion= DriverManager.getConnection(URL,USUARIO,CLAVE);
		System.out.println("Conexion Establecida con el servidor");
		       
		} catch( ClassNotFoundException e) {
			System.out.println("Error al cargar el driver" +e.getMessage());
			e.printStackTrace();
			
		} catch(SQLException e) {
			System.out.println("Error al cargar el controlador"+e.getMessage());
			e.printStackTrace();
		} 
		return conexion;
	}
	
	
	public static void main(String[]args) {
		
		conexionBD con= new conexionBD();
	}
 } 

 
