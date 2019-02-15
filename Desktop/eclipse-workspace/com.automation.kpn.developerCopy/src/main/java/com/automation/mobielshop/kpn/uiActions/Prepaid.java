package com.automation.mobielshop.kpn.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.mobielshop.kpn.testBase.TestBase;

public class Prepaid extends TestBase{
	
WebDriver driver;
	
	public Prepaid(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
		@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
		WebElement Cookies_Acceptance;
		
		@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[6]/a")
		WebElement prepaidLink;
		
		@FindBy(xpath="//*[@id='js-products']/div[1]/product-group/div/div/div[2]/a")
		WebElement view;
		
		@FindBy(xpath="//input[@value='Bestellen']")
		WebElement ToOrder;
		
		@FindBy(xpath="//div[@class='col-xs-10 col-sm-4 col-md-3 text-right']")
		WebElement continueToOrder;
		
		
		
		
		public void Cookies_Acceptance() throws InterruptedException
	    {
	    	//Accepting Cookies to proceed
	    	Cookies_Acceptance.click();
	    	log.info("Accepted Cookies");
	    	
	    }
		
		
		public void Prepaid_Buying_ClickingonLink() throws InterruptedException{
			
			//Clicking on Prepaid in the header of the page
			prepaidLink.click();
			log.info("clciked on prepaid in homePage");
			
		}
				
		public void Prepaid_Buying_CatPAge() throws InterruptedException{
			
			//Clicking on view button on the page
			view.click();
			log.info("Clicked on view button on the page");
			Thread.sleep(5000);
		}
		public void Prepaid_Buying_FromPdpPage() throws InterruptedException
		{
			
			//Clicking on ToOrder button on the page
			ToOrder.click();
			log.info("Clicked on ToOrder button on the page");
			Thread.sleep(1000);
			
			//once all the details are good to go - Click on Continue_To_Order button on the page
			continueToOrder.click();
			log.info("Clicked on ContinueToOrder button on the page");
				
		}		
		
		


}
