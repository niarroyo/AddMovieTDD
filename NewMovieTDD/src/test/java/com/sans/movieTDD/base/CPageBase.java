package com.sans.movieTDD.base;

import com.sans.movieTDD.utilities.reportmanagers.TestListener;
import com.sans.movieTDD.utilities.webactionutils.ElementActions;
import com.sans.movieTDD.utilities.webactionutils.WaitUtil;


public class CPageBase extends TestListener {

	protected ElementActions weu = new ElementActions(driver);

	protected WaitUtil waits = new WaitUtil(driver);
	
	
}
