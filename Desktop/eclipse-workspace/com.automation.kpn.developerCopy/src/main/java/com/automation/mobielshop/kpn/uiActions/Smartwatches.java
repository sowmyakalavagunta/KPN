package com.automation.mobielshop.kpn.uiActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.mobielshop.kpn.testBase.TestBase;

public class Smartwatches extends TestBase{
WebDriver driver;
	
	public Smartwatches(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
	WebElement Cookies_Acceptance;
	
	@FindBy(xpath="//*[@id=\"nav-open\"]/ul/ul/li[7]/a")
	WebElement Smartwatches;
	
	@FindBy(xpath="//*[@id=\"js-products\"]/div[1]/product-group/div/div/div/a")
	WebElement view;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[3]/div/input")
	WebElement ToOrder;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg js-basket-submit']")
	WebElement ContinueToOrder;
	
	@FindBy(xpath="//*[@id=\"phone-info\"]/div[4]/form/div[1]/div/div[1]/div/label")
	WebElement AlreadyCustomer;
	
	@FindBy(xpath="//*[@id='kpn-price-with-discount']")
	WebElement TotalValue_NotACustomer_pdpPage_String;
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//div[@class='col-xs-3 col-sm-2 col-md-1']//b//span")
	WebElement Eenmalig_NotACustomer_shoppingCartPage_string;
	
	@FindBy(xpath="//div[@class='receipt__grid']//span[2]")
	WebElement Eenmalig_personalDetailsPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_orderConfirmationPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_Bank_FinalPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price']")
	WebElement Eenmalig_FinalPage_string;
	
	 @FindBy(xpath="//ul[@id='filter-Merk']//div")
	 WebElement Brand_Apple;
	    
	 @FindBy(xpath="//div[@id='filters-wrap-']//ul//span//span")
	 WebElement productCount_LeftPanel_AppleBrand_string;
	    
	 @FindBy(xpath="//span[@id='js-total']")
	 WebElement productCount_Heading_Brand;
	    
	 @FindBy(xpath="//div[@class='catalog-products__product']")
	 WebElement productCount_MainPage; 
	 
	 @FindBy(xpath="//*[@id='filter-Kleur']/li[1]")
	 WebElement colour_Zwart;
	 
	 @FindBy(xpath="//ul[@id='filter-Kleur']//div//span//span")
	 WebElement productCount_LeftPanel_colour_string;
	    
	 @FindBy(xpath="//*[@id='js-total']")
	 WebElement productCount_Heading_Colour;
	 
	 @FindBy(xpath="//ul[@id='filter-Besturingssysteem']//li[3]")
	 WebElement Apple_Filter;
	 
	 @FindBy(xpath="//ul[@id='filter-Besturingssysteem']//li[3]//div//span//span")
	 WebElement productCount_LeftPanel_OS;
	    
	 @FindBy(xpath="//*[@id='js-total']")
	 WebElement productCount_Heading_OS;
	
	
	
	//Accepting Cookes 	
		public void Cookies_Acceptance() throws InterruptedException
	    {
	    	//Accepting Cookies to proceed
	    	Cookies_Acceptance.click();
	    	log.info("Accepted Cookies");

	    }
	
	
		public void SmartWatchesLink() throws InterruptedException
		{
		//Clicking on Tablets in the header of the page
    	Smartwatches.click();
       	log.info("Selected SmartWatches page");
    	Thread.sleep(1000);
		}
		
	
	 public void Smartwatches_product_Buying() throws InterruptedException
	    {
	    		    	
	    	//clicking on view button of a product in the page 
	    	view.click();
	    	log.info("Clicked on view button of the product");
	    	Thread.sleep(1000);
	    }
	 
	 public void Smartwatches_product_Buying_IrrespectiveOfCustomer() throws InterruptedException {
		   	//once all the details are fine above click on ToOrder button on the page
	    	ToOrder.click();
	    	log.info("Clicked on ToOrder button to initiate the process of oredering");
	    	Thread.sleep(1000);
	    	
	    	//If all details are good to go clcik on ContinueToOrder button on the page
	    	ContinueToOrder.click();
	    	log.info("Clicked on ContinueToOrder button");
	    }
	     
	 public void Smartwatches_product_Buying_AlreadyCustomer()
	 {
		 AlreadyCustomer.click();
	 }
	 
	 /***** Brand Apple Validation *****/
 	public void Apple_Brand_validation()
 	{
 		Smartwatches.click();
 			log.info("Clicked on SmartWatches page");
 				Brand_Apple.click();
 				System.out.println("********************************************************************************************");
 					log.info("Selected Apple brand");
 					System.out.println("********************************************************************************************");

 					//Calculating the product count on Left Panel
 					int productCount_LeftPanel_AppleBrand = Integer.parseInt(productCount_LeftPanel_AppleBrand_string.getText());
 					System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_AppleBrand);

 				//Calculating the product count on Main page
 					List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
 					int productCountOnMainPage = Telephones_links.size();
 					System.out.println("Available product count on the Main Page is  "+productCountOnMainPage);		
 			
 				// Calculating the product count on main page which are Apple brand prodcuts
 							List<WebElement> AppleBrand_Products= driver.findElements(By.xpath("//div[@class='catalog-products__product' and @data-brand='apple']"));
 							int CountOfAppleBrand_Products_MainPage = AppleBrand_Products.size();
 							System.out.println("Number Of products those are belongs to apple brand  on main page are " +CountOfAppleBrand_Products_MainPage);
 							
 				// Calculating the product count mentioned in heading			
 							int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
 								System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);
 							

