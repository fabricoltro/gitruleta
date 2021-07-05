package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.utn.ruleta.dao.JugadorDao;
import ar.com.utn.ruleta.modelo.Jugador;
import ar.com.utn.ruleta.modelo.exceptions.RuletaException;
import controller.accionFactory.AccionFactory;
import modelo.validatorComposite.ValidatorComposite;

/**
 * Servlet implementation class JugadoresControlller
 */

public class JugadoresControlller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JugadoresControlller() {
        super();
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int codigo = request.getParameter("codigo")==null?0:Integer.parseInt(request.getParameter("codigo"));
		String nombre 	= request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String alias   	= request.getParameter("alias");
		boolean f = true;
		String strError = null;
		String accion = request.getParameter("accion");
		
		
		JugadorDao jugDao = new JugadorDao();
		Jugador jug = new Jugador(codigo, nombre, apellido, alias);	
		
		AccionFactory accionF = AccionFactory.getInscante(accion, jug);

		try {
			accionF.execute();
			request.setAttribute("jugadores", accionF.getJugadores());
			request.getRequestDispatcher("/webView/JugadoresList.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException | RuletaException e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/webView/ErrorPage.jsp").forward(request, response);

		}
		
		
// ****************  asi es sin el patron Factory********************************		
//		System.out.println(jug);
//		System.out.println(accion);
//		List<Jugador> jugadores = null;
//		try {
//			
//			if (accion.equals("agregar")){
//				strError = ValidatorComposite.getErrores(jug, ValidatorComposite.AGREGAR);
//				if(strError.isEmpty()){
//					jugDao.agregar(jug);
//					jugadores = jugDao.leer(null);
//					f=true;
//
//				} else{
//					f=false;
//				}
//					
//		} else
//			jugadores = jugDao.leer(jug);
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		if (f){
//			
//			request.setAttribute("jugadores", jugadores);
//			request.getRequestDispatcher("/webView/JugadoresList.jsp").forward(request, response);
//		}else 
//			request.setAttribute("error", strError);
//			request.getRequestDispatcher("/webView/ErrorPage.jsp").forward(request, response);
// ****************************** fint ******************************************		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}