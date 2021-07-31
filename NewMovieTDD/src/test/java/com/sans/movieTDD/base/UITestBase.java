package com.sans.movieTDD.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sans.movieTDD.utilities.reportmanagers.TestListener;
import com.sans.movieTDD.utilities.webactionutils.DriverUtil;

public class UITestBase extends TestListener {

	// --------------- Before all @Test --------------------
		 @BeforeTest  //@BeforeSuite
		 public void beforeAllTestCase() {
		  onExtentSetup();
		 }

		 // --------------- After all @Test--------------------
		 @AfterTest  //AfterSuite
		 public void afterAllTestCase() {
		  // write the report to output view
		  extent.flush();
		 }		 
				 
		 @BeforeMethod 
		 public void beforeEachTestCase() {  
		  String browser = System.getProperty("browser"); 
		  //driver = DriverUtil.startBrowser(browser);  //use to run all suites
		  //driver = DriverUtil.startBrowserInPrivateMode(browser);
		  //driver = DriverUtil.startDockerContainerBrowser(browser);  
		  
		 driver = DriverUtil.startBrowser("chrome"); 
		 }



		 @AfterMethod
		 public void closeBrowser() {
		  // driver.close(); 
		  driver.quit();
		 }

	
	
	
}