 				// Validating the product count displaying on main page						
 							if(productCount_LeftPanel_AppleBrand == productCountOnMainPage)
 							{
 								
 								System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
 							}
 							else
 							{
 								
 								System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
 							}		

 							
 				// Validating the product count which are belongs to apple brand displaying on main page
 							if(productCount_LeftPanel_AppleBrand == CountOfAppleBrand_Products_MainPage )
 							{
 								
 								System.out.println("All the products are belongs to Apple brand");
 							}
 							
 							else
 								{
 									
 									System.out.println("Some other products are also there  i.e., Other than apple brand products are also displaying");
 								}

 				// Validating the product count in heading
 							if(productCount_LeftPanel_AppleBrand == ProductCountinHeading)
 							{
 								
 								System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
 							}
 							else
 							{
 								
 								System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
 							}
 							
 		Smartwatches.click();	
 	}
 	
 	/***** Colour_Zwart Validation *****/
	public void Filter_colour_Zwart() 
	{
		//Clicking on Colour filter
		colour_Zwart.click();
			System.out.println("********************************************************************************************");
				log.info("Clicked on Zwart colour");
					System.out.println("********************************************************************************************");
		
			//Calculating the product count on Left Panel
					int productCount_LeftPanel = Integer.parseInt(productCount_LeftPanel_colour_string.getText());
						System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel);
			
			//Calculating the product count on Main page
					List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
						int productCountOnMainPage = Telephones_links.size();
							System.out.println("Available product count on the Main Page is  "+productCountOnMainPage);		
														
			//Calculating the product count those are belongs to only zwart colour						
							List<WebElement> zwartColour_Products = driver.findElements(By.xpath("//div[@class='catalog-products__product']//div[@class='phone-block js-phoneblock']//li[@data-color='zwart' and contains(@class, 'color-selected')]"));
									int countOfZwartColourProducts = zwartColour_Products.size();
										System.out.println("Number Of Zwart colour products on Main page are " +countOfZwartColourProducts);
										
			// Calculating the product count mentioned in heading			
							int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
								System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);							
										
	    
			// Validating the product count displaying on main page											
						if(productCount_LeftPanel == productCountOnMainPage)
							{
								
								System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
							}
						else
							{
														
							System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
							}		
			
			// Validating the product count which are belongs to zwart colour displaying on main page		
						if(productCount_LeftPanel == countOfZwartColourProducts )
							{
							   
							System.out.println("All the products dispaying are zwart colour products");
							}
						else
							{
							
							System.out.println("some other colour i.e., Other than zwart colour products are also displaying");
							}
						
			// Validating the product count in heading
						if(productCount_LeftPanel == ProductCountinHeading)
						{
							
							System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
						}
						else
						{
							
							System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
						}
		colour_Zwart.click();
		}
	
	/****  OperatingSystem_Apple watchOS Validation *****/
	public void Filter_OS_Apple() {

		//checking AppleIOS OperatingSystem Filter
		        Apple_Filter.click();
		        	System.out.println("********************************************************************************************");
		        		log.info("Clicked on AppleIOS checkbox");	
		        			System.out.println("********************************************************************************************");
				
        
        //Calculating the product count in left panel 
        		int productCount_LeftPanel_AppleIOS = Integer.parseInt(productCount_LeftPanel_OS.getText());
        				System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_AppleIOS); 
        				
        //Calculating the product count those contains Apple Watch OS only
        	List<WebElement> AppleIOSProducts_MainPage = driver.findElements(By.xpath("//*[@id='js-products']//*[@data-os='apple-watchos']"));
        		int CountOfAppleIOSProducts_MainPage = AppleIOSProducts_MainPage.size();
        			System.out.println("Number Of Android products on Main page are " +CountOfAppleIOSProducts_MainPage);
        				
        //Calculating the product count on Main page
    		List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
    			int productCountOnMainPage = Telephones_links.size();
    				System.out.println("Available product count on the Main Page is  "+productCountOnMainPage);	
    				
    	// Calculating the product count mentioned in heading	
    		int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
    			System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);	
		 
		
    			
    			// Validating the product count displaying on main page		
    			if(productCount_LeftPanel_AppleIOS == productCountOnMainPage)
    			{
    				System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
    			}
    			else
    			{
    				System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
    			}		
    			
    			
    			// Validating the product count those are belongs to Android OS dispalaying on Main page 
    			if(productCount_LeftPanel_AppleIOS == CountOfAppleIOSProducts_MainPage )
    			{
    				System.out.println("All the products contains AppleIOS  Operating System");
    			}
    			
    			else
    				{
    					System.out.println("Some other Operating system i.e., Other than AppleIOS products are also displaying");
    				}
    			
    			
    			// Validating the product count in heading	
    			if(productCount_LeftPanel_AppleIOS == ProductCountinHeading)
    			{
    				System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
    			}
    			else
    			{
    				System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
    			}

	
		
	}
		
 	
	 
	 			}
