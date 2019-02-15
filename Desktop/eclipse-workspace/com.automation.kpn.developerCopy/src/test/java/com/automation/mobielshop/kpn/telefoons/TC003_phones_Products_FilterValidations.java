package com.automation.mobielshop.kpn.telefoons;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Telephones;

public class TC003_phones_Products_FilterValidations extends TestBase {

	public static final Logger log = Logger.getLogger(TC003_phones_Products_FilterValidations.class.getName());

	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	
	
	@Test
	public void Product_Validation() throws InterruptedException, AWTException
	{
		
		//creating object to Telephones class to use methods in that class
				Telephones telephones = new Telephones(driver);
						
		log.info("=========== Started  Filters Validation Test on Telephones Page =============");	
							

	   //Calling Methods from telephones class

					// Brand filter validation
						telephones.Apple_Brand();
					
					// Colour filter validation
						telephones.Filter_colour_Zwart();
					
					// SimKaart filter validation
						telephones.Filter_SimKaart_DualSIM();
					
					// Staat filter validation
						telephones.Filter_Staat_Nieuw();
					
					//Promotions filter validation
						telephones.Filter_Promotions();
					
						Thread.sleep(5000);
					//OperatingSystem filter validation
						telephones.Filter_OS_Android();
						
		
		log.info("=========== Finished  Filters Validation Test on Telephones Page =============");
		
		}
	}

