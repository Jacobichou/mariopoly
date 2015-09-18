package com.ninetindough.monopoly;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
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
	private static Game g;
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
		}
		
		if(round != null && round.getWinner() != null)
		{
			request.setAttribute("winnerName", round.getWinner().getName());
			RequestDispatcher rd1 = request.getRequestDispatcher("Winner.jsp");
			rd1.forward(request, response);
		}
		
		//start game only if not started already
		if(g == null)
		{
			people = new HashMap<String, Player>();
			
			RequestDispatcher rd = request.getRequestDispatcher("PlayGame.jsp");
			rd.forward(request, response);
			g = new Game().run(playerCount);

			int i= 1;
			for(Player p : round.getPlayers())
			{
				people.put("player"+(i++), p);
			}
		} else
		{
			
			
			
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
//			if(round!=null){
				CharSequence s = String.valueOf(round.getRoundNumber());
//				response.getWriter().append("<h5>Round: " + s + "</h5><hr>");
//			}
				
				JSONObject responseObj = new JSONObject();
				JSONArray playerArray = new JSONArray();
				Iterator it = people.entrySet().iterator();
				Map.Entry pair = null;
				responseObj.put("round", s);
				if(g.isGameWon())
				{
					responseObj.put("winner", g.getWinner().getName());
				} else
				{
					responseObj.put("winner", "Keep playing suckas!");
				}
				
				while(it.hasNext())
				{
					
					pair = (Map.Entry)it.next();
					Player j = (Player) pair.getValue();
					
//					if(round.getPlayers().contains(j))
//					{
//						System.out.println("I FOUND " + j.getName());
//					} else
//					{
//						System.out.println(j.getName() + " WAS NOWHERE TO BE FOUND");
//					}
					
					JSONObject obj = new JSONObject();
					obj.put("name", j.getName());
					obj.put("position", j.getPlayerToken().getPosition());
					obj.put("wealth", j.getWealth());
					obj.put("token", j.getPlayerToken().getSymbol());
					
					JSONObject playerObj = new JSONObject();
					playerObj.put(pair.getKey(), obj);
					playerArray.add(playerObj);
//					responseObj.put(pair.getKey(), obj);
				}
				responseObj.put("players", playerArray);
				
				responseObj.writeJSONString(response.getWriter());
				
			/*
			for(int i = 0; i < people.size(); i++){
//				response.getWriter().append("Player " + (i+1) + ": " + players[i] + "<br />");
//				response.getWriter().append("Money: $" + String.valueOf(round.getPlayers().get(i).getWealth()) + "<br /><hr>");
				JSONObject obj = new JSONObject();
//				System.out.println("******** " + people.keySet());
				
				obj.put("position"+(i+1), round.getPlayers().get(i).getPlayerToken().getPosition());
				
				obj.writeJSONString(response.getWriter());
				
			}
			*/
	
				
			try {
				g.stepRound();
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
