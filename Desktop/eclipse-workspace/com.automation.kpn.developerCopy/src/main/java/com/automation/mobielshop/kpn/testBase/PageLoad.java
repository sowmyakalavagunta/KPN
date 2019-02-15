package com.automation.mobielshop.kpn.testBase;

import java.util.concurrent.TimeUnit;

public class PageLoad extends TestBase {

	 
	public void pageLoadTime(){
		
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}
 	    }
 	

