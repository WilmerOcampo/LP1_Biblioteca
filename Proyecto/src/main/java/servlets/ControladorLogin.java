package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Empleado;
import models.ModeloEmpleado;

import java.io.IOException;

/**
 * Servlet implementation class ControladorLogin
 */
public class ControladorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ModeloEmpleado gem = new ModeloEmpleado();
	Empleado em = new Empleado();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String instruccion = request.getParameter("instruccion");
		if (instruccion.equalsIgnoreCase("Ingresar")) {
			String idempleado = request.getParameter("idempleado");
			String pass = request.getParameter("pass");
			em = gem.validar(idempleado, pass);
			if (em.getIdEmpleado() != null) {
				request.setAttribute("contrasenia", em);
				request.getRequestDispatcher("ControladorLibros?listaLibros&instruccion=listar").forward(request, response);
			} else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}*/
		
	    String instruccion = request.getParameter("instruccion");
	    if (instruccion.equalsIgnoreCase("Ingresar")) {
	        String idempleado = request.getParameter("idempleado");
	        String pass = request.getParameter("pass");
	        Empleado em = gem.validar(idempleado, pass); // Se añade la declaración del objeto Empleado
	        if (em != null && em.getIdEmpleado() != null) { // Se verifica si el objeto Empleado no es nulo
	            request.setAttribute("contrasenia", em);
	            request.getRequestDispatcher("ControladorLibros?listaLibros&instruccion=listar").forward(request, response);
	        } else {
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    } else {
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	    }
	}
}
