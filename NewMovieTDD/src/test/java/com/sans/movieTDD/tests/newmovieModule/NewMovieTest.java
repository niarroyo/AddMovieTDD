package com.sans.movieTDD.tests.newmovieModule;

import org.testng.annotations.Test;

import com.sans.movieTDD.base.UITestBase;
import com.sans.movieTDD.pages.c_pages.NewMovieRecordPage;

public class NewMovieTest extends UITestBase {
	
	
	@Test
	public void validTestCase01() {
		logger = extent.createTest("newMovieTestCase01");
		NewMovieRecordPage m1 = new NewMovieRecordPage();
		m1.goToAddaNewMovie();
		m1.fillAllInputs();
		m1.submitEnabled();
	}
	
	//@Test
	public void invalidTestCase02() {
		logger = extent.createTest("invalidTestCase02");
		NewMovieRecordPage m2 = new NewMovieRecordPage();
		m2.goToAddaNewMovie();
		m2.invalidData("", "", "");
		m2.submitDisabled();

	}
	
	@Test
	public void invalidTestCase04() {
		logger = extent.createTest("invalidTestCase04");
		NewMovieRecordPage m3 = new NewMovieRecordPage();
		m3.goToAddaNewMovie();
		m3.invalidData("", "", "6");
		
	}
	
	//@Test
	public void invalidTestCase03() {
		logger = extent.createTest("invalidTestCase03");
		NewMovieRecordPage m4 = new NewMovieRecordPage();
		m4.goToAddaNewMovie();
		m4.invalidData("12345", "01012015", "0");
	}
	
}
