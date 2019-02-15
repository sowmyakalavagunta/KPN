package com.automation.mobielshop.kpn.tablets;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;

public class TC005_Tablets_products_Validation_shoppingBasketPage extends TestBase{
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	@Test
	public void shoppingBasketPageValidation() throws InterruptedException
		{
	
		//creating object to Telephones class to use methods in that class
		Tablets tablets = new Tablets(driver);
			Thread.sleep(2000);
					tablets.shoppingBasketPageValidation();

			}
	}