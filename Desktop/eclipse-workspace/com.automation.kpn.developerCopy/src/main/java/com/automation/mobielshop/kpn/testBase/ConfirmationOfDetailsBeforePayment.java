package com.automation.mobielshop.kpn.testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.WaitHelper;

// This class is responsible for Confirmation Of Details Before Payment page
	public class ConfirmationOfDetailsBeforePayment extends TestBase{
		
		WaitHelper waitHelper = new WaitHelper(driver);

		// Locating the elements
			@FindBy(xpath="//label[@for='Aproved']")
			WebElement agree;
	
			@FindBy(xpath="//div[@class='button-with-tooltip']/button")
			WebElement PlaceOrder;
	
			@FindBy(xpath="//button[@class='button-with-tooltip__btn btn btn-primary btn-lg']")
			WebElement Further;
	
			@FindBy(xpath="//*[@id='IdealBic']")
			WebElement iDEAL;
			
			@FindBy(xpath="//div[@class='footer-buttons']/div/button")
			WebElement NextOne;
			
			@FindBy(className="issuer_button")
			WebElement cancel;
			
			@FindBy(xpath="//input[@value='Nu Betalen »']")
			WebElement payNow;
			
			@FindBy(xpath="//a[@class='issuer_button']")
			WebElement further;
			
			public ConfirmationOfDetailsBeforePayment(WebDriver driver) {
				ConfirmationOfDetailsBeforePayment.driver=driver;
				PageFactory.initElements(driver,this);
	}

		//Below is the method for Confirmation Of Details Before Payment Method in Tablets page
			public void ConfirmationOfDetailsBeforePaymentMethod_DierectPayment() throws InterruptedException
			{
				waitHelper.waitForElementVisibleWithPollingTime(PlaceOrder, 10, 1000);
				((JavascriptExecutor) driver).executeScript(
		                "window.scrollBy(0,500)");
				Actions actions = new Actions(driver);
				actions.moveToElement(agree).click().build().perform();
//				agree.click();
				PlaceOrder.click();		
				Thread.sleep(7000);
			}
	
		//Below is the method for Confirmation Of Details Before Payment Method in Telefoons and SimOnly page	
			public void ConfirmationOfDetailsBeforePaymentMethod_FurtherPaymentPage() throws InterruptedException
			{
				((JavascriptExecutor) driver).executeScript(
		                "window.scrollTo(1418, 515)");
				
				waitHelper.waitForElementVisibleWithPollingTime(agree, 10, 1000);				
				Actions actions = new Actions(driver);
				actions.moveToElement(agree).click().build().perform();
//				agree.click();
				log.info("clicked on 'I agree'");
				/*WebElement switchLabel = driver.findElement(By.cssSelector("label[for=CompleteConditions]"));
				JavascriptExecutor js =(JavascriptExecutor) driver;
				String script="arguments[0].click();";
				js.executeScript(script,switchLabel);		
				log.info("checked all checked boxes")*/;
				PlaceOrder.click();
				log.info("Clicked on PlaceOrder button on page");
				Thread.sleep(7000);
		
			}
			
			
			public void Payment_Online_Bank_page() throws InterruptedException {
				Thread.sleep(7000);
				Select iDEAL = new Select(driver.findElement(By.xpath("//*[@id='IdealBic']")));
				iDEAL.selectByValue("INGBNL2A");
				log.info("Selected ING bank for payment");
				NextOne.click();
				log.info("Clicked on NextOne button to proceed to payment");				
				Thread.sleep(7000);
				payNow.click();
				log.info("Confirmed:clicked on payNow button");
				Thread.sleep(7000);
				further.click();
				log.info("Confirmed:clicked on further button");

			}
	}
	
		
