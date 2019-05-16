package org.banque.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * La classe CompteBancaire est un javabean elle est canditate a etre persitée
 * elle est classe mère de CompteCourant et CompteEpargne
 * 
 * @author Nawal et Maxime
 */
@Entity
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Compte", discriminatorType = DiscriminatorType.STRING)
public class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompte;
	private String numeroCompte;
	private double solde;
	private String dateCreation;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@OneToMany(mappedBy = "compte",cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	List<Operation> operation = new ArrayList<Operation>();

	// constructeur
	public Compte() {
		super();
	}

	public Compte(String numeroCompte, double solde, String dateCreation) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public Compte(Long idCompte, String numeroCompte, double solde, String dateCreation) {
		super();
		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	// getters et setters
	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperation() {
		return operation;
	}

	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numeroCompte=" + numeroCompte + ", solde=" + solde
				+ ", dateCreation=" + dateCreation + ", client=" + client + ", operation=" + operation + "]";
	}

	

	

}
