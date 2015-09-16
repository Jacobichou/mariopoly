package com.flippedshield.monopoly.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BoardPage extends BasePage {

	private static final By TITLE_MAIN = By.id("main-title");
	private static final By PLAYER_COUNT = By.name("playerCount");
	private static final By PLAY_BUTTON = By.name("playButton");

	public BoardPage(WebDriver driver) throws PageNotLoadedException {
		super(driver);
	}
	
	@Override
	protected boolean waitForPageLoad() {
		
		try
		{
			super.waitForPresence(TITLE_MAIN);
//			super.waitForPresence(PLAY_BUTTON);
			
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
	
	
	/*
	 * === SERVICES ========================================================
	 */
	
}
