package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe CompteEpargne herite de la classe Compte elle sera définie dans la
 * BD comme type de la table Compte
 * 
 * @author Nawal et Maxime
 */

@Entity
@DiscriminatorValue("CEpargne")
public class CompteEpargne extends Compte {

	public static final double TAUXREMUNERATION = 0.03;

	// constructeur
	public CompteEpargne() {
		super();

	}

	public CompteEpargne(Long idCompte, String numeroCompte, double solde, String dateCreation) {
		super(idCompte, numeroCompte, solde, dateCreation);

	}

	// getter
	public static double getTauxremuneration() {
		return TAUXREMUNERATION;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getIdCompte()=" + getIdCompte() + ", getNumeroCompte()=" + getNumeroCompte()
				+ ", getSolde()=" + getSolde() + ", getDateCreation()=" + getDateCreation() + "]";
	}

}
