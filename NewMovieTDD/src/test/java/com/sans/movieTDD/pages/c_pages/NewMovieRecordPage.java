package com.sans.movieTDD.pages.c_pages;

import com.sans.movieTDD.base.CPageBase;
import com.sans.movieTDD.pages.i_pages.INewMovieRecordPage;
import com.sans.movieTDD.utilities.reportmanagers.Log4jManager;

public class NewMovieRecordPage extends CPageBase implements INewMovieRecordPage {

	private static String url = "https://niarroyo.github.io/AddMovie/";

	public void goToAddaNewMovie() {
		logger.createNode("user goes to Add a New Movie page");
		driver.get(url);
		waits.pause(5);
		Log4jManager.info("user lands on Add a New Movie Page");
	
	}
	
	
	
}
