package com.automation.mobielshop.kpn.tablets;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;

import Helper.WaitHelper;

public class TC002_Tablets_VerifyProductBuying_PriceValidation_WithoutSubscription extends TestBase {
	WebDriver driver;
	
public static final Logger log1 = Logger.getLogger(TC002_Tablets_VerifyProductBuying_PriceValidation_WithoutSubscription.class.getName());
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		 init();
			this.driver=TestBase.driver;
		 }
	WaitHelper waitHelper = new WaitHelper(driver);

	@Test
	public void Tablets_VerifyProductBuying_WithoutSubscription() throws InterruptedException
	{
		//Creating object to tablets page
			Tablets tablets = new Tablets(driver);
				log.info("=========== Started tablets VerifyiProductBuying without suscription Test =============");
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
					//Calling Methods from tablets class
						//Clicking on Tablets page
							tablets.Tablets_Buying_ClickingonLink();
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
							tablets.Tablets_product_Buying();
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
								tablets.Tablets_product_Buying_withoutsubscription();
								waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
								// Creating Object to PriceValidation
								PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
													
			//Calling Methods from priceValidation calss
				priceValidation_HardwareONly.priceValidation_Tablets_withoutSubscription_pdpPage();
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				priceValidation_HardwareONly.PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly();		
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				//Creating object to Personal_Information Class
				Personal_information personal_Information=new Personal_information(driver);	
				//calling Methods from Personal_Information Class
					personal_Information.personal_Details_TillResidenceDetails();				
					personal_Information.NextOne();				
					waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				
					
				// Calling Methods from PriceValidation Class
					priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
					priceValidation_HardwareONly.pricesValidation_HardwareOnly_TabletsWithoutSubscription();
				
				//Creating object to ConfirmationOfDetailsBeforePayment class
					ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);
				//Calling methods from confirmationOfDetailsBeforePayment class
					confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_DierectPayment();
					
					log.info("******Finished Smoke test for Tablets-withOut Subscription scenario******");
						log.info("******Finished Price Validation for Tablets withOut subscription scenario******");	
	}
	
	
	
		
	/*	@AfterTest
		   public void endTest()
		   {
		
			log.info("============= Done with Tablets VerifyProductBuying without subsciption Test============");
			driver.close();
		   }*/
	}

