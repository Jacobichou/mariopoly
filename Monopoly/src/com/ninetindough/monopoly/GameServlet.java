package com.ninetindough.monopoly;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flippedshield.monopoly.Game;
import com.flippedshield.monopoly.Player;
import com.flippedshield.monopoly.Round;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String playerCount;
	private Game g;
	private static Round round;
	private String[] players;
	private static HttpServletRequest request;
	private static HttpServletResponse response;

    /**
     * Default constructor. 
     */
    public GameServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.request = request;
		this.response = response;
		
//		playerCount = request.getParameter("playerCount") == null ? "2" : request.getParameter("playerCount");
		
		if(playerCount == null)
		{
			playerCount = request.getParameter("playerCount");
		}
		
		if(request.getParameter("newGame") != null && request.getParameter("newGame").equals("1")){
			g = null;
//			round = null;
		}
		
		//start game only if not started already
		if(g == null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
			rd.forward(request, response);
			g = new Game().run(playerCount);
			players = new String[round.getPlayers().size()];
			for(Player p : round.getPlayers())
			{
				players[round.getPlayers().indexOf(p)] = p.getName();
			}
		} else
		{
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
//			if(round!=null){
				CharSequence s = String.valueOf(round.getRoundNumber());
				response.getWriter().append("Round: " + s + "<br />");
//			}
			
			
			for(int i = 0; i < players.length; i++){
				response.getWriter().append("Player 1: " + players[i] + "<br />");
				response.getWriter().append("Money: $" + String.valueOf(round.getPlayers().get(i).getWealth()) + "<br />");
			}
			 //round.getPlayers().get(0).getName()
			
			try {
				Game.stepRound();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public static void refresh(Round r) throws ServletException, IOException
	{
		round = r;
//		response.getWriter().append("BANNANANANS\n\r");
//		RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
//		rd.forward(request, response);
	}

}
