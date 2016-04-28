package org.chris.agenda.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rdv implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idR;

	public Rdv(Long idR, Date jour) {
		super();
		this.idR = idR;
		this.jour = jour;
	}

	@Temporal(TemporalType.DATE)
	private Date jour;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idP")
	private Praticien praticien;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idC") // plusieurs rdv a un client mais unique.
	private Client client;

	public Rdv() {

	}

	public Long getIdR() {
		return idR;
	}

	public void setIdR(Long idR) {
		this.idR = idR;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
