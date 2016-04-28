package org.chris.agenda.metier;

import java.util.Date;
import java.util.List;

import org.chris.agenda.entities.Praticien;
import org.chris.agenda.entities.Rdv;

public interface MetierRdv {
	 public Rdv addRdv(Date jour,String nom,String prenom,Long idP);
	 public Rdv addRdvC(Date jour,Long idC,Long idP);
     public List<Rdv> getAllRdv();
     public List<Rdv> getAllRdvByJour(Date jour);
     public List<Praticien> getAllRdvByPraticien(String nom);
     public void deleteRdv(Long idR);
     public void updateRdv(Rdv rdv);
     public Rdv getRdv(Long idR);
     
}
