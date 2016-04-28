package org.chris.agenda.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.chris.agenda.entities.Client;
import org.chris.agenda.entities.Praticien;
import org.chris.agenda.entities.Rdv;

public class DaoRdvImpl implements DaoRdv{
	    @PersistenceContext
	    private EntityManager em;

	@Override
	public Rdv addRdv(Date jour, String nom, String prenom,Long idP) {       //client non connu
		Client c =new Client(nom,prenom);
		Rdv rdv =new Rdv();
		Praticien p =em.find(Praticien.class, idP);
		rdv.setClient(c);
		rdv.setJour(jour);
		rdv.setPraticien(p);
		em.persist(rdv);
		em.close();
		return rdv;
	}

	@Override
	public List<Rdv> getAllRdv() {
		Query req =em.createQuery("select r from Rdv r");
		return req.getResultList();
	}

	@Override
	public Rdv addRdvC(Date jour, Long idC, Long idP) {                //client connu
		Rdv rdv =new Rdv();
		
		Client c =em.find(Client.class, idC);
		Praticien p =em.find(Praticien.class, idP);
		rdv.setClient(c);
		rdv.setPraticien(p);
		rdv.setJour(jour);
		em.persist(rdv);
		em.close();
		return rdv;
	}

	@Override
	public List<Rdv> getAllRdvByJour(Date jour) {
		Query req =em.createQuery("select r from Rdv r where r.jour =?");
		req.setParameter(1,jour);
		return req.getResultList();
	}

	@Override
	public List<Praticien> getAllRdvByPraticien(String nom) {
		Query req =em.createQuery("select r from Rdv r where r.praticien =?");
	    req.setParameter(1, nom);
		return req.getResultList();
	}

	@Override
	public void deleteRdv(Long idR) {
		Rdv rdv =em.find(Rdv.class, idR);
		em.remove(rdv);
		
	}

	@Override
	public void updateRdv(Rdv rdv) {
		
		em.merge(rdv);
		
	}

	@Override
	public Rdv getRdv(Long idR) {
		Rdv rdv =em.find(Rdv.class,idR);
		return rdv;
	}

	

}
