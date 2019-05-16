package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Retrait herite de la classe Operation elle sera définie dans la BD
 * comme type de la table Operation
 * 
 * @author Nawal et Maxime
 */

@Entity
@DiscriminatorValue("Retrait")
public class Retrait extends Operation {

	public Retrait() {
		super();

	}

	public Retrait(Long idOperation, String dateOperation, double montant) {
		super(idOperation, dateOperation, montant);

	}

}
