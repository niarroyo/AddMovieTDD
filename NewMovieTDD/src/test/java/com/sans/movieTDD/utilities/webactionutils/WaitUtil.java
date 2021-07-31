package com.sans.movieTDD.utilities.webactionutils;

import org.openqa.selenium.WebDriver;

public class WaitUtil {
	
	private WebDriver driver; 
	
	public WaitUtil(WebDriver incomingDriver) {
		this.driver = incomingDriver;
	}
	
	 public void pause(int seconds) {
		  try {
		   Thread.sleep(seconds * 1000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		 }

}
