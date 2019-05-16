package org.banque.entity;

import java.util.ArrayList;
import java.util.List;

import org.banque.service.BanqueService;
import org.banque.service.BanqueServiceImpl;

<<<<<<< HEAD
public class Test {
=======
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
>>>>>>> d39b5c89968f4173f58710b12496aea24e04e2a8


	
	public static void main(String[] args) {
		
		List<Client> listeClients = new ArrayList<Client>();
		
		BanqueService banqueService0 = new BanqueServiceImpl();
		listeClients = banqueService0.afficherListe();
		for (Client client : listeClients) {
			System.out.println(client.getPrenom());
		}
//		Client c = new Client();
//		c.setNom("Jacques");
//		c.setPrenom("Chirac");
//		c.setAdresse("1 Place de la Bastille");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction txn = em.getTransaction();
//		try {
//			txn.begin();
//			em.persist(c);
//			txn.commit();
//
//		} catch (Exception e) {
//			if (txn != null) {
//				txn.rollback();
//			}
//			e.printStackTrace();
//
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
	}
}