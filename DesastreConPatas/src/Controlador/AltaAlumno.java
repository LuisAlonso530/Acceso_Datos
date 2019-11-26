package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Alumno;

/**
 * Servlet implementation class altaAlumno
 */
@WebServlet("/AltaAlumno")
public class AltaAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Get chupa
	 * Post escupe
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request para que nos deje meter los datos en el objeto Alumno
		//que crearemos luego
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		int asignatura = Integer.parseInt(request.getParameter("asignatura"));
		
		//creo objeto alumno
		//y le pido que llame a sus atributos
		Alumno a = new Alumno(id, nombre, correo, asignatura);
		a.setId(id);
		a.setNombre(nombre);
		a.setCorreo(correo);
		a.setAsignatura(asignatura);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response); //llama al doGet
	}

}
