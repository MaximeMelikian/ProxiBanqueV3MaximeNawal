package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Pariculier herite de la classe Client elle sera définie dans la BD
 * comme type de la table Client
 * 
 * @author Nawal et Maxime
 */
@Entity
@DiscriminatorValue("Particulier")
public class Particulier extends Client{

	public Particulier() {
		super();
	
	}

	public Particulier(String nom, String prenom, String email, String adresse, String codePostal, String ville,
			String tel) {
		super(nom, prenom, email, adresse, codePostal, ville, tel);
		
	}
	

}
