package com.ninetindough.monopoly;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flippedshield.monopoly.Game;
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
	private static HttpServletRequest request;
	private static HttpServletResponse response;

    /**
     * Default constructor. 
     */
    public GameServlet() {
    	System.out.println("MORE THAN ONCE????");
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
		
		System.out.println("PLAYER " + playerCount);
		System.out.println("GAME " + g);
		
		//start game only if not started already
		if(g == null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
			rd.forward(request, response);
			g = new Game().run(playerCount);
		} else
		{
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			CharSequence s = String.valueOf(round.getRoundNumber());
			response.getWriter().append(s);
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
