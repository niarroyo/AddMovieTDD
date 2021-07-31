package com.sans.movieTDD.tests.newmovieModule;

import org.testng.annotations.Test;

import com.sans.movieTDD.base.UITestBase;
import com.sans.movieTDD.pages.c_pages.NewMovieRecordPage;

public class NewMovieTest extends UITestBase {
	
	@Test
	public void newMovieTestcase01() {
		logger = extent.createTest("newMovieTestcase01");
		NewMovieRecordPage m1 = new NewMovieRecordPage();
		m1.goToAddaNewMovie();
	}
}
