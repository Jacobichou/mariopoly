package com.flippedshield.monopoly.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flippedshield.monopoly.pages.BoardPage;
import com.flippedshield.monopoly.pages.IndexPage;
import com.flippedshield.monopoly.pages.PageNotLoadedException;

public class WhenTheGameIsBeingPlayed {
	
	private WebDriver driver;
	private WebDriverWait wait;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		
		driver.manage().window().maximize();
		
		driver.get("localhost:8080/Monopoly");
	}
	
	@After
	public void done()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}

	@Test
	public void playerInfoBoxesShouldDisplay() throws PageNotLoadedException {
		
		BoardPage page = new IndexPage(driver)
						.useDefaultPlayerCountAndNavigateToGameBoard();
		
		assertTrue("Player boxes do not exist", page.checkForPlayerInfoBoxes());
	}
	
	@Test
	public void boardShouldExist() throws PageNotLoadedException {
		BoardPage page = new IndexPage(driver)
				.useDefaultPlayerCountAndNavigateToGameBoard();
		
		assertTrue("Board does not exist on page", page.checkForBoardDiv());
	}
	
	@Test
	public void boardShouldHaveChestSpaces() throws PageNotLoadedException {
		BoardPage page = new IndexPage(driver)
				.useDefaultPlayerCountAndNavigateToGameBoard();
		
		assertTrue("Chest spaces do not exist", page.checkForChestSpaces());
	}
	
	@Test
	public void boardShouldHaveChanceSpaces() throws PageNotLoadedException {
		BoardPage page = new IndexPage(driver)
				.useDefaultPlayerCountAndNavigateToGameBoard();
		
		assertTrue("Chance spaces do not exist", page.checkForChanceSpaces());
	}
	
	@Test
	public void boardShouldHaveRRSpaces() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void boardShouldHaveTaxSpaces() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void boardShouldHaveAJail() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void boardShouldHaveGoToJailSpace() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void boardShouldHaveHaveGoSpace() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void boardShouldHaveFourtySpaces() throws PageNotLoadedException {
		fail("Not yet implemented");
	}
	
	@Test
	public void iconsShouldBeOnGo() throws PageNotLoadedException {
		fail("Not yet implemented");
	}

}
