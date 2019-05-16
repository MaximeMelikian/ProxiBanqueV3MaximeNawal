package org.banque.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
 * La classe Client est un javabean qui regroupe toutes les informations
 * concernant un client 
 * elle est classe mère de la classe Entreprise et la
 * classe Particulier
 * 
 * @author Nawal et Maxime
 */
@Entity
@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Client", discriminatorType = DiscriminatorType.STRING)
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String codePostal;
	private String ville;
	private String tel;
	
	
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;
	
	@OneToMany(mappedBy = "client",cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Compte> compte = new HashSet<Compte>();

	// constructeur
	public Client() {
		super();
	}

	public Client(String nom, String prenom, String email, String adresse, String codePostal, String ville,
			String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
	}

	public Client(Long idClient, String nom, String prenom, String email, String adresse, String codePostal,
			String ville, String tel) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		
	}

public Client(Long idClient, String nom, String prenom, String email, String adresse, String codePostal,
			String ville, String tel, Conseiller conseiller, Set<Compte> compte) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		this.conseiller = conseiller;
		this.compte = compte;
	}

	//getters & setters
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", tel=" + tel + "]";
	}

}
