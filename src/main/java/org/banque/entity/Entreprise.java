package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Entreprise herite de la classe Client elle sera définie dans la BD
 * comme type de la table Client
 * 
 * @author Nawal et Maxime
 */
@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Client {

	public Entreprise() {
		super();

	}

	public Entreprise(String nom, String prenom, String email, String adresse, String codePostal, String ville,
			String tel) {
		super(nom, prenom, email, adresse, codePostal, ville, tel);

	}

}
