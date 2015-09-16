package com.flippedshield.monopoly.pages;

public class PageNotLoadedException extends Exception {
	
	private static final long serialVersionUID = -7038769375145154585L;

	public PageNotLoadedException()
	{
		
	}
	
	public PageNotLoadedException(String message)
	{
		super(message);
	}
	
	public PageNotLoadedException(Throwable cause)
	{
		super(cause);
	}
	
	public PageNotLoadedException(String message, Throwable cause)
	{
		super(message, cause);
	}

}