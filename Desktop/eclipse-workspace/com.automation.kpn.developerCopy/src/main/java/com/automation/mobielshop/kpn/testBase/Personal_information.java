package com.automation.mobielshop.kpn.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.mobielshop.kpn.testBase.TestBase;

import Helper.WaitHelper;

//* This class is resposible for personal details page
public class Personal_information extends TestBase {
	
	WaitHelper waitHelper = new WaitHelper(driver);	
// Locating the elements	
	@FindBy(id="Initials")
	WebElement Initials;
	
	@FindBy(id="Preposition")
	WebElement Preposition;
	
	@FindBy(id="Surname")
	WebElement Surname;

	@FindBy(id="DateOfBirthString")
	WebElement DateOfBirthString;
	
	@FindBy(id="PostalCode")
	WebElement PostalCode;
	
	@FindBy(id="HouseNumber")
	WebElement HouseNumber;
	
	@FindBy(id="Street")
	WebElement Street;
	
	@FindBy(id="City")
	WebElement City;	
	
	@FindBy(id="ContactPhoneNumber")
	WebElement ContactPhoneNumber;
	
	@FindBy(id="IdType")
	WebElement IdType;
	
	@FindBy(id="IdNumber")
	WebElement IdNumber;
	
	@FindBy(id="IdIssueDateString")
	WebElement IdIssueDateString;
	
	@FindBy(id="IdExpiryDateString")
	WebElement IdExpiryDateString;
	
	@FindBy(id="IbanAccountNumber")
	WebElement IbanAccountNumber;
	
	@FindBy(xpath="//div[@class='panel-title']//a[@class='collapsed']")
	WebElement Insurance;
	
	@FindBy(xpath="//label[@for='BuySpotify']")
	WebElement Spotify_Premium;
	
	@FindBy(id="submitJouwGegevens")
	WebElement NextOne;
		
	// Below is constructor of this class
	public Personal_information(WebDriver driver) {
		Personal_information.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Below is the method to enter details till DateOfBirth from FirstName
	public void personal_Details_TillResidenceDetails() throws InterruptedException
	{
		waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Initials")).sendKeys("FCR");	
		driver.findElement(By.id("Preposition")).sendKeys("van");
		driver.findElement(By.id("Surname")).sendKeys("Doorn");	
		driver.findElement(By.id("DateOfBirthString")).click();
		driver.findElement(By.id("DateOfBirthString")).sendKeys("23-10-1990");
		driver.findElement(By.id("PostalCode")).sendKeys("4507KM");
		driver.findElement(By.id("HouseNumber")).sendKeys("10");
		driver.findElement(By.id("Street")).sendKeys("Groeneweg");
		driver.findElement(By.id("City")).sendKeys("Schoondijke");
		driver.findElement(By.id("EmailAddress")).sendKeys("somwya@netwinst.nl");
		driver.findElement(By.id("ContactPhoneNumber")).sendKeys("0629055718");
		
	}		
	
		//Below is the method to enter details till IdType
	public void personal_Details_idType()
	{
		waitHelper.waitForElementVisibleWithPollingTime(IdType, 10, 1000);
		Select Driving_License= new Select(IdType);
		
		  Driving_License.selectByValue("Passport");
		  
		  waitHelper.setImplicitWait(5, TimeUnit.SECONDS);
	}
	
	//Below is the method to enter details to BankAccountNumber
	public void personal_Details_Till_ibanAccountNumber()
	{
	
		driver.findElement(By.id("IdNumber")).sendKeys("NN6HBLFP9");
		driver.findElement(By.id("IdIssueDateString")).click();
		driver.findElement(By.id("IdIssueDateString")).sendKeys("08-06-2012");
		driver.findElement(By.id("IdExpiryDateString")).click();
		driver.findElement(By.id("IdExpiryDateString")).sendKeys("08-06-2022");
		driver.findElement(By.id("IbanAccountNumber")).sendKeys("NL63RABO0367527944");
		log.info("Entered All personal details");
	}
	
	//Below is the code to click on SpotifyPremium and submit the page
	public void personal_Details_SpotifyPremium() throws InterruptedException
	{
		
		log.info("Spotify Insurance");
		
	}
	
	//Below is the code to clcik on NextOne button on the page to proceed
	public void NextOne() {
		waitHelper.waitForElementVisibleWithPollingTime(NextOne, 10, 1000);
		 	NextOne.click();
		 		log.info("Clicked on NextOne button on the page");
	}
	
}
