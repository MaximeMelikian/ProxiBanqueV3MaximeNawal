package org.banque.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 * La classe Conseiller est javabean qui regroupe les informations concernant un conseiller
 * son id,nom,prenom,login et password 
 * 
 * @author Nawal et Maxime
 */
@Entity
public class Conseiller implements Serializable{
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long idConseiller;
		private String login;
		private String password;
		private String nom;
		private String prenom;
		
		@OneToMany(mappedBy ="conseiller", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
		private Set<Client> cli = new HashSet<Client>();
		
		//constructeur
		public Conseiller() {
			super();
		}


		public Conseiller(String login, String password, String nom, String prenom) {
			super();
			this.login = login;
			this.password = password;
			this.nom = nom;
			this.prenom = prenom;
		}

     //getters et setters
		public Long getIdConseiller() {
			return idConseiller;
		}


		public void setIdConseiller(Long idConseiller) {
			this.idConseiller = idConseiller;
		}


		public String getLogin() {
			return login;
		}


		public void setLogin(String login) {
			this.login = login;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
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


		@Override
		public String toString() {
			return "Conseiller [idConseiller=" + idConseiller + ", login=" + login + ", password=" + password + ", nom="
					+ nom + ", prenom=" + prenom + "]";
		}
		
		
		
}
