package com.automation.mobielshop.kpn.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.mobielshop.kpn.testBase.TestBase;

public class SimOnly extends TestBase {
	
WebDriver driver;
	
	public SimOnly(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
	WebElement Cookies_Acceptance;
	
	@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[3]/a")
	WebElement SimOnlyLink;
    
	@FindBy(xpath="//div[@class='col col-md-6 col-xs-12 base-padding-helper simonly-padding-helper']")
	WebElement ToOrder;
	
	@FindBy(xpath="//div[@class='col-xs-10 col-sm-4 col-md-3 text-right']")
	WebElement continueToOrder;
	

	
	public void Cookies_Acceptance() throws InterruptedException
    {
    	//Accepting Cookies to proceed
    	Cookies_Acceptance.click();
    	log.info("Accepted Cookies");    	
    }
	
	
	public void SimOnly_Buying_simOnlyLink() throws InterruptedException
	{	
		//Clicking on SimOnly in the header of the page
		SimOnlyLink.click();
		log.info("Clicked on simonly in homePage");
		Thread.sleep(1000);
	}
	
	
	public void SimOnly_Buying_simOnly() throws InterruptedException{
		
		//Clicking on ToOrder button on the page
		ToOrder.click();
		log.info("Clicked on ToOrder button on the page");
		Thread.sleep(1000);
		
		//once all the details are good to go - Click on Continue_To_Order button on the page
		continueToOrder.click();
		log.info("Clicked on ContinueToOrder button on the page");
		
	}
	
	
	
	
}
