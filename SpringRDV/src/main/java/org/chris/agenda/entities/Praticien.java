package org.chris.agenda.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Praticien implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
         private Long idP;
         private String nomP;
		 private String prenomP;
    @OneToMany(mappedBy="praticien",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
         private Collection<Rdv> rdv;
	public Praticien() {
	
	}
	public Praticien(Long idP, String nomP, String prenomP) {
		super();
		this.idP = idP;
		this.nomP = nomP;
		this.prenomP = prenomP;
	}
	public Long getIdP() {
		return idP;
	}
	public void setIdP(Long idP) {
		this.idP = idP;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getPrenomP() {
		return prenomP;
	}
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}
	public Collection<Rdv> getRdv() {
		return rdv;
	}
	public void setRdv(Collection<Rdv> rdv) {
		this.rdv = rdv;
	}
    
}
