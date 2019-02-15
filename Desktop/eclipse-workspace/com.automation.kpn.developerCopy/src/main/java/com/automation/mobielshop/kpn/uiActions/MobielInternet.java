package com.automation.mobielshop.kpn.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.mobielshop.kpn.testBase.TestBase;

public class MobielInternet extends TestBase {
	
	public static final Logger log = Logger.getLogger(Telephones.class.getName());
	WebDriver driver;
	
	//Below is the constructor for MobielInternet class
		public MobielInternet(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
		WebElement Cookies_Acceptance;
		
		@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[4]/a")
		WebElement MobielInternet;
		
		@FindBy(xpath="//div[@class='col col-md-6 col-xs-12 base-padding-helper simonly-padding-helper']")
		WebElement ToOrder;
		
		@FindBy(xpath="//div[@class='col-xs-5 col-sm-4 col-md-3']")
		WebElement ContinueToOrder;
	
		public void Cookies_Acceptance() throws InterruptedException
	    {
	    	//Accepting Cookies to proceed
	    	Cookies_Acceptance.click();
	    	log.info("Accepted Cookies");    	
	    }		
		

		public void MobielInternet_MobileInternetLink() throws InterruptedException
		{	
			//Clicking on MobielInternet in header on homePage
			MobielInternet.click();
			log.info("clicked on MobielInternet and object is:-"+MobielInternet.toString());
		
		}
		
		
		public void MobielInternet_VerifyProductBuying() throws InterruptedException	
		{				
		//Clicking on ToOrder button on the page
		ToOrder.click();
		log.info("clicked on ToOrder and object is:-"+ToOrder.toString());
		Thread.sleep(1000);
		
		//Clcking on ContinueToOrder button on the page
		ContinueToOrder.click();
		log.info("clicked on ContinueToOrder and object is:-"+ContinueToOrder.toString());

	}
		
	
}
