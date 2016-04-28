package org.chris.agenda.metier;

import java.util.Date;
import java.util.List;

import org.chris.agenda.dao.DaoRdv;
import org.chris.agenda.entities.Praticien;
import org.chris.agenda.entities.Rdv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class MetierRdvImpl implements MetierRdv{
	         
              private DaoRdv dao;           
	@Override
	public Rdv addRdv(Date jour, String nom, String prenom,Long idP) {
		
		return dao.addRdv(jour, nom, prenom,idP);
	}

	@Override
	public List<Rdv> getAllRdv() {
		
		return dao.getAllRdv();
	}

	public void setDao(DaoRdv dao) {         //setter inj dep
		this.dao = dao;
	}

	@Override
	public Rdv addRdvC(Date jour, Long idC, Long idP) {
		
		return dao.addRdvC(jour, idC, idP);
	}

	@Override
	public List<Rdv> getAllRdvByJour(Date jour) {
	
		return dao.getAllRdvByJour(jour);
	}

	@Override
	public List<Praticien> getAllRdvByPraticien(String nom) {
		
		return dao.getAllRdvByPraticien(nom);
	}

	@Override
	public void deleteRdv(Long idR) {
	    dao.deleteRdv(idR);
		
	}

	@Override
	public void updateRdv(Rdv rdv) {
		dao.updateRdv(rdv);
		
	}

	@Override
	public Rdv getRdv(Long idR) {
		
		return dao.getRdv(idR);
	}

}
