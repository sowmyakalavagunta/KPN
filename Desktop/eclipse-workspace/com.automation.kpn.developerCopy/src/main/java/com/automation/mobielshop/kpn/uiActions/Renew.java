package com.automation.mobielshop.kpn.uiActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.mobielshop.kpn.testBase.TestBase;

import Helper.WaitHelper;

public class Renew extends TestBase {
	
	WaitHelper waitHelper = new WaitHelper(driver);
	

	@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
	WebElement Cookies_Acceptance;
	
	@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[1]/a")
	WebElement verlegen;
	
	@FindBy(id="phonenumber-required")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//div[@class='retention-content']//button[@name='submitretention']")
	WebElement CheckNu;
	
	@FindBy(id="verification-required")
	WebElement  Verification_code;
	
	@FindBy(xpath="//div[@class='retention-content']//button[@value='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='js-load']/div[3]/div/div/section[1]/article[1]/a/div[2]/div/span")
	WebElement Phones;
	
	@FindBy(xpath="//*[@id='js-load']/div[3]/div/div/section[1]/article[2]/a/div[2]/div/span")
	WebElement SimOnly;
	
	@FindBy(xpath="//label[@for='BuySpotify']")
	WebElement Spotify_Premium;
	
	@FindBy(id="submitJouwGegevens")
	WebElement NextOne;
	
	public Renew(WebDriver driver) {
		Renew.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verlegen(String phoneNumber, String verification_code) throws InterruptedException
	{
		

				
		// Clicking on Renew link on Home Page		
				verlegen.click();
				log.info("Selected Renewal tab on the page"+verlegen.toString());
				waitHelper.pageLoadTime(10,TimeUnit.SECONDS);

		// Enter Contact Number				
				PhoneNumber.sendKeys(phoneNumber);
				log.info("Entered Contact Number" +PhoneNumber.toString());
				waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
		
		//Clcik on Check nu button on the page to proceed next
				CheckNu.click();
				log.info("Clicked on checkNu button on the page");
				waitHelper.waitForElementVisibleWithPollingTime(Verification_code, 10, 1000);

		//Enter Verification Code recieved by your mobile
				Verification_code.sendKeys(verification_code);
				log.info("Entered Verification code" +verification_code.toString());
				waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
				
		//clicking on Submit button
				submit.click();
				log.info("Clicked on Submit button" +submit.toString());
				waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
				
	}	
	
	public void telephones() throws InterruptedException
		{
		waitHelper.WaitForElementClickable(Phones,20);	
		Phones.click();
			
		}
	
	
	public void simOnly()
			{
				SimOnly.click();
			}
	
	//Below is the code to click on SpotifyPremium and submit the page
		public void personal_Details_SpotifyPremiumAndSubmit() throws InterruptedException
		{
			Thread.sleep(1000);
			Spotify_Premium.click();
			log.info("Spotify Insurance");
			NextOne.click();
			log.info("Clciked on NextOne button on the page");
		}
				
				
	}