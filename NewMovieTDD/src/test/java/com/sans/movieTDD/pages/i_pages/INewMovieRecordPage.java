package com.sans.movieTDD.pages.i_pages;

import org.openqa.selenium.By;

public interface INewMovieRecordPage {
	
	By title = By.id("title");
	By date= By.id("date");
	By rating= By.id("rating");
	By submitBtn = By.id("submit");
	

	public void goToAddaNewMovie();
	
	public void fillAllInputs();
	
	public void invalidData(String title, String date, String rating);
	
	public void submitEnabled();
	
	public void submitDisabled();
	
	
}
