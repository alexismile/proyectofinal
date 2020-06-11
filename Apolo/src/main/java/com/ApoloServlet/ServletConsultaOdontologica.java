package com.ApoloServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Apolo.model.ConsultaOdontologica;
import com.Apolo.model.Doctore;
import com.Apolo.model.Enfermedade;
import com.Apolo.model.Paciente;
import com.ApoloDao.ConsultaOdontologicaDao;

/**
 * Servlet implementation class ServletConsultaOdontologica
 */
public class ServletConsultaOdontologica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConsultaOdontologica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ConsultaOdontologica col = new ConsultaOdontologica();
		ConsultaOdontologicaDao cold = new ConsultaOdontologicaDao();
		Doctore doc = new Doctore();
		Enfermedade enf = new Enfermedade();
		Paciente pac = new Paciente();
		
		String Codigo_ConsultaO = null;
		String Odontologo = null;
		String  Paciente = null;
		String Sintomas = null;
		String  Enfermedad_Odontologica = null;
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		try {
			Codigo_ConsultaO = request.getParameter("Codigo_ConsultaO");
			Odontologo = request.getParameter("Odontologo ");
			Paciente = request.getParameter("Paciente");
			Sintomas= request.getParameter("Sintomas");
			Enfermedad_Odontologica= request.getParameter("Enfermedad_Odontologica");
			
			
			col.setCodigo_ConsultaO(Integer.parseInt(Codigo_ConsultaO));
			
			doc.setCedula(Integer.parseInt(Codigo_ConsultaO));
			col.setDoctore(doc);
			
			pac.setCodigoExpediente(Integer.parseInt(Paciente));
			col.setPacienteBean(pac);
			
			col.setSintomas(Sintomas);
			
			enf.setEnfermedad(Integer.parseInt(Enfermedad_Odontologica));
			col.setEnfermedade(enf);
		
			
		}catch (Exception e) {
			System.out.println(e+"Error");
		}
		String acction=request.getParameter("btnEnviar");
		
		if(acction.equals("Recetar")) {	 
			
			col.setCodigo_ConsultaO(Integer.parseInt(Codigo_ConsultaO));
			col.setDoctore(doc);
			col.setPacienteBean(pac);
			col.setSintomas(Sintomas);
			col.setEnfermedade(enf);
			
			
			
			
			 cold.agregarDatos(col);
			 	 
			 }
		
		
		 response.sendRedirect("RecetarOdonto.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
