package Modelo;

import java.sql.SQLException;

import dao.Dao_alumno;

public class Alumno {
	 private int id;
     private String nombre;
     private String correo;
     private int asignatura;
     
     public Alumno() {
    	 
     }
     
     public Alumno(int id, String nombre, String correo, int asignatura) {
    	 
    	 this.id = id;
    	 this.nombre = nombre;
    	 this.correo = correo;
    	 this.asignatura = asignatura;
    	 
     }
     
 public Alumno(String nombre, String correo, int asignatura) {
    	 
    	 this.nombre = nombre;
    	 this.correo = correo;
    	 this.asignatura = asignatura;
    	 
     }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(int asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", asignatura=" + asignatura + "]";
	}

	public void insertar() {
		
		try {
			Dao_alumno.getInstance().insert(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update() {
		
		try {
			Dao_alumno.getInstance().update(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete() {
		
		try {
			Dao_alumno.getInstance().insert(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	
     
     
}
