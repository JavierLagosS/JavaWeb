package datos;

import datos.persona;
import java.util.*;

public class ConexionBd {
	Connection conexion = null;
	PreparedStatement ps= null;
	ResultSet rs=null;
	
	//la ruta del motor donde la busca

		Connection con;
		//Metodo para acceder a la BD
		private final String stringConexion = "jdbc:oracle:thin:@localhost:1521:xe";
		public Connection obtenerConexion(){
			
			
		
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conexion = DriverManager.getConnection(stringConexion, "MVCPRUEBA","123456");
				System.out.println("Conectado");
			
			} 
			
			catch (ClassNotFoundException e) {
				System.out.println("Error:"+e.getMessage());
			}
			catch(SQLException e){
				System.out.println("Error en la conexión");
			}
			return conexion;
		}
		

		
		//metodo para listar
		public LinkedList <persona>consultaPersona(String conSQL) {
			LinkedList<persona> iclient = new LinkedList<persona>();
			try {
			ps= obtenerConexion().prepareStatement(conSQL);
			rs= ps.executeQuery();
			
			/* mientras existan datos se sigan cargano*/
			while(rs.next()) {
				
	           persona per = new persona ();

	           //devulve resultados tabla base de datos
			;
				per.setId(rs.getString("ID"));
				per.setNombre(rs.getString("NOMBRE"));
				per.setApellido(rs.getString("APELLIDO"));
				per.setRut(rs.getString("RUT"));
				per.setCiudad(rs.getString("CIUDAD"));
				per.setEmail(rs.getString("EMAIL"));
				per.setTelefono(rs.getString("TELEFONO"));
			
				iclient.add(per);
			}
			
			ps.close();
			rs.close();
			}catch(Exception ex) {
				System.out.println("Error ACA"+ex.getMessage());
			}
		return iclient;

}}

