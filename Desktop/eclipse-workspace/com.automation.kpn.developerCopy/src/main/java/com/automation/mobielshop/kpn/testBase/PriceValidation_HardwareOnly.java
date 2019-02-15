package com.automation.mobielshop.kpn.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.WaitHelper;

public class PriceValidation_HardwareOnly extends TestBase {
	WebDriver driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	
	public PriceValidation_HardwareOnly(WebDriver driver) {
		this.driver = TestBase.driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//div[@class='col-xs-3 col-sm-2 col-md-1']//b//span")
	WebElement Eenmalig_NotACustomer_shoppingCartPage_string;
	
	@FindBy(xpath="//div[@class='receipt__grid']//span[2]")
	WebElement Eenmalig_personalDetailsPage_string;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg js-basket-submit']")
	WebElement ContinueToOrder;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_FinalPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_Bank_FinalPage_HardwareOnly_String;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_checkOutPage_HardwareOnly_string;
	
	@FindBy(xpath="//*[@id='kpn-price-with-discount']")
	WebElement TotalValue_NotACustomer_pdpPage_String;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[3]/div/input")
	WebElement ToOrder;
	
	@FindBy(xpath="//div[@class='col col-md-6 col-xs-12 base-padding-helper simonly-padding-helper']")
	WebElement ToOrder_simOnlyAndMobileInternet;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[5]/div[2]/div/div[3]/span[3]/b/span")
	WebElement Totaal_mnd_shoppingCartPage_string;
	
	@FindBy(xpath="//div[@class='receipt__wrap']/div/div/div//span/span/span")
	WebElement Totaal_mnd_personalDetailsPage_string;
	
	@FindBy(xpath="//*[@id=\"placeholderCartView\"]/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_personalDetailsPage_string_ExceptHardware;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_checkOutPage_ExceptHardware_string;	
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/a/div/div/div/span[2]/span/span")
	WebElement Totaal_mnd_checkOutPage_ExceptHardware_string;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div[2]//span//span")
	WebElement Eenmalig_FinalPage_ExceptHardware_string;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div//span//span")
	WebElement Totaal_mnd_FinalPage_ExceptHardware_string;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[2]/ul/li[1]/p[2]/span")
	WebElement Eenmalig_pdp_Page_ExceptHardware_String;
	
	@FindBy(xpath="//*[@id=\"phone-info\"]/div[4]/form/div[3]/div[2]/ul/li[1]/p[2]/span")
	WebElement Eenmalig_pdp_Page_Telephones_Renew_String;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[3]/ul/li[1]/p[2]/span")
	WebElement Totaal_mnd_pdpPage_ExceptHardware_string;
	
	@FindBy(xpath="//li[@class='row base-size-font']//span[@class='kpn-display-price']//span")
	WebElement Aansluitkosten_pdp_simOnly_String;
	
	@FindBy(xpath="//div[@class='subscription-summary row pb-xs']//div[2]//ul//li//p//span")
	WebElement Totaal_mnd_pdpPage_simOnly_string;
	
	@FindBy(xpath="//span[@class='device-price']")
	WebElement TotalValue_pdpPage_String;
	
	@FindBy(xpath="//input[@value='Bestellen']")
	WebElement Prepaid_ToOrder;
	
	@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[4]/a")
	WebElement MobielInternet;
	
	@FindBy(xpath="//*[@id='js-load']/div/div/div/section/div/div[1]/div[2]/form/div[1]/div[2]/ul/li[1]/p[2]/span[1]")
	WebElement Totaal_mnd_pdpPage_MobielInternet_string;
	
	@FindBy(xpath="//*[@id=\"phone-info\"]/div[4]/form/div[3]/div[3]/ul/li[1]/p[2]/span")
	WebElement Totaal_mnd_pdpPage_Telephones_Renew_string;

	@FindBy(xpath="//ul[@class='subscription-summary__prices-list']//li[3]//span//span")
	WebElement Aansluitkosten_pdp_MobielInternet_String;
	
	@FindBy(xpath="//p[@class='col-xs-4 text-right base-weight-bold kpn-display-price totaal']")
	WebElement Totaal_mnd_pdpPage_Tablets_WithoutSubscription_string;
	
	@FindBy(xpath="//input[@value='Bestellen']")
	WebElement Tablets_WithoutSubscription_ToOrder;
	
	@FindBy(xpath="//div[@class='subscription-summary subscription-summary_buttons row']//input[@value='Bestellen']")
	WebElement ToOrder_Telephones_Renew;
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//span[@class='kpn-display-price']")
	WebElement Eenmalig_shoppingCartPage_Telephones_Renew_string;
	
	@FindBy(xpath="//*[@id=\"placeholderCartView\"]/div[2]/div/div[2]/div/div[1]/a/div/div/div/span[2]/span/span")
	WebElement Totaal_mnd_personalDetailsPage_Telephones_Renew_string ;
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//span[@class='kpn-display-price js-total-oneoff']")
	WebElement Totaal_mnd_shoppingCartPage_Telephones_Renew_string;
	
	@FindBy(xpath="//*[@id=\"placeholderCartView\"]/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_personalDetailsPage_Telephones_Renew_string;
	
	@FindBy(xpath="//*[@id=\"placeholderCartView\"]/div[2]/div/div[2]/div/div[2]/div/div/div/span[2]/span/span")
	WebElement Eenmalig_personalDetailsPage_simOnly_Renew_string;
	
	@FindBy(xpath="//*[@id=\"placeholderCartView\"]/div[2]/div/div[2]/div/div[1]/a/div/div/div/span[2]/span/span")
	WebElement Totaal_mnd_personalDetailsPage_simOnly_Renew_string;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/a/div/div/div/span[2]/span/span")
	WebElement Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_string;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/span[2]/span/span")
	WebElement Eenmalig_checkOutPage_simOnly_Renew_string;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_checkOutPage_Telephones_Renew_string;

	
	
	String Eenmalig_pdp_Page_Checked_ExceptHardware;
	String Eenmalig_NotACustomer_shoppingBasketPage_string_checked;
	String Eenmalig_personalDetailsPage_Checked;
	String Eenmalig_personalDetailsPage_ExceptHardware_Checked;
	String Totaal_mnd_pdpPage_ExceptHardware_Checked;
	String Totaal_mnd_shoppingCartPage_ExceptHardware_Checked;
	String Totaal_mnd_personalDetailsPage_Checked;	
	String Totaal_mnd_checkOutPage_ExceptHardware_Checked;
	String Totaal_mnd_FinalPage_ExceptHardware_Checked;
	String TotalValue_NotACustomer_pdpPage_checked;
	String Totaal_mnd_pdpPage_simOnly_Checked;
	String Aansluitkosten_pdp_simOnly_Checked;
	String Eenmalig_FinalPage_ExceptHardware_checked;
	String Eenmalig_checkOutPage_ExceptHardware_Checked;
	String Totaal_mnd_pdpPage_MobielInternet_Checked;
	String Aansluitkosten_pdp_MobielInternet_Checked;
	String TotalValue_pdpPage_Checked;
	String Eenmalig_checkOutPage_HardwareOnly_Checked;
	String Eenmalig_Bank_FinalPage_HardwareOnly_Checked;
	String Totaal_mnd_pdpPage_Tablets_WithoutSubscription_Checked;
	String Eenmalig_pdp_Page_Telephones_Renew_Checked;
	String Totaal_mnd_pdpPage_telephones_Renew_Checked;
	String Eenmalig_shoppingCartPage_Telephones_Renew_Checked;
	String Eenmalig_personalDetailsPage_Telephones_Renew_Checked;
	String Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked;
	String Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked;
	String Eenmalig_personalDetailsPage_simOnly_Renew_Checked;
	String Totaal_mnd_personalDetailsPage_simOnly_Renew_Checked;
	String Eenmalig_checkOutPage_simOnly_Renew_Checked;
	String Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked;
	String Eenmalig_checkOutPage_Telephones_Renew_Checked;
	String lineBreaker = "=======================================================================";
	
	
	
	 public void priceValidation_SmartWatches_pdpPage() throws InterruptedException {
			
		//Eenmalig value on pdp page	 
			String TotalValue_NotACustomer_pdpPage = TotalValue_NotACustomer_pdpPage_String.getText();
			
	    	//pdp page values

				if(TotalValue_NotACustomer_pdpPage.contains(","))
				{
					TotalValue_NotACustomer_pdpPage_checked = TotalValue_NotACustomer_pdpPage;
					 System.out.println("Totaal value on pdp page "+TotalValue_NotACustomer_pdpPage_checked);
				}
				else
				{
					TotalValue_NotACustomer_pdpPage_checked = TotalValue_NotACustomer_pdpPage+",00";
					 System.out.println("Appended Totaal value on pdp page "+TotalValue_NotACustomer_pdpPage_checked);
				}
				
				ToOrder.click();
		    	log.info("Clicked on ToOrder button to initiate the process of ordering");
		    	Thread.sleep(1000);
	 } 
	 
	 public void priceValidation_TelephonesAndTablets_pdpPage() {
		 
		 waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_pdp_Page_ExceptHardware_String, 10, 1000);
		 
			//pdp page values

			//Eenmalig value on pdp page
				
				String Eenmalig_pdp_Page = Eenmalig_pdp_Page_ExceptHardware_String.getText().substring(2);	
				
				if(Eenmalig_pdp_Page.contains(","))
				{
					System.out.println(lineBreaker);
					Eenmalig_pdp_Page_Checked_ExceptHardware = Eenmalig_pdp_Page;
					 System.out.println("Eenmalig value on pdp page "+Eenmalig_pdp_Page_Checked_ExceptHardware);
				}
				else
				{
					System.out.println(lineBreaker);
					Eenmalig_pdp_Page_Checked_ExceptHardware = Eenmalig_pdp_Page+",00";
					 System.out.println("Appended Eenmalig value on pdp page "+Eenmalig_pdp_Page_Checked_ExceptHardware);
				}				

			//Totaal/mnd value on shopping cart page		
				String Totaal_mnd_pdpPage_ExceptHardware = Totaal_mnd_pdpPage_ExceptHardware_string.getText().substring(2);
				
				
				
				if(Totaal_mnd_pdpPage_ExceptHardware.contains(","))
				{
					
					Totaal_mnd_pdpPage_ExceptHardware_Checked = Totaal_mnd_pdpPage_ExceptHardware;
					 System.out.println("Totaal/mnd_on pdpPage " +Totaal_mnd_pdpPage_ExceptHardware_Checked);
					 System.out.println(lineBreaker);
				}
				else
				{
					Totaal_mnd_pdpPage_ExceptHardware_Checked = Totaal_mnd_pdpPage_ExceptHardware+",00";
					System.out.println("Appended Totaal/mnd_on pdpPage " +Totaal_mnd_pdpPage_ExceptHardware_Checked);
					System.out.println(lineBreaker);

				}
				
				((JavascriptExecutor) driver).executeScript(
		                "window.scrollBy(0, 1000)");	
				
				Actions actions = new Actions(driver);
				actions.moveToElement(ToOrder).click().build().perform(); 
				log.info("Clicked on Bestellen button");
				
//			ToOrder.click();
	 }
	 
	 public void priceValidation_simOnly_pdpPage() throws InterruptedException
		{
			
			//Tootalpermand value on pdp page	 
				String Totaal_mnd_pdpPage_simOnly = Totaal_mnd_pdpPage_simOnly_string.getText().substring(2);
			
	    	//pdp page values

				if(Totaal_mnd_pdpPage_simOnly.contains(","))
				{
					System.out.println(lineBreaker);
					Totaal_mnd_pdpPage_simOnly_Checked = Totaal_mnd_pdpPage_simOnly;
					 System.out.println("Totaal value on pdp page "+Totaal_mnd_pdpPage_simOnly_Checked);
						

				}
				else
				{
					System.out.println(lineBreaker);
					Totaal_mnd_pdpPage_simOnly_Checked = Totaal_mnd_pdpPage_simOnly+",00";
					 System.out.println("Appended Totaal value on pdp page "+Totaal_mnd_pdpPage_simOnly_Checked);
						

				}
				
				
			//Aansluitkosten value on pdp page				
			String Aansluitkosten_pdp_simOnly = Aansluitkosten_pdp_simOnly_String.getText().substring(2);
				
				if(Aansluitkosten_pdp_simOnly.contains(","))
				{
					Aansluitkosten_pdp_simOnly_Checked = Aansluitkosten_pdp_simOnly;
					 System.out.println("Aansluitkosten value on pdp page "+Aansluitkosten_pdp_simOnly_Checked);
					 System.out.println(lineBreaker);
				}
				else
				{
					Aansluitkosten_pdp_simOnly_Checked = Aansluitkosten_pdp_simOnly+",00";
					 System.out.println("Appended Aansluitkosten value on pdp page "+Aansluitkosten_pdp_simOnly_Checked);
					 System.out.println(lineBreaker);
				}
				
				//Clicking on ToOrder button on the page
				((JavascriptExecutor) driver).executeScript(
		                "window.scrollBy(0,300)");
				Actions actions = new Actions(driver);
				actions.moveToElement(ToOrder_simOnlyAndMobileInternet).click().build().perform();
//				ToOrder_simOnlyAndMobileInternet.click();
					log.info("Clicked on ToOrder button on the page");
					
		} 
	 
	 public void priceValidation_Prepaid_pdpPage() throws InterruptedException 
	 	{
			
			//Eenmalig value on pdp page	 
				String TotalValue_pdpPage = TotalValue_pdpPage_String.getText().substring(2);
				
		    	//pdp page values

					if(TotalValue_pdpPage.contains(","))
					{
						TotalValue_pdpPage_Checked = TotalValue_pdpPage;
						 System.out.println("Totaal value on pdp page "+TotalValue_pdpPage_Checked);
							System.out.println(lineBreaker);

					}
					else
					{
						TotalValue_pdpPage_Checked = TotalValue_pdpPage+",00";
						 System.out.println("Appended Totaal value on pdp page "+TotalValue_pdpPage_Checked);
							System.out.println(lineBreaker);

					}
					
					Prepaid_ToOrder.click();
			    	log.info("Clicked on ToOrder button to initiate the process of ordering");
			    	Thread.sleep(1000);
		 } 
	 
	 
	 public void priceValidation_MobielInternet_pdpPage() throws InterruptedException	
		{				 	
		 
		 //Clicking on MobielInternet in header on homePage
		 	MobielInternet.click();
		 	log.info("clicked on MobielInternet and object is:-"+MobielInternet.toString());
		 	Thread.sleep(1000);
		 	
		//Tootalpermand value on pdp page	 
			String Totaal_mnd_pdpPage_MobielInternet = Totaal_mnd_pdpPage_MobielInternet_string.getText().substring(2);
				
		    	//pdp page values

					if(Totaal_mnd_pdpPage_MobielInternet.contains(","))
					{
						Totaal_mnd_pdpPage_MobielInternet_Checked = Totaal_mnd_pdpPage_MobielInternet;
						 System.out.println("Totaal value on pdp page "+Totaal_mnd_pdpPage_MobielInternet_Checked);
							System.out.println(lineBreaker);

					}
					else
					{
						Totaal_mnd_pdpPage_MobielInternet_Checked = Totaal_mnd_pdpPage_MobielInternet+",00";
						 System.out.println("Appended Totaal value on pdp page "+Totaal_mnd_pdpPage_MobielInternet_Checked);
							System.out.println(lineBreaker);

					}
					
					
				//Aansluitkosten value on pdp page				
				String Aansluitkosten_pdp_MobielInternet = Aansluitkosten_pdp_MobielInternet_String.getText().substring(2);
					
					if(Aansluitkosten_pdp_MobielInternet.contains(","))
					{
						System.out.println(lineBreaker);

						Aansluitkosten_pdp_MobielInternet_Checked = Aansluitkosten_pdp_MobielInternet;
						 System.out.println("Aansluitkosten value on pdp page "+Aansluitkosten_pdp_MobielInternet_Checked);
					}
					else
					{
						System.out.println(lineBreaker);

						Aansluitkosten_pdp_MobielInternet_Checked = Aansluitkosten_pdp_MobielInternet+",00";
						 System.out.println("Appended Aansluitkosten value on pdp page "+Aansluitkosten_pdp_MobielInternet_Checked);
					}
					
				
				//Clicking on ToOrder button on the page
					ToOrder_simOnlyAndMobileInternet.click();
						log.info("Clicked on ToOrder button on the page");
						Thread.sleep(1000);	
			} 
			
	 
	public void priceValidation_Tablets_withoutSubscription_pdpPage()
	{
		waitHelper.waitForElementVisibleWithPollingTime(Totaal_mnd_pdpPage_Tablets_WithoutSubscription_string, 10, 1000);
		//Eenmalig value on pdp page	 
		String Totaal_mnd_pdpPage_Tablets_WithoutSubscription = Totaal_mnd_pdpPage_Tablets_WithoutSubscription_string.getText().substring(2);
		
    	//pdp page values

			if(Totaal_mnd_pdpPage_Tablets_WithoutSubscription.contains(","))
			{
				Totaal_mnd_pdpPage_Tablets_WithoutSubscription_Checked = Totaal_mnd_pdpPage_Tablets_WithoutSubscription;
				 System.out.println("Totaal value on pdp page "+Totaal_mnd_pdpPage_Tablets_WithoutSubscription_Checked);
					System.out.println(lineBreaker);

			}
			else
			{
				TotalValue_pdpPage_Checked = Totaal_mnd_pdpPage_Tablets_WithoutSubscription+",00";
				 System.out.println("Appended Totaal value on pdp page "+Totaal_mnd_pdpPage_Tablets_WithoutSubscription_Checked);
					System.out.println(lineBreaker);

			}
			
			Tablets_WithoutSubscription_ToOrder.click();
			
 } 
	
		

	 
	 
	 public void PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly() throws InterruptedException
	  {
		
		 waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_NotACustomer_shoppingCartPage_string, 10, 1000);
		//Shopping Basket page	
		//Eenmalig value on shopping cart page
		String Eenmalig_shoppingBasketPage = Eenmalig_NotACustomer_shoppingCartPage_string.getText().substring(2);		
		
		   	//Shopping Basket page							
					if(Eenmalig_shoppingBasketPage.contains(","))
					{
						System.out.println(lineBreaker);

						Eenmalig_NotACustomer_shoppingBasketPage_string_checked = Eenmalig_shoppingBasketPage;
						 System.out.println("Eenmalig value on ShoppingBasket page "+Eenmalig_NotACustomer_shoppingBasketPage_string_checked);
						
					}
					else
					{
						System.out.println(lineBreaker);

						Eenmalig_NotACustomer_shoppingBasketPage_string_checked = Eenmalig_shoppingBasketPage+",00";
						 System.out.println("Appended Eenmalig value on ShoppingBasket page "+Eenmalig_NotACustomer_shoppingBasketPage_string_checked);
					}
			
					
				ContinueToOrder.click();
					Thread.sleep(1000);
					
					// Personal Details page		
					
					// Eenmalig value on Personal Details page
					String Eenmalig_personalDetailsPage = Eenmalig_personalDetailsPage_string.getText().substring(2);		
					
					
						
						if(Eenmalig_personalDetailsPage.contains(","))
						{
							System.out.println(lineBreaker);

							 Eenmalig_personalDetailsPage_Checked = Eenmalig_personalDetailsPage;
							 System.out.println("Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_Checked);

						}
						else
						{
							System.out.println(lineBreaker);

							 Eenmalig_personalDetailsPage_Checked = Eenmalig_personalDetailsPage+",00";
							 System.out.println("Appended Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_Checked);
						}

					
	  }
	
	public void PriceValidation_FromPersoanlDetailsPage_HardwareOnly() throws InterruptedException
	  {		
						
		waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_checkOutPage_HardwareOnly_string, 10, 1000);
						//Order Confirmation Page values				
						
						// Eenmalig value on Order Confirmation page
						String Eenmalig_checkOutPage_HardwareOnly = Eenmalig_checkOutPage_HardwareOnly_string.getText().substring(2);
							
						
						if(Eenmalig_checkOutPage_HardwareOnly.contains(","))
						{
							System.out.println(lineBreaker);

							Eenmalig_checkOutPage_HardwareOnly_Checked = Eenmalig_checkOutPage_HardwareOnly;
							 System.out.println("Eenmalig value on checkout page "+Eenmalig_checkOutPage_HardwareOnly_Checked);

						}
						else
						{
							System.out.println(lineBreaker);

							Eenmalig_checkOutPage_HardwareOnly_Checked = Eenmalig_checkOutPage_HardwareOnly+",00";
							 System.out.println("Appended Eenmalig value on checkout page "+Eenmalig_checkOutPage_HardwareOnly_Checked);
						}
							
						
						
						//Creating object to ConfirmationOfDetailsBeforePayment class
						ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);
						//Calling methods from ConfirmationOfDetailsBeforePayment class
						confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_DierectPayment();    						
						Thread.sleep(3000);
						
						
						//Final Page (Bank details page)
						String Eenmalig_Bank_FinalPage_HardwareOnly = Eenmalig_Bank_FinalPage_HardwareOnly_String.getText().substring(2);
						
						
						if(Eenmalig_Bank_FinalPage_HardwareOnly.contains(","))
						{

							Eenmalig_Bank_FinalPage_HardwareOnly_Checked = Eenmalig_Bank_FinalPage_HardwareOnly;
							 System.out.println("Eenmalig value on Final page "+Eenmalig_Bank_FinalPage_HardwareOnly_Checked);

						}
						else
						{

							Eenmalig_Bank_FinalPage_HardwareOnly_Checked = Eenmalig_Bank_FinalPage_HardwareOnly+",00";
							 System.out.println("Appended Eenmalig value on Final Page "+Eenmalig_Bank_FinalPage_HardwareOnly_Checked);
						}
						
						
						   						
								
//						confirmationOfDetailsBeforePayment.Payment_Online_Bank_page();
								
						//Final Page
	    				/*		String Eenmalig_FinalPage = Eenmalig_FinalPage_string.getText().substring(2);
	    						String Eenmalig_FinalPage_Checked;
	    						
								if(Eenmalig_FinalPage.contains(","))
								{
									Eenmalig_FinalPage_Checked = Eenmalig_FinalPage;
									 System.out.println("Eenmalig value on Final page "+Eenmalig_FinalPage_Checked);

								}
								else
								{
									Eenmalig_FinalPage_Checked = Eenmalig_FinalPage_string+",00";
									 System.out.println("Appended Eenmalig value on Final Page "+Eenmalig_FinalPage_Checked);
								}*/		
						}
	public void PriceValidation_ShoppingCartPage_ExceptHardware() throws InterruptedException
	  {		
		//Shopping Basket page	
		
		//Eenmalig value on shopping cart page
		String Eenmalig_shoppingBasketPage = Eenmalig_NotACustomer_shoppingCartPage_string.getText().substring(2);		
		   							
					if(Eenmalig_shoppingBasketPage.contains(","))
					{
						System.out.println(lineBreaker);
						Eenmalig_NotACustomer_shoppingBasketPage_string_checked = Eenmalig_shoppingBasketPage;
						 System.out.println("Eenmalig value on ShoppingBasket page "+Eenmalig_NotACustomer_shoppingBasketPage_string_checked);
						
					}
					else
					{
						System.out.println(lineBreaker);
						Eenmalig_NotACustomer_shoppingBasketPage_string_checked = Eenmalig_shoppingBasketPage+",00";
						 System.out.println("Appended Eenmalig value on ShoppingBasket page "+Eenmalig_NotACustomer_shoppingBasketPage_string_checked);
					}
			

					//	Totaal/mnd value on shopping cart page	
							String Totaal_mnd_shoppingCartPage = Totaal_mnd_shoppingCartPage_string.getText().substring(2);
							
							
							if(Totaal_mnd_shoppingCartPage.contains(","))
							{
								
								Totaal_mnd_shoppingCartPage_ExceptHardware_Checked = Totaal_mnd_shoppingCartPage;
								 System.out.println("Totaal/mnd_on shoppingCartPage "+Totaal_mnd_shoppingCartPage_ExceptHardware_Checked);
								 System.out.println(lineBreaker);
							}
							else
							{
								Totaal_mnd_shoppingCartPage_ExceptHardware_Checked = Totaal_mnd_shoppingCartPage+",00";
								 System.out.println("Appended Totaal/mnd_on shoppingCartPage "+Totaal_mnd_shoppingCartPage_ExceptHardware_Checked);
								 System.out.println(lineBreaker);
							}
		
					ContinueToOrder.click();
										
	  }
	
		public void PriceValidation_personalDetailsPage_ExceptHardware() throws InterruptedException
			{					
					
			waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_personalDetailsPage_string_ExceptHardware, 10, 1000);
					// Personal Details page
					// Eenmalig value on Personal Details page
			
					String Eenmalig_personalDetailsPage_ExceptHardware = Eenmalig_personalDetailsPage_string_ExceptHardware.getText().substring(2);	
					
						
						if(Eenmalig_personalDetailsPage_ExceptHardware.contains(","))
						{
							
							Eenmalig_personalDetailsPage_ExceptHardware_Checked = Eenmalig_personalDetailsPage_ExceptHardware;
							 System.out.println("Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_ExceptHardware_Checked);
							 

						}
						else
						{
							
							Eenmalig_personalDetailsPage_ExceptHardware_Checked = Eenmalig_personalDetailsPage_ExceptHardware+",00";
							 System.out.println("Appended Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_ExceptHardware_Checked);
							 
						}
						
						// Totaal/mnd value on personal Details page
						String Totaal_mnd_personalDetailsPage = Totaal_mnd_personalDetailsPage_string.getText().substring(2);
						if(Totaal_mnd_personalDetailsPage.contains(","))
						{
							Totaal_mnd_personalDetailsPage_Checked = Totaal_mnd_personalDetailsPage;	
							System.out.println("Totaal/mnd_on personalDetailsPage " +Totaal_mnd_personalDetailsPage_Checked);
							System.out.println(lineBreaker);
							
						}
						else
						{
							 Totaal_mnd_personalDetailsPage_Checked = Totaal_mnd_personalDetailsPage+",00" ;	
							 System.out.println("Appended Totaal/mnd_on personalDetailsPage " +Totaal_mnd_personalDetailsPage_Checked);
							 System.out.println(lineBreaker);
							 
						}					
	  }
	
	
						
	public void PriceValidation_FromPersoanlDetailsPage_ExceptHardware() throws InterruptedException
	  {		
								  
						//Order Confirmation Page values				
						
						// Eenmalig value on Order Confirmation page
						String Eenmalig_checkOutPage_ExceptHardware = Eenmalig_checkOutPage_ExceptHardware_string.getText().substring(2);
							
						
						if(Eenmalig_checkOutPage_ExceptHardware.contains(","))
						{
							System.out.println(lineBreaker);
							Eenmalig_checkOutPage_ExceptHardware_Checked = Eenmalig_checkOutPage_ExceptHardware;
							 System.out.println("Eenmalig value on checkout page "+Eenmalig_checkOutPage_ExceptHardware_Checked);

						}
						else
						{
							System.out.println(lineBreaker);
							Eenmalig_checkOutPage_ExceptHardware_Checked = Eenmalig_checkOutPage_ExceptHardware+",00";
							 System.out.println("Appended Eenmalig value on checkout page "+Eenmalig_checkOutPage_ExceptHardware_Checked);
						}
							
						//Totaal/mnd value on CheckOut page
						String Totaal_mnd_checkOutPage_ExceptHardware = Totaal_mnd_checkOutPage_ExceptHardware_string.getText().substring(2);						
						if(Totaal_mnd_checkOutPage_ExceptHardware.contains(","))
						{
							Totaal_mnd_checkOutPage_ExceptHardware_Checked = Totaal_mnd_checkOutPage_ExceptHardware;	
							System.out.println("Totaal/mnd_on checkout page " +Totaal_mnd_checkOutPage_ExceptHardware_Checked);
							System.out.println(lineBreaker);
						}
						else
						{
							Totaal_mnd_checkOutPage_ExceptHardware_Checked = Totaal_mnd_checkOutPage_ExceptHardware+",00" ;	
							 System.out.println("Appended Totaal/mnd_on checkout page " +Totaal_mnd_checkOutPage_ExceptHardware_Checked);
							 System.out.println(lineBreaker);
						}
						
						Thread.sleep(7000);
						//Creating object to ConfirmationOfDetailsBeforePayment class
						ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);
						
						//Calling methods from ConfirmationOfDetailsBeforePayment class
						confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_DierectPayment();    						
						Thread.sleep(3000);
						
						
						//Final Page (Bank details page)
						String Eenmalig_FinalPage_ExceptHardware = Eenmalig_FinalPage_ExceptHardware_string.getText().substring(2);
						
						
						if(Eenmalig_FinalPage_ExceptHardware.contains(","))
						{
							
							Eenmalig_FinalPage_ExceptHardware_checked = Eenmalig_FinalPage_ExceptHardware;
							 System.out.println("Eenmalig value on Final page "+Eenmalig_FinalPage_ExceptHardware_checked);

						}
						else
						{
							
							Eenmalig_FinalPage_ExceptHardware_checked = Eenmalig_FinalPage_string+",00";
							 System.out.println("Appended Eenmalig value on Final Page "+Eenmalig_FinalPage_ExceptHardware_checked);
						}
						
						//  Totaal/mnd value on Orderconfirmation page
						String Totaal_mnd_FinalPage_ExceptHardware = Totaal_mnd_FinalPage_ExceptHardware_string.getText().substring(2);	
						
						if(Totaal_mnd_FinalPage_ExceptHardware.contains(","))
						{
							Totaal_mnd_FinalPage_ExceptHardware_Checked = Totaal_mnd_FinalPage_ExceptHardware;	
							System.out.println("Totaal/mnd_on Final page " +Totaal_mnd_FinalPage_ExceptHardware_Checked);
							System.out.println(lineBreaker);
						}
						else
						{
							Totaal_mnd_FinalPage_ExceptHardware_Checked = Totaal_mnd_FinalPage_ExceptHardware+",00" ;	
							 System.out.println("Appended Totaal/mnd_on Final page " +Totaal_mnd_FinalPage_ExceptHardware_Checked);
							 System.out.println(lineBreaker);
						}	
								
						   						
								
//						confirmationOfDetailsBeforePayment.Payment_Online_Bank_page();
								
						//Final Page
	    				/*		String Eenmalig_FinalPage = Eenmalig_FinalPage_string.getText().substring(2);
	    						String Eenmalig_FinalPage_Checked;
	    						
								if(Eenmalig_FinalPage.contains(","))
								{
									Eenmalig_FinalPage_Checked = Eenmalig_FinalPage;
									 System.out.println("Eenmalig value on Final page "+Eenmalig_FinalPage_Checked);

								}
								else
								{
									Eenmalig_FinalPage_Checked = Eenmalig_FinalPage_string+",00";
									 System.out.println("Appended Eenmalig value on Final Page "+Eenmalig_FinalPage_Checked);
								}*/		
						
	  }				
					
			public void pricesValidation_TelephonesAndTablets()
			{
							// Validating all Eenmalig values
								
								if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_pdp_Page_Checked_ExceptHardware)
										&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_ExceptHardware_Checked)
										&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_ExceptHardware_Checked)
										&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_FinalPage_ExceptHardware_checked))
									{
									
			    						System.out.println("All Eenmalig Values are equal");
			    					}
			    					
								else
			    					{
			    						System.out.println("All Eenmalig Values are not equal");
			    					}
								
								
								// Validating all Totaa/mnd values					
								if(Totaal_mnd_pdpPage_ExceptHardware_Checked.equals(Totaal_mnd_shoppingCartPage_ExceptHardware_Checked)
										&& Totaal_mnd_pdpPage_ExceptHardware_Checked.equals(Totaal_mnd_personalDetailsPage_Checked)
										&& Totaal_mnd_pdpPage_ExceptHardware_Checked.equals(Totaal_mnd_checkOutPage_ExceptHardware_Checked)
										&& Totaal_mnd_pdpPage_ExceptHardware_Checked.equals(Totaal_mnd_FinalPage_ExceptHardware_Checked))
								{
									System.out.println("Totaal/mnd Values are equal");
								}
								else
								{
									System.out.println("Totaal/mnd Values are not equal");
								}
						
										
						}
			
			public void pricesValidation_simOnly()
			{
							// Validating all Eenmalig values
									if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Aansluitkosten_pdp_simOnly_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_FinalPage_ExceptHardware_checked))
						
									{
									
			    						System.out.println("All Eenmalig Values are equal");
			    					}
			    					
								else
			    					{
			    						System.out.println("All Eenmalig Values are not equal");
			    					}
								
								
								// Validating all Totaa/mnd values					
								if(Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_pdpPage_simOnly_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_personalDetailsPage_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_checkOutPage_ExceptHardware_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_FinalPage_ExceptHardware_Checked))
								{
									System.out.println("Totaal/mnd Values are equal");
								}
								else
								{
									System.out.println("Totaal/mnd Values are not equal");
								}
						
										
						}
			
			
			
			public void pricesValidation_MobielInternet()
			{
							// Validating all Eenmalig values
									if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Aansluitkosten_pdp_MobielInternet_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_FinalPage_ExceptHardware_checked))
						
									{
									
			    						System.out.println("All Eenmalig Values are equal");
			    					}
			    					
								else
			    					{
			    						System.out.println("All Eenmalig Values are not equal");
			    					}
								
								
								// Validating all Totaa/mnd values					
								if(Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_pdpPage_MobielInternet_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_personalDetailsPage_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_checkOutPage_ExceptHardware_Checked)
										&& Totaal_mnd_shoppingCartPage_ExceptHardware_Checked.equals(Totaal_mnd_FinalPage_ExceptHardware_Checked))
								{
									System.out.println("Totaal/mnd Values are equal");
								}
								else
								{
									System.out.println("Totaal/mnd Values are not equal");
								}
						
										
						}
			

			public void pricesValidation_HardwareOnly()
			{
							// Validating all Eenmalig values
									if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(TotalValue_NotACustomer_pdpPage_checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_ExceptHardware_Checked)
											&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_FinalPage_ExceptHardware_checked))
						
									{
									
			    						System.out.println("All Eenmalig Values are equal");
			    					}
			    					
								else
			    					{
			    						System.out.println("All Eenmalig Values are not equal");
			    					}	
			
			}	
			
			
			public void pricesValidation_HardwareOnly_SmartWatches()
			{
			// Validating all Eenmalig values
			
			if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(TotalValue_NotACustomer_pdpPage_checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_HardwareOnly_Checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_Checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_Bank_FinalPage_HardwareOnly_Checked))
				{
				System.out.println(lineBreaker);
					System.out.println("All Eenmalig Values are equal");
				}
				
			else
				{
				System.out.println(lineBreaker);
					System.out.println("All Eenmalig Values are not equal");
				}
			
			}
			
			
			public void pricesValidation_HardwareOnly_Prepaid()
			{
			// Validating all Eenmalig values
			
			if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(TotalValue_pdpPage_Checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_HardwareOnly_Checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_Checked)
					&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_Bank_FinalPage_HardwareOnly_Checked))
				{
				
				System.out.println(lineBreaker);
					System.out.println("All Eenmalig Values are equal");
				}
				
			else
				{
				System.out.println(lineBreaker);
					System.out.println("All Eenmalig Values are not equal");
				}
			
			}
			
			
			public void pricesValidation_HardwareOnly_TabletsWithoutSubscription()
			{
				// Validating all Eenmalig values
				
				if( Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Totaal_mnd_pdpPage_Tablets_WithoutSubscription_Checked)
						&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_checkOutPage_HardwareOnly_Checked)
						&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_personalDetailsPage_Checked)
						&& Eenmalig_NotACustomer_shoppingBasketPage_string_checked.equals(Eenmalig_Bank_FinalPage_HardwareOnly_Checked))
					{
					
					System.out.println(lineBreaker);
						System.out.println("All Eenmalig Values are equal");
					}
					
				else
					{
					System.out.println(lineBreaker);
						System.out.println("All Eenmalig Values are not equal");
					}
				
							}
			public void PriceValidation_PdpPageTelephones_Renew()
			{
				
				waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_pdp_Page_Telephones_Renew_String, 10, 1000);
				String Eenmalig_pdp_Page_Telephones_Renew = Eenmalig_pdp_Page_Telephones_Renew_String.getText().substring(2);
				if(Eenmalig_pdp_Page_Telephones_Renew.contains(","))
				{
					System.out.println(lineBreaker);
					Eenmalig_pdp_Page_Telephones_Renew_Checked = Eenmalig_pdp_Page_Telephones_Renew;
					 System.out.println("Eenmalig value on pdp page "+Eenmalig_pdp_Page_Telephones_Renew_Checked);

				}
				else
				{
					System.out.println(lineBreaker);
					Eenmalig_pdp_Page_Telephones_Renew_Checked = Eenmalig_pdp_Page_Telephones_Renew+",00";
					 System.out.println("Appended Eenmalig value on pdp page "+Eenmalig_pdp_Page_Telephones_Renew_Checked);
				}
				
				
				String Totaal_mnd_pdpPage_Telephones_Renew = Totaal_mnd_pdpPage_Telephones_Renew_string.getText().substring(2);
				
				if(Totaal_mnd_pdpPage_Telephones_Renew.contains(","))
				{
					Totaal_mnd_pdpPage_telephones_Renew_Checked = Totaal_mnd_pdpPage_Telephones_Renew;
					 System.out.println("Totaal/mnd value on pdp page "+Totaal_mnd_pdpPage_telephones_Renew_Checked);
					 System.out.println(lineBreaker);

				}
				else
				{
					Totaal_mnd_pdpPage_telephones_Renew_Checked = Totaal_mnd_pdpPage_Telephones_Renew+",00";
					 System.out.println("Appended Totaal/mnd value on pdp page "+Totaal_mnd_pdpPage_telephones_Renew_Checked);
					 System.out.println(lineBreaker);
				}
				
				((JavascriptExecutor) driver).executeScript(
		                "window.scrollBy(605, 1117)");
				
				Actions actions = new Actions(driver);
				actions.moveToElement(ToOrder_Telephones_Renew).click().build().perform();
				
