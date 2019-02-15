package com.automation.mobielshop.kpn.tablets;

import java.net.MalformedURLException;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;

public class TC003_Tablets_products_FilterValidation extends TestBase{
public static final Logger log1 = Logger.getLogger(TC003_Tablets_products_FilterValidation.class.getName());
	

@BeforeTest
public void setUp() throws MalformedURLException, InterruptedException{
	 init();
	 }

	
	
	@Test
	public void Product_Validation() throws InterruptedException
	{
		
		//creating object to Tablets class to use methods in that class
			Tablets tablets = new Tablets(driver);
			
			//Calling Methods from telephones class
						
						// Brand filter validation
						tablets.Apple_Brand_validation();
						
						// Colour filter validation
						tablets.Filter_colour_Zwart();
						
						// Staat filter validation
						tablets.Filter_SimKaart_SingleSIM();
						
						//OperatingSystem filter validation
						tablets.Filter_OS_Android();
						
						log.info("=========== Finished  Filters Validation Test on Tablets Page =============");
						
	}
	
}
