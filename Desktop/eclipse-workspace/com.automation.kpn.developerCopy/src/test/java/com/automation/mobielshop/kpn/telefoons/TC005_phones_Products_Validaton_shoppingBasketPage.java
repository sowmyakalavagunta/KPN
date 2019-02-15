package com.automation.mobielshop.kpn.telefoons;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Telephones;

public class TC005_phones_Products_Validaton_shoppingBasketPage extends TestBase {
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	@Test
	public void shoppingBasketPageValidation() throws InterruptedException
			{
				//creating object to Telephones class to use methods in that class
				Telephones telephones = new Telephones(driver);
				Thread.sleep(7000);
							telephones.shoppingBasketPageValidation();	
			}	
			
}
 