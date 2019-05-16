package org.banque.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Client c = new Client("DUPONT", "Claire", "cd@gmail.com", "7,rue Frida Kahlo", "75012", "Paris", "0625889855");
//		Compte cp =new Compte("12L45P54", 15200, "02/04/2015");
//		Operation op= new Operation("10/05/2019", 120);
		
		
//		c.setNom("ALOZADE");
//		c.setPrenom("nawal");
//		c.setAdresse("1 rue Rivoli");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
		
			em.persist(c);
//			em.persist(cp);
//			em.persist(op);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}