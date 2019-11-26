package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conection.DBConnection;
import Modelo.Alumno;

public class Dao_alumno {

	private Connection con = null;//creo variable conexion

	public static Dao_alumno instance = null;

	public Dao_alumno() throws SQLException { //objeto que me conecte a la BBDD
		  try {
		con = DBConnection.getConnection();
	
      
            con = DBConnection.getConnection();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}
    public static Dao_alumno getInstance() throws SQLException {
        if (instance == null)
            instance = new Dao_alumno();
        return instance;
    }
	public void insert(Alumno a) throws SQLException {
		PreparedStatement ps = con.prepareStatement("INSERT INTO Alumno"
				+ " (nombre, corro, asignatura) VALUES (?,?,?)");
		ps.setString(1, a.getNombre());
		ps.setString(2, a.getCorreo());
		ps.setInt(3, a.getAsignatura());
		
		ps.executeUpdate();
		ps.close();
	
		 
	}
	
	public void update(Alumno a) throws SQLException {
		PreparedStatement ps = con.prepareStatement("UPDATE Alumno SET nombre = ?, correo = ?, asignatura = ? WHERE id = ? ");
		ps.setString(1, a.getNombre());
		ps.setString(2, a.getCorreo());
		ps.setInt(3, a.getAsignatura());
		
		ps.executeUpdate();
		ps.close();

	}
	
	public void delete(Alumno a) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("DELETE from desastreconpatas WHERE id = ?");
		
		ps.setInt(1, a.getId());
	
		ps.executeUpdate();
		ps.close();
		
	}
		public ArrayList<Alumno> Alumno(){
			
			ArrayList<Alumno> lista = null;
					
				try {
					PreparedStatement ps = con.prepareStatement("SELECT * FROM Alumno");
				
				 ResultSet resultado;
				
					resultado = ps.executeQuery();
				
				 
					
						while(resultado.next()) {
							
							
							Alumno a = new Alumno(resultado.getInt("id"), resultado.getString("nombre"), 
									resultado.getString("correo"), resultado.getInt("asignatura"));
							
							lista.add(a);
	}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				return lista;
		}
		
		
	}

		
		
		
		
	
	


