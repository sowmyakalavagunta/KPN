package com.automation.mobielshop.kpn.smartwatches;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Smartwatches;

public class TC003_SmartWatches_products_validation extends TestBase {

	public static final Logger log = Logger.getLogger(TC003_SmartWatches_products_validation.class.getName());
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		 init();
		 }
	
	@Test
	public void Product_Validation() throws InterruptedException
	{
		//creating object to SmartWatches class to use methods in that class
				Smartwatches smartwatches = new Smartwatches(driver);
				
				//calling Methods from Smartwatches Class				
						Thread.sleep(2000);
								smartwatches.SmartWatchesLink();
									Thread.sleep(1000);
										smartwatches.Apple_Brand_validation();
											smartwatches.Filter_colour_Zwart();
												smartwatches.Filter_OS_Apple();		
			}
			
		}
