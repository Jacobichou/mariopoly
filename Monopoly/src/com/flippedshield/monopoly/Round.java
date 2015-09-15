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
}
