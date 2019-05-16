package org.banque.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.banque.entity.Client;
import org.banque.service.BanqueService;
import org.banque.service.BanqueServiceImpl;

/**
 * Servlet implementation class ServletListeClients
 */
@WebServlet("/ServletListeClients")
public class ServletListeClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<Client> listeClients = new ArrayList<Client>();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeClients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BanqueService banqueService0 = new BanqueServiceImpl();
		listeClients = banqueService0.afficherListe();
//		for (Client client : listeClients) {
//			System.out.println(client.getPrenom());
//		}
		

		request.setAttribute("Clients", listeClients);
		RequestDispatcher facteur1 = request.getRequestDispatcher("ListeClients.jsp");
		facteur1.forward(request, response);
		//doGet(request, response);
	}

}
