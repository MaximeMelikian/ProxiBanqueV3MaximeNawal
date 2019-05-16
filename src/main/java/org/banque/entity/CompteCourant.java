package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe CompteCourant herite de la classe Compte elle sera définie dans la
 * BD comme type de la table CompteBancaire
 * 
 * @author Nawal et Maxime
 */

@Entity
@DiscriminatorValue("CCourant")
public class CompteCourant extends Compte {

	public static final double DECOUVERTEMAX = 1000;

	
	//constructeur
	public CompteCourant() {
		super();
		
	}

	public CompteCourant(Long idCompte, String numeroCompte, double solde, String dateCreation) {
		super(idCompte, numeroCompte, solde, dateCreation);
		
	}
    //getter
	public static double getDecouvertemax() {
		return DECOUVERTEMAX;
	}

}
