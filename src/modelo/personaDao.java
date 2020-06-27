package modelo;

import java.sql.Connection;

@WebServlet("/personaDao")
public class personaDao {
	
	PreparedStatement ps;
	ResultSet rs;
	// hace referencia a la clase coneccion
	conexionBD c= new conexionBD();
	Connection con;
	
	//metodo para listar*/
//agrego por defaut el persona 
	public List<persona> listar() {
		List<persona>lista= new ArrayList<>();
		
		String sql="SELECT * FROM TABLA.TABLA;";
		try {
		
		con = c.conectar();
		ps= con.prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			Persona p= new persona();
			p.setId(rs.getString(1));
			p.setNom(rs.getString(2));
			lista.add(p);
		}
	}catch (Exception e) {
		
	}return lista;
	
	}
	
	
	
	//metodo para agregar desde aca vamoa al controlador al segundo caso/
	public  int agregar(Persona p) {
		int r=0;
		
		
		  String query = "INSERT INTO TABLA (Id, nombre) values (?, ?)";
		try {
			
			con= c.conectar();
			ps=con.prepareStatement(query);
			
			ps.setString(1, p.getId());
			ps.setString(2, p.getNom());
			r=ps.executeUpdate();
			if(r==1) {
				r=1;
			}else {
				r=0;
			}
			
			
		}catch(Exception e) {
			
		}
		return r;
		
		
		
	}
}
