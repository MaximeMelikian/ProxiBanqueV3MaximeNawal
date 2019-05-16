package org.banque.entity;

import java.util.ArrayList;
import java.util.List;

import org.banque.service.BanqueService;
import org.banque.service.BanqueServiceImpl;

public class Test {


	
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