//				
			}
			
			
			public void PriceValidation_ShoppingCartPageTelephones_Renew() throws InterruptedException
			  {
				
				//Shopping Basket page	
				//Eenmalig value on shopping cart page
				
				String Eenmalig_shoppingCartPage_Telephones_Renew = Eenmalig_shoppingCartPage_Telephones_Renew_string.getText().substring(2);		
				
				   	//Shopping Basket page							
							if(Eenmalig_shoppingCartPage_Telephones_Renew.contains(","))
							{
								
								Eenmalig_shoppingCartPage_Telephones_Renew_Checked = Eenmalig_shoppingCartPage_Telephones_Renew;
								 System.out.println("Eenmalig value on ShoppingBasket page "+Eenmalig_shoppingCartPage_Telephones_Renew_Checked);
								
							}
							else
							{
								
								Eenmalig_shoppingCartPage_Telephones_Renew_Checked = Eenmalig_shoppingCartPage_Telephones_Renew+",00";
								 System.out.println("Appended Eenmalig value on ShoppingBasket page "+Eenmalig_shoppingCartPage_Telephones_Renew_Checked);
							}
							
					//Totaal/mnd value on shopping cart page		
							String Totaal_mnd_shoppingCartPage_Telephones_Renew = Totaal_mnd_shoppingCartPage_Telephones_Renew_string.getText().substring(2);	
							
							
							if(Totaal_mnd_shoppingCartPage_Telephones_Renew.contains(","))
							{
								Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked = Totaal_mnd_shoppingCartPage_Telephones_Renew;
								 System.out.println("Totaal/mnd_on shoppingCartPage " +Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked);
								 System.out.println(lineBreaker);
							}
							else
							{
								Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked = Totaal_mnd_shoppingCartPage_Telephones_Renew+",00";
								System.out.println("Appended Totaal/mnd_on shoppingCartPage " +Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked);
								System.out.println(lineBreaker);
							}
							ContinueToOrder.click();
							Thread.sleep(1000);
			  }		

						
					public void PriceValidation_PersoanlDetailsPage_Telephones_Renew() 
					{
						waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_personalDetailsPage_Telephones_Renew_string, 10, 1000);
						// Personal Details page		
							// Eenmalig value on Personal Details page
							String Eenmalig_personalDetailsPage_Telephones_Renew = Eenmalig_personalDetailsPage_Telephones_Renew_string.getText().substring(2);		
							
								if(Eenmalig_personalDetailsPage_Telephones_Renew.contains(","))
								{
									System.out.println(lineBreaker);
										Eenmalig_personalDetailsPage_Telephones_Renew_Checked = Eenmalig_personalDetailsPage_Telephones_Renew;
											System.out.println("Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_Telephones_Renew_Checked);

								}
								else
								{
									System.out.println(lineBreaker);
										Eenmalig_personalDetailsPage_Telephones_Renew_Checked = Eenmalig_personalDetailsPage_Telephones_Renew+",00";
											System.out.println("Appended Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_Telephones_Renew_Checked);
								}
								
							String Totaal_mnd_personalDetailsPage_Telephones_Renew = Totaal_mnd_personalDetailsPage_Telephones_Renew_string.getText().substring(2);
							
							if(Totaal_mnd_personalDetailsPage_Telephones_Renew.contains(","))
							{
								Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked = Totaal_mnd_personalDetailsPage_Telephones_Renew;
								 System.out.println("Totaal/mnd value on personalDetails page "+Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked);
								 System.out.println(lineBreaker);

							}
							else
							{
								Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked = Totaal_mnd_personalDetailsPage_Telephones_Renew+",00";
								 System.out.println("Appended Totaal/mnd value on personalDetails page "+Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked);
								 System.out.println(lineBreaker);
							}
							
			  }
					
				
					// CheckOut page	
					
					public void priceDetailsValidation_Telephones_checkOutPage_Renew()
					{
						
						waitHelper.waitForElementVisibleWithPollingTime(Eenmalig_checkOutPage_Telephones_Renew_string, 10, 1000);
					// Eenmalig value on CheckOut page
					String Eenmalig_checkOutPage_Telephones_Renew = Eenmalig_checkOutPage_Telephones_Renew_string.getText().substring(2);		
					
					
						
						if(Eenmalig_checkOutPage_Telephones_Renew.contains(","))
						{
							System.out.println(lineBreaker);
							Eenmalig_checkOutPage_Telephones_Renew_Checked = Eenmalig_checkOutPage_Telephones_Renew;
							 System.out.println("Eenmalig value on Checkout page "+Eenmalig_checkOutPage_Telephones_Renew_Checked);

						}
						else
						{
							System.out.println(lineBreaker);
							Eenmalig_checkOutPage_Telephones_Renew_Checked = Eenmalig_checkOutPage_Telephones_Renew+",00";
							 System.out.println("Appended Eenmalig value on Checkout page "+Eenmalig_checkOutPage_Telephones_Renew_Checked);
						}
						
					String Totaal_mnd_checkOutPage_Telephones_simOnly_Renew = Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_string.getText().substring(2);
					
					if(Totaal_mnd_checkOutPage_Telephones_simOnly_Renew.contains(","))
					{
						Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked = Totaal_mnd_checkOutPage_Telephones_simOnly_Renew;
						 System.out.println("Totaal/mnd value on Checkout page "+Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked);
						 System.out.println(lineBreaker);

					}
					else
					{
						Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked = Totaal_mnd_checkOutPage_Telephones_simOnly_Renew+",00";
						 System.out.println("Appended Totaal/mnd value on Checkout page "+Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked);
						 System.out.println(lineBreaker);
						}
							
					
					
					
					
					}
			
			
			
			
			// Validating all Eenmalig anfd Totaal/mnd values telephones renew
			public void priceDetailsValidation_Telephones_Renew()
			{
				if(Eenmalig_pdp_Page_Telephones_Renew_Checked.equals(Eenmalig_shoppingCartPage_Telephones_Renew_Checked)						
						&& Eenmalig_pdp_Page_Telephones_Renew_Checked.equals(Eenmalig_personalDetailsPage_Telephones_Renew_Checked)
						&& Eenmalig_pdp_Page_Telephones_Renew_Checked.equals(Eenmalig_checkOutPage_Telephones_Renew_Checked))
						
					{
					System.out.println(lineBreaker);
						System.out.println("All Eenmalig Values are equal");
					}
					
				else
					{
					System.out.println(lineBreaker);
						System.out.println("All Eenmalig Values are not equal");
					}
			
				
				//validating Totaal/mnd values
				if(Totaal_mnd_pdpPage_telephones_Renew_Checked.equals(Totaal_mnd_shoppingCartPage_Telephones_Renew_Checked)
						&& Totaal_mnd_pdpPage_telephones_Renew_Checked.equals(Totaal_mnd_personalDetailsPage_Telephones_Renew_Checked)
						&&Totaal_mnd_pdpPage_telephones_Renew_Checked.equals(Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked))
				{
					
					System.out.println("All Totaal/mnd Values are equal");
					System.out.println(lineBreaker);
				}
				
			else
				{
					System.out.println("All Totaal/mnd Values are not equal");
					System.out.println(lineBreaker);
				}
			}

			// Validating all Eenmalig anfd Totaal/mnd values simOnly Renewal personal details page
			
			public void priceDetailsValidation_simOnly_personalDetailsPage_Renew()
			{
				// Personal Details page		
				
				// Eenmalig value on Personal Details page
				String Eenmalig_personalDetailsPage_simOnly_Renew = Eenmalig_personalDetailsPage_simOnly_Renew_string.getText().substring(2);		
				
				
					
					if(Eenmalig_personalDetailsPage_simOnly_Renew.contains(","))
					{
						System.out.println(lineBreaker);
						Eenmalig_personalDetailsPage_simOnly_Renew_Checked = Eenmalig_personalDetailsPage_simOnly_Renew;
						 System.out.println("Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_simOnly_Renew_Checked);

					}
					else
					{
						System.out.println(lineBreaker);
						Eenmalig_personalDetailsPage_simOnly_Renew_Checked = Eenmalig_personalDetailsPage_simOnly_Renew+",00";
						 System.out.println("Appended Eenmalig value on personalDetails page "+Eenmalig_personalDetailsPage_simOnly_Renew_Checked);
					}
					
				String Totaal_mnd_personalDetailsPage_simOnly_Renew = Totaal_mnd_personalDetailsPage_simOnly_Renew_string.getText().substring(2);
				
				if(Totaal_mnd_personalDetailsPage_simOnly_Renew.contains(","))
				{
					Totaal_mnd_personalDetailsPage_simOnly_Renew_Checked = Totaal_mnd_personalDetailsPage_simOnly_Renew;
					 System.out.println("Totaal/mnd value on personalDetails page "+Totaal_mnd_personalDetailsPage_simOnly_Renew_Checked);
					 System.out.println(lineBreaker);

				}
				else
				{
					Totaal_mnd_personalDetailsPage_simOnly_Renew = Totaal_mnd_personalDetailsPage_simOnly_Renew+",00";
					 System.out.println("Appended Totaal/mnd value on personalDetails page "+Totaal_mnd_personalDetailsPage_simOnly_Renew_Checked);
					 System.out.println(lineBreaker);
					}
			}
			
			
			
			public void priceDetailsValidation_simOnly_checkOutPage_Renew()
			{
				
			// CheckOut page		
			
			// Eenmalig value on CheckOut page
			String Eenmalig_checkOutPage_simOnly_Renew = Eenmalig_checkOutPage_simOnly_Renew_string.getText().substring(2);		
			
			
				
				if(Eenmalig_checkOutPage_simOnly_Renew.contains(","))
				{
					System.out.println(lineBreaker);
					Eenmalig_checkOutPage_simOnly_Renew_Checked = Eenmalig_checkOutPage_simOnly_Renew;
					 System.out.println("Eenmalig value on Checkout page "+Eenmalig_checkOutPage_simOnly_Renew_Checked);

				}
				else
				{
					System.out.println(lineBreaker);
					Eenmalig_checkOutPage_simOnly_Renew_Checked = Eenmalig_checkOutPage_simOnly_Renew+",00";
					 System.out.println("Appended Eenmalig value on Checkout page "+Eenmalig_checkOutPage_simOnly_Renew_Checked);
				}
				
			String Totaal_mnd_checkOutPage_simOnly_Renew = Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_string.getText().substring(2);
			
			if(Totaal_mnd_checkOutPage_simOnly_Renew.contains(","))
			{
				Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked = Totaal_mnd_checkOutPage_simOnly_Renew;
				 System.out.println("Totaal/mnd value on Checkout page "+Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked);
				 System.out.println(lineBreaker);

			}
			else
			{
				Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked = Totaal_mnd_checkOutPage_simOnly_Renew+",00";
				 System.out.println("Appended Totaal/mnd value on Checkout page "+Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked);
				 System.out.println(lineBreaker);
				}
					
			}

			
			// Validating all Eenmalig anfd Totaal/mnd values SimOnly renew
				
			public void priceDetailsValidation_simOnly_Renew()
			{
			
				if( Aansluitkosten_pdp_simOnly_Checked.equals(Eenmalig_NotACustomer_shoppingBasketPage_string_checked)						
						&& Aansluitkosten_pdp_simOnly_Checked.equals(Eenmalig_personalDetailsPage_simOnly_Renew_Checked)
						&& Aansluitkosten_pdp_simOnly_Checked.equals(Eenmalig_checkOutPage_simOnly_Renew_Checked))
					{
					System.out.println(lineBreaker);
						System.out.println("All Eenmalig Values are equal");
					}
					
				else
					{
					System.out.println(lineBreaker);
					System.out.println("All Eenmalig Values are not equal");
					}
			
				//validating Totaal/mnd values
				if(Totaal_mnd_pdpPage_simOnly_Checked.equals(Totaal_mnd_shoppingCartPage_ExceptHardware_Checked)
						&& Totaal_mnd_pdpPage_simOnly_Checked.equals(Totaal_mnd_personalDetailsPage_simOnly_Renew_Checked)
						&& Totaal_mnd_pdpPage_simOnly_Checked.equals(Totaal_mnd_checkOutPage_Telephones_simOnly_Renew_Checked))
				{
					
					System.out.println("All Totaal/mnd Values are equal");
					System.out.println(lineBreaker);
				}
				
			else
				{
					System.out.println("All Totaal/mnd Values are not equal");
					System.out.println(lineBreaker);
				}


}
			
			
}
