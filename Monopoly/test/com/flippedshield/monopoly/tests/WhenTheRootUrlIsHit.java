package com.flippedshield.monopoly.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flippedshield.monopoly.pages.IndexPage;
import com.flippedshield.monopoly.pages.PageNotLoadedException;
import com.ninetindough.monopoly.GameServlet;

public class WhenTheRootUrlIsHit {

	private GameServlet gs;
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		gs = new GameServlet();
		
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
	public void indexPageShouldLoad() throws InterruptedException, PageNotLoadedException {
		IndexPage page = new IndexPage(driver);
		
		assertEquals("Mario Monopoly!", page.inspectHeading());
	}
	
	@Test
	public void playerCountShouldInitBeTwo() throws PageNotLoadedException {
		IndexPage page = new IndexPage(driver);
		
		assertEquals("2", page.inspectPlayerCount());
	}

}
