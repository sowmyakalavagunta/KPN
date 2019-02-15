package com.automation.mobielshop.kpn.tablets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;

import Helper.WaitHelper;

public class TC004_Tablets_products_Validation_productDetailsPage extends TestBase {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		this.driver = TestBase.driver;
		}
	WaitHelper waitHelper = new WaitHelper(driver);
	@Test
	public void DetailsPageValidation() throws InterruptedException
	{
		
		//creating object to tablets class to use methods in that class
		Tablets tablets = new Tablets(driver);
		
						tablets.DetailsPageValidation_NewUser();
						waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
						
						// Checking if the page is loading correctly or not
							tablets.pageLoadValidation();
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);		
							
						// Validating Price
							tablets.price_validation(); 
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
							
						//Slider validation
							tablets.DetailsPageValidation_slider();
							
							
//		tablets.DetailsPageValidation_Heading();
		
	}
}
