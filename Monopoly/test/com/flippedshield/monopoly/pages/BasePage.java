package com.flippedshield.monopoly.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	private static final int WAIT_TIME = 30;

	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver driver) throws PageNotLoadedException
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, WAIT_TIME);
		
		if(!waitForPageLoad())
		{
			throw new PageNotLoadedException("Page at URL " + driver.getCurrentUrl() + " was not loaded.");
		}
	}
	
	/**
	 * Checks if page is expected and is ready
	 */
	protected abstract boolean waitForPageLoad();
	
	/*
	 * === WAITS ===========================================================
	 */
	public WebElement waitForPresence(By locator)
	{
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForClickable(By locator)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/*
	 * === GETTERS =========================================================
	 */
	public WebDriver driver()
	{
		return driver;
	}
	
}
