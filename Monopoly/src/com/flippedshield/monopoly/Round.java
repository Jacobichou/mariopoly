package com.flippedshield.monopoly;

import java.util.ArrayList;

public class Round {
	
	private int roundNumber;
	private ArrayList<Player> players;

	public Round(int roundNumber, ArrayList<Player> players)
	{
		this.roundNumber = roundNumber;
		this.players = players;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}
