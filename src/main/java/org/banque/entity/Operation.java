package org.banque.entity;

import java.io.Serializable;

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

/**
 * La classe Operation est un javabean elle est classe mère de la classe Retrait
 * et la classe Depot
 * 
 * @author Nawal et Maxime
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Operation", discriminatorType = DiscriminatorType.STRING)
public class Operation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOperation;
	private String dateOperation;
	private double montant;

	@ManyToOne
	@JoinColumn(name = "compteBancaire_id")
	private Compte compte;

	// constructeur
	public Operation() {
		super();
	}

	public Operation(Long idOperation, String dateOperation, double montant) {
		super();
		this.idOperation = idOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Operation(String dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	// getters et setters
	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", dateOperation=" + dateOperation + ", montant=" + montant
				+ "]";
	}

}
