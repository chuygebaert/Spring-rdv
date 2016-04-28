package org.chris.agenda.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idC;
	@NotEmpty
	private String nomC;
	private String prenomC;
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	// le client peut obtenir plusieurs rdv
	private Collection<Rdv> rdv;

	public Client() {

	}

	public Client(String nomC, String prenomC) {
		super();

		this.nomC = nomC;
		this.prenomC = prenomC;
	}

	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
	}

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public String getPrenomC() {
		return prenomC;
	}

	public void setPrenomC(String prenomC) {
		this.prenomC = prenomC;
	}

	public Collection<Rdv> getRdv() {
		return rdv;
	}

	public void setRdv(Collection<Rdv> rdv) {
		this.rdv = rdv;
	}
}
