package com.sans.movieTDD.pages.c_pages;

import com.sans.movieTDD.base.CPageBase;
import com.sans.movieTDD.pages.i_pages.INewMovieRecordPage;
import com.sans.movieTDD.utilities.reportmanagers.Log4jManager;

public class NewMovieRecordPage extends CPageBase implements INewMovieRecordPage {

	private static String url = "https://niarroyo.github.io/AddMovie/";

	public void goToAddaNewMovie() {
		logger.createNode("user goes to Add a New Movie page");
		driver.get(url);
		Log4jManager.info("user lands on Add a New Movie Page");
	
	}

	public void fillAllInputs() {
		logger.createNode("user tries to fill all inputs with valid data");
		enterTitle("Fast and Furious");
		enterDate("01122017");
		enterRating("5");
		waits.pause(5);
		Log4jManager.info("user filled all inputs with valid data");
		
	}
	
	public void invalidData(String title, String date, String rating) {
		enterTitle(title);
		enterDate(date);
		enterRating(rating);
		weu.click(submitBtn);
		waits.pause(5);
		Log4jManager.info("user unable to add a New Movie with invalid data");
		
	}
	

	public void submitEnabled() {
		boolean submitPresence = driver.findElement(submitBtn).isDisplayed();
		boolean submitEnabled = driver.findElement(submitBtn).isEnabled();
		
		if (submitPresence == true && submitEnabled == true) {
			weu.click(submitBtn);
			
		Log4jManager.info("user is able to add a New Movie");
			
		}
	}
	
	public void submitDisabled() {
		boolean actualValue = driver.findElement(submitBtn).isEnabled();
		
		if (actualValue) {
			System.out.println("button is enabled");
		}else {
			System.out.println("button is disabled");
		}
	}


	

	private void enterTitle(String titleValue) {
		weu.typeIn(title, titleValue);
		
	}

	private void enterDate(String dateValue) {
		weu.typeIn(date, dateValue);
		
	}
	
	private void enterRating(String ratingValue) {
		weu.typeIn(rating, ratingValue);
		
	}

	


	
}
