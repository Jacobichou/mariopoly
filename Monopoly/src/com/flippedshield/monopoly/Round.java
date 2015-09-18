package com.flippedshield.monopoly;

import java.util.ArrayList;

public class Round {
	
	private int roundNumber;
	private ArrayList<Player> players;
	private Player winner;

	public Round(int roundNumber, ArrayList<Player> players, Player winner)
	{
		this.roundNumber = roundNumber;
		this.players = players;
		this.winner = winner;
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
	
	public Player getWinner() {
		return winner;
	}
}
