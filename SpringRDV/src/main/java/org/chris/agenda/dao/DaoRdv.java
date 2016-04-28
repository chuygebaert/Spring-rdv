package org.chris.agenda.dao;

import java.util.Date;
import java.util.List;

import org.chris.agenda.entities.Praticien;
import org.chris.agenda.entities.Rdv;

public interface DaoRdv {
         public Rdv addRdv(Date jour,String nom,String prenom,Long idP); //new client pas d'idC
         public Rdv addRdvC(Date jour,Long idC,Long idP);  //client connu
         public List<Rdv> getAllRdv();
         public List<Rdv> getAllRdvByJour(Date jour);
         public List<Praticien> getAllRdvByPraticien(String nom);
         public void deleteRdv(Long idR);
         public void updateRdv(Rdv rdv);                //rdv existe doc = paramètre
         public Rdv getRdv(Long idR);
         
}
