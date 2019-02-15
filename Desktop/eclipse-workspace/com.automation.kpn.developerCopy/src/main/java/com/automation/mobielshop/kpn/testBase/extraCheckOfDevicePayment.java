package com.automation.mobielshop.kpn.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.WaitHelper;


	// This class is responsible for Extracheckout of Device payment popup
			public class extraCheckOfDevicePayment extends TestBase{
				WaitHelper waitHelper = new WaitHelper(driver);
	// Locating the elements
			@FindBy(xpath="//*[@class='modal-body']/div[1]/div/select[@class='no-mouseflow']")
			WebElement FamilyComposition;
			
			@FindBy(xpath="//div[@class='form-group__input-wrapper']//input[@class='form-group__input-no']")
			WebElement RentOrMortage;
			
			@FindBy(xpath="//div[@class='form-group col-sm-10']/div[1]/input[@class='form-group__input-no no-mouseflow']")
			WebElement NetMonthlyIncome;
			
			@FindBy(xpath="//div[@class='modal-body']//div[@class='form-group col-sm-10']//button[@class='btn btn-primary btn-lg js-IltVerderbutton']")
			WebElement Further;
	
		
	  //Below is the construcotr of extraCheckOfDevicePayment class
			public extraCheckOfDevicePayment(WebDriver driver) {
				extraCheckOfDevicePayment.driver=driver;
				PageFactory.initElements(driver, this);
			}


	  //Below is the method to enter details in Extracheckout popup
			public void extraCheckOfDevicePaymentMethod() throws InterruptedException {
				waitHelper.waitForElementVisibleWithPollingTime(FamilyComposition,10,1000);
				
				
			Select whatIsFamilyComposition=new Select(FamilyComposition);
				whatIsFamilyComposition.selectByValue("1");
					log.info("Clicked on FamilyComposition and object is:-" +FamilyComposition.toString());
			RentOrMortage.clear();
			RentOrMortage.sendKeys("5");
			log.info("clicked on RentOrMortage and object is:-" +RentOrMortage.toString());
			NetMonthlyIncome.clear();
			NetMonthlyIncome.sendKeys("1000");
			log.info("clicked on NetMonthlyIncome and object is:-" +NetMonthlyIncome.toString());
		
			Further.click();
			log.info("clicked on Further and object is:-" +Further.toString());
			
	}	
}
