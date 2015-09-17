package com.ninetindough.monopoly;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

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
	private Map<String, Player> people;
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
			people = new HashMap<String, Player>();
			RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
			rd.forward(request, response);
			g = new Game().run(playerCount);
//			players = new String[round.getPlayers().size()];
			int i= 1;
			for(Player p : round.getPlayers())
			{
//				players[round.getPlayers().indexOf(p)] = p.getName();
//				people.put(p.getName(), String.valueOf(p.getWealth()));
				people.put("player"+(i++), p);
			}
		} else
		{
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
//			if(round!=null){
				CharSequence s = String.valueOf(round.getRoundNumber());
				response.getWriter().append("<h5>Round: " + s + "</h5><hr>");
//			}
				for(Player p : round.getPlayers())
				{
//					people.replace(p.getName(), String.valueOf(p.getWealth()));
				}
//				
//				Iterator it = people.entrySet().iterator();
//				while(it.hasNext())
//				{
//					Map.Entry pair = (Map.Entry)it.next();
//					System.out.println("KLSJFLK" + pair.getValue());
//				}
				
				for(Player p : round.getPlayers())
				{
					if(people.keySet().contains(p.getName()))
					{
						System.out.println("Found " + p.getName());
					} else {
						System.out.println(p.getName() + " is bankrupt");
					}
				}
			
			for(int i = 0; i < people.size(); i++){
//				response.getWriter().append("Player " + (i+1) + ": " + players[i] + "<br />");
//				response.getWriter().append("Money: $" + String.valueOf(round.getPlayers().get(i).getWealth()) + "<br /><hr>");
				JSONObject obj = new JSONObject();
//				System.out.println("******** " + people.keySet());
				
				obj.put("position"+(i+1), round.getPlayers().get(i).getPlayerToken().getPosition());
				
				obj.writeJSONString(response.getWriter());
				
			}
			
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
