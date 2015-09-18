	package com.flippedshield.monopoly.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoardPage extends BasePage {

	private static final By TITLE_MAIN = By.id("main-title");
	private static final By PLAYER_1 = By.id("player-1");
	private static final By PLAYER_2 = By.id("player-2");
	private static final By PLAYER_3 = By.id("player-3");
	private static final By PLAYER_4 = By.id("player-4");
	private static final By BOARD = By.id("board-container");
	private static final By CHEST_1 = By.id("space-17");
	private static final By CHEST_2 = By.id("space-2");
	private static final By CHEST_3 = By.id("space-33");
	private static final By CHANCE_1 = By.id("space-22");
	private static final By CHANCE_2 = By.id("space-36");
	private static final By CHANCE_3 = By.id("space-7");

	public BoardPage(WebDriver driver) throws PageNotLoadedException {
		super(driver);
	}
	
	@Override
	protected boolean waitForPageLoad() {
		
		try
		{
			super.waitForPresence(TITLE_MAIN);
			
			return true;
		} catch (NoSuchElementException e)
		{
			return false;
		}
		
	}
	
	/*
	 * === ACTIONS =========================================================
	 */
	private String grabHeading()
	{
		return super.waitForPresence(TITLE_MAIN).getText();
	}
	
	private boolean checkPlayerOneInfo()
	{
		if(super.waitForPresence(PLAYER_4) != null)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkPlayerTwoInfo()
	{
		if(super.waitForPresence(PLAYER_4) != null)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkPlayerThreeInfo()
	{
		if(super.waitForPresence(PLAYER_4) != null)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkPlayerFourInfo()
	{
		if(super.waitForPresence(PLAYER_4) != null)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkBoardDiv()
	{
		if(super.waitForPresence(BOARD) != null)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkChestSpace(By locator)
	{
		WebElement element = super.waitForPresence(locator);
		
		if(element != null && element.getAttribute("class").contains("chest-space"))
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkChanceSpace(By locator)
	{
		WebElement element = super.waitForPresence(locator);
		
		if(element != null && element.getAttribute("class").endsWith("chance-space"))
		{
			return true;
		}
		
		return false;
	}
	
	
	/*
	 * === SERVICES ========================================================
	 */
	public boolean checkForPlayerInfoBoxes()
	{
		boolean check = false;
		
		check = checkPlayerOneInfo();
		check = checkPlayerTwoInfo();
		check = checkPlayerThreeInfo();
		check = checkPlayerFourInfo();
		
		return check;
	}
	
	public boolean checkForBoardDiv()
	{
		boolean check = false;
		
		check = checkBoardDiv();
		
		return check;
	}
	
	public boolean checkForChestSpaces()
	{
		boolean check = false;
		
		check = checkChestSpace(CHEST_1);
		check = checkChestSpace(CHEST_2);
		check = checkChestSpace(CHEST_3);
		
		return check;
	}
	
	public boolean checkForChanceSpaces()
	{
		boolean check = false;
		
		check = checkChanceSpace(CHANCE_1);
		check = checkChanceSpace(CHANCE_2);
		check = checkChanceSpace(CHANCE_3);
		
		return check;
	}
}
