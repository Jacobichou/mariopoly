package com.ninetindough.monopoly;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flippedshield.monopoly.Game;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String playerCount;

    /**
     * Default constructor. 
     */
    public GameServlet() {
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		playerCount = request.getParameter("playerCount");
		request.setAttribute("playerCount", playerCount);
		
//		Game.main(null);
		
		Game g = new Game().start();
		
		request.setAttribute("spaces", g.getBoard().getSpaces().get(1).getName());
		request.setAttribute("winner", "wat");//g.getWinner().getName());
		
		RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
		rd.forward(request, response);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
