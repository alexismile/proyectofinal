package com.ApoloDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Apolo.model.ConsultaOdontologica;


public class ConsultaOdontologicaDao {
	
	
	public void agregarDatos(ConsultaOdontologica cold) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Apolo");
		em =emf.createEntityManager();
		
		em.getTransaction().begin();
        em.persist(cold);
		em.flush();
		em.getTransaction().commit();
	}
	


}
