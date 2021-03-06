package com.ApoloServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Apolo.model.Doctore;
import com.Apolo.model.Enfermera;
import com.Apolo.model.Usuarioshospital;
import com.ApoloDao.UsuarioDao;

/**
 * Servlet implementation class ServletGuardarUD
 */
public class ServletGuardarUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGuardarUD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Usuarioshospital Gusu = new Usuarioshospital();
		UsuarioDao GusuD = new UsuarioDao();
		Doctore doc = new Doctore();
		
		String id=null;
		String ced=null;
		String Usu=null;
		String cont=null;
		
		try {
			id = request.getParameter("idBus");
			ced = request.getParameter("Cdoctor");
			Usu = request.getParameter("User");
			cont = request.getParameter("Contra");
			
			
			doc.setCedula(Integer.parseInt(ced));
			Gusu.setDoctore(doc);
			
			Gusu.setUsuario(Usu);
			Gusu.setContrasena(cont);

				

		} catch (Exception e) {
		
		}
		String action = request.getParameter("btn");

		if (action.equals("Guardar")) {
			Gusu.setN_Usuario(Integer.parseInt(id));
			
			doc.setCedula(Integer.parseInt(ced));
			Gusu.setDoctore(doc);
			
			Gusu.setUsuario(Usu);
			Gusu.setContrasena(cont);
			GusuD.agregarDatosU(Gusu);
			response.sendRedirect("LoginD.jsp");
		} else if (action.equals("Actualizar")) {	


Gusu.setN_Usuario(Integer.parseInt(id));
			
			doc.setCedula(Integer.parseInt(ced));
			Gusu.setDoctore(doc);

			Gusu.setUsuario(Usu);
			Gusu.setContrasena(cont);

			GusuD.actualizarDatosU(Gusu);

		} else if (action.equals("Eliminar")) {
			Gusu.setN_Usuario(Integer.parseInt(id));
			
			doc.setCedula(Integer.parseInt(ced));
			Gusu.setDoctore(doc);
			
			Gusu.setUsuario(Usu);
			Gusu.setContrasena(cont);
			
			
			GusuD.eliminarDatosU(Gusu);
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//doGet(request, response);
	}

}
