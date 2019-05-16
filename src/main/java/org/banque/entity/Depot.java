package org.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Depot herite de la classe Operation elle sera définie dans la BD
 * comme type de la table Operation
 * 
 * @author Nawal et Maxime
 */

@Entity
@DiscriminatorValue("Depot")
public class Depot extends Operation {

	public Depot() {
		super();

	}

	public Depot(Long idOperation, String dateOperation, double montant) {
		super(idOperation, dateOperation, montant);

	}

}
