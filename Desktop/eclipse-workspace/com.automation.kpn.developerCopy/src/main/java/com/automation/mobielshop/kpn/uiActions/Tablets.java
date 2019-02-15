package com.automation.mobielshop.kpn.uiActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;

import Helper.WaitHelper;

public class Tablets extends TestBase {
	
	public Tablets(WebDriver driver) {
		Tablets.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	WaitHelper waitHelper = new WaitHelper(driver);

	@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
	WebElement Cookies_Acceptance;
	
	@FindBy(xpath="//*[@id='nav-open']/ul/ul/li[5]/a")
	WebElement tablets;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-lg catalog-order-button op-order-button js-orderButton']")
	WebElement view;
	
    @FindBy(xpath="//div[@class='col col-md-6 col-xs-12 pull-right base-padding-helper']//input[@class='btn btn-primary btn-lg']")
    WebElement ToOrder;
   
    @FindBy(xpath="//button[@class='btn btn-primary btn-lg js-basket-submit']")
    WebElement ContinueToOrder;
    
    @FindBy(xpath="//a[@id='c2']")
    WebElement withoutSubscription;
    
    @FindBy(xpath="//*[@id='c1']")
    WebElement withSubscription;
    
    @FindBy(xpath="//ul[@id='filter-Merk']//div")
    WebElement BrandInFirstPlace;
    
    @FindBy(xpath="//div[@id='filters-wrap-']//ul//span//span")
    WebElement productCount_LeftPanel_Brand_string;
    
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
    
    @FindBy(xpath="//ul[@id='filter-Besturingssysteem']//li")
    WebElement Android_Filter;
    
    @FindBy(xpath="//ul[@id='filter-Besturingssysteem']//div//span//span")
    WebElement productCount_LeftPanel_OS;
    
    @FindBy(xpath="//*[@id='js-total']")
    WebElement productCount_Heading_OS;
    
    @FindBy(xpath="//form[@name='productDetailsForm']//div[@class='slider slider-horizontal']//div[@class='slider-handle min-slider-handle']")
	WebElement sliderButton;
	
	@FindBy(xpath="//div[@id='phone-info']//form[@name='productDetailsForm']/div/a[@class='btn btn-primary button-slider button-slider-minus']")
	WebElement button_minus;
	
	@FindBy(xpath="//div[@id='phone-info']//form[@name='productDetailsForm']/div/a[@class='btn btn-primary button-slider button-slider-plus']")
	WebElement button_plus;	

	@FindBy(xpath="//*[@id='bsSliderValOneOff']")
	WebElement eenmalig_top;
	
	@FindBy(xpath="//*[@id='js-bijbetaling']")
	WebElement eenmalig_bottom;
	
	@FindBy(xpath="//*[@id='js-bijbetaling2']")
	WebElement eenmalig_footer;
	
	@FindBy(xpath="//*[@id='bsSliderValMonth']")
	WebElement permaand;
	
	@FindBy(xpath="//*[@id='js-monthlyPayment']")
	WebElement Termijnbedrag_footer;
	
	@FindBy(xpath="//div[@class='row phone-detail-wrap']//div[@id='phone-info']//h1[contains(text(), GB)]")
	WebElement heading;
	
	@FindBy(xpath="//div[@class='shopping-basket-container__upsell-container relative']//div//button")
	WebElement spotify_Premium_pdp;
	
	@FindBy(xpath="//div[@class='shopping-basket-bottom-buttons']//div[3]//div[2]//button")	
	WebElement Further;
	
	@FindBy(xpath="//label[@for='BuySpotify']")
	WebElement SpotifyPremium;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[2]/ul/li[1]/p[2]/span")
	WebElement Eenmalig_pdp_Page_String;
	
	@FindBy(xpath="//*[@id=\"phone-info\"]/div[4]/form/div[1]/div[1]/div/p[6]")
	WebElement Eenmalig_pdp_Page_withoutSubscription_String;
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//div[@class='col-xs-3 col-sm-2 col-md-1']//b//span")
	WebElement Eenmalig_shoppingBasketPage_string;
	
//	@FindBy(xpath="//*[@id='placeholderCartView']/div[2]/div/div[3]/div/div[2]/a/div/div/div/span[2]/span/span") --> other than test5
	@FindBy(xpath="//*[@id='placeholderCartView']/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_personalDetailsPage_string;
	
//	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[3]/div/div[2]/a/div/div/div/span[2]/span/span") --> --> other than test5
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_checkOutPage_string;
		
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div[2]//span//span")
	WebElement Eenmalig_FinalPage_string;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[3]/ul/li[1]/p[2]/span")
	WebElement Totaal_mnd_pdpPage_string;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[5]/div[2]/div/div[3]/span[3]/b/span")
	WebElement Per_mnd_shoppingCartPage_string;
	
	@FindBy(xpath="//div[@class='receipt__wrap']/div/div/div//span/span/span")
	WebElement Totaal_mnd_personalDetailsPage_string;
	
	@FindBy(xpath="//*[@id=\"shoppingBasketWrapper\"]/div[6]/div/button[2]")	
	WebElement SpotifyPremium_ShoppingBasketPage_RemoveButton;
	
//	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[3]/div/div[1]/a/div/div/div/span[2]/span/span") --> other than test5
	@FindBy(xpath="//div[@class='receipt__grid']//span[2]")
	WebElement Totaal_mnd_checkOutPage_string;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div//span//span")
	WebElement Totaal_mnd_FinalPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price js-total-oneoff']//span")
	WebElement Totaal_mnd_WithoutSubscription;
	
	@FindBy(xpath="//div[@class='js-refresh js-gb-link border-wrap' and @data-href='/mobiel/tablets/apple/ipad-pro-10-5-inch-wifi-cell/space-gray-64gb/standaard/2-jaar']")
	WebElement Button64GB;
	
	@FindBy(xpath="//div[@class='js-refresh js-gb-link border-wrap' and @data-href='/mobiel/tablets/apple/ipad-pro-10-5-inch-wifi-cell/space-gray-256gb/standaard/2-jaar']")
	WebElement Button256GB;
	
	@FindBy(xpath="//ul[@id='filter-Sim']//div")
	WebElement Sim_Filter;
	
	@FindBy(xpath="//ul[@id='filter-Sim']//div//span[@class='js-optionCount']")
	WebElement productCount_LeftPanel_SingleSim_string;
	
	  @FindBy(xpath="//*[@id='js-total']")
	    WebElement productCount_Heading_; 
	
	
	
    public void Tablets_product_Buying() throws InterruptedException
    {
    
    	//Clicking on Tablets in the header of the page
    	tablets.click();
       	log.info("Selected Tablets page");
       	Thread.sleep(1000);
    	
    	//click on view button of a product:Tablet in the page 
    	view.click();
    	log.info("Clicked on view button of the product");
    	Thread.sleep(1000);
    
    }
    	
    	
    	public void Tablets_product_Buying_IrrespectiveOfSubscription() throws InterruptedException
    	{   	
    	//once all the details are fine above click on ToOrder button on the page
    	ToOrder.click();
    	log.info("Clicked on ToOrder button to initiate the process of oredering");
    	Thread.sleep(1000);
    	
    	//If all details are good to go clcik on ContinueToOrder button on the page
    	ContinueToOrder.click();
    	log.info("Clicked on ContinueToOrder button");
    	
    }
        	
    	public void Tablets_product_Buying_withoutsubscription() throws InterruptedException 
    	{    	
    		
    		waitHelper.waitForElementVisibleWithPollingTime(withoutSubscription, 10, 1000);
    		withoutSubscription.click();
    		log.info("Clicked on without subscription button");  
    		
    	
    	}
    	
    	public void pageLoadValidation() throws InterruptedException
    	{
    		withoutSubscription.click();
    			String withOutSubscriptionURL = driver.getCurrentUrl();
    			
    				System.out.println("Current URL(withOut subscription) is  "+withOutSubscriptionURL);    		
			    	waitHelper.pageLoadTime(10, TimeUnit.SECONDS);  		
				    		withSubscription.click();
				    		
				    			log.info("Clicked on withSubscription");
				    			waitHelper.pageLoadTime(10, TimeUnit.SECONDS);  				    		
				    			String withSubscriptionURL = driver.getCurrentUrl();
				    			System.out.println("Current URL(with subscription) is "+withSubscriptionURL);
				    			waitHelper.pageLoadTime(10, TimeUnit.SECONDS);  
				    			if(withSubscriptionURL.contains("notfound"))
							    			{
				    				
							    				System.out.println("Issue found, please check manually.");
							    			}
							    			else
							    			{
							    				System.out.println("All good - page is loading as expected.");
							    			}	
    		}
    	
    	public void priceValidation_tablets() throws InterruptedException
    	{
    		
    		//Clicking on Tablets in the header of the page
        	tablets.click();
           	log.info("Selected Tablets page");
           	Thread.sleep(1000);
           	
          //click on view button of a product:Tablet in the page 
        	view.click();
        	log.info("Clicked on view button of the product");
        	Thread.sleep(1000);    		
    		
    		//pdp page values

			//Eenmalig value on pdp page
				System.out.println("=============Price validation for Tablets ===============");
				String Eenmalig_pdp_Page = Eenmalig_pdp_Page_String.getText().substring(2);	
				String Eenmalig_pdp_Page_Checked;
				if(Eenmalig_pdp_Page.contains(","))
				{
					 Eenmalig_pdp_Page_Checked = Eenmalig_pdp_Page;
					 System.out.println("Eenmalig value on pdp page "+Eenmalig_pdp_Page_Checked);
				}
				else
				{
					 Eenmalig_pdp_Page_Checked = Eenmalig_pdp_Page+",00";
					 System.out.println("Appended Eenmalig value on pdp page "+Eenmalig_pdp_Page_Checked);
				}			

			//Totaal/mnd value on shopping cart page		
				String Totaal_mnd_pdpPage = Totaal_mnd_pdpPage_string.getText();
				String Totaal_mnd_pdpPage_Checked;
				
				if(Totaal_mnd_pdpPage.contains(","))
				{
					 Totaal_mnd_pdpPage_Checked = Totaal_mnd_pdpPage;
					 System.out.println("Totaal/mnd_on pdpPage " +Totaal_mnd_pdpPage_Checked);
				}
				else
				{
					Totaal_mnd_pdpPage_Checked = Totaal_mnd_pdpPage+",00";
					System.out.println("Appended Totaal/mnd_on pdpPage " +Totaal_mnd_pdpPage_Checked);
				}
				
					ToOrder.click();		
    		
    	}
    	
    	/***** Brand Apple Validation *****/
    	public void Apple_Brand_validation()
    	{
    		tablets.click();
    			log.info("Clicked on tablets page");
    		
    		BrandInFirstPlace.click();
    			System.out.println("********************************************************************************************");
    				log.info("Clicked on first brand");  
    					System.out.println("********************************************************************************************");

    		// Product count displaying on Left Panel
    					int productCount_LeftPanel_AppleBrand = Integer.parseInt(productCount_LeftPanel_Brand_string.getText());
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
				
    		tablets.click();
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
									
									System.out.println("some other colour i.e., Other than zwaart colour products are also displaying");
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
    	
    	
    	/****  SimKaart SingleSim filter Validation 
    	 * @throws InterruptedException *****/


    	public void Filter_SimKaart_SingleSIM()
    	{
    		
    		Sim_Filter.click();
    		System.out.println("********************************************************************************************");
    		log.info("Clicked on SimKaart Filter");
    		System.out.println("********************************************************************************************");
    		
    		//Calculating the product count on Left Panel
    			int productCount_LeftPanel_SingleSim =  Integer.parseInt(productCount_LeftPanel_SingleSim_string.getText());
    				System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_SingleSim);
    			
    		//Calculating the product count those are belongs those contains single sim only
	    		List<WebElement> SingleSim_Products_MainPage = driver.findElements(By.xpath("//div[@class='catalog-products__product' and @data-sim='single-sim']"));
	    			int CountOfSingleSim_Products_MainPage = SingleSim_Products_MainPage.size();
	    				System.out.println("Number Of products which contains SingleSim on Main page are " +CountOfSingleSim_Products_MainPage);
    			
    		//Calculating the product count on Main page
    				List<WebElement> productCount_MainPage = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
    					int productCountOnMainPage = productCount_MainPage.size();
    						System.out.println("Number Of products dispalying on Main page are " +productCountOnMainPage);
    		
    		
    		//Calculating the product count in heading
	    		int productCountOnHeading = Integer.parseInt(productCount_Heading_.getText());
	    			System.out.println("Product count mentioned in heading is  "+productCountOnHeading); 
    		
    		
	    	// Validating the product count displaying on main page	
        		if(productCount_LeftPanel_SingleSim ==  productCountOnMainPage)
        		{
    				System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
    			}
    			else
    			{
    				System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
    			}
    			
        	
        	// Validating the product count which are belongs to single sim displaying on main page		
        		if(productCount_LeftPanel_SingleSim == CountOfSingleSim_Products_MainPage)
    			{
    				System.out.println("All the products contains Single-Sim products");
    				}	
    			else
    			{
    				System.out.println("some other  products are also displaying");
    			}
    			
        	
        	// Validating the product count in heading
        		if(productCount_LeftPanel_SingleSim == productCountOnHeading)
        		{
        			System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
        		}
        		else
        		{
        			System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
        		}
    	
    		Sim_Filter.click();
    		
    	}
    		
    	/****  OperatingSystem_Android Validation *****/
    	public void Filter_OS_Android() {

    		//checking Android Operating System Filter
    			Android_Filter.click();
    				System.out.println("********************************************************************************************");
    					log.info("Clicked on Android checkbox");	
    						System.out.println("********************************************************************************************");
    		
    					//Calculating the product count in left panel 
    						int productCount_LeftPanel_Android = Integer.parseInt(productCount_LeftPanel_OS.getText());
    						System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_Android);
    					
    					//Calculating the product count those contains Android OS only
    						List<WebElement> AndroidProducts_MainPage = driver.findElements(By.xpath("//*[@id='js-products']//*[@data-os='android']"));
    							int CountOfAndroidProducts_MainPage = AndroidProducts_MainPage.size();
    								System.out.println("Number Of Android products on Main page are " +CountOfAndroidProducts_MainPage);
    						
    					//Calculating the product count on main page
    						List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
    						int productCountOnMainPage = Telephones_links.size();
    						
    					// Calculating the product count mentioned in heading	
    						int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
    							System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);	
    					 
    		
    							

    							// Validating the product count displaying on main page		
    							if(CountOfAndroidProducts_MainPage == productCountOnMainPage)
    							{
    								System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
    							}
    							else
    							{
    								System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
    							}		
    							
    							
    							// Validating the product count those are belongs to Android OS dispalaying on Main page 
    							if(productCount_LeftPanel_Android == CountOfAndroidProducts_MainPage )
    							{
    								System.out.println("All the products contains Android Operating System");
    							}
    							
    							else
    								{
    									System.out.println("Some other Operating system i.e., Other than Android products are also displaying");
    								}
    							
    							
    							// Validating the product count in heading	
    							if(productCount_LeftPanel_Android == ProductCountinHeading)
    							{
    								System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
    							}
    							else
    							{
    								System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
    							}

    			
    			Android_Filter.click();
    	}
    	
    	public void DetailsPageValidation_NewUser() throws InterruptedException
    	{
    		tablets.click();
    		log.info("Clicked on tablets page");
    		Thread.sleep(1000);
    		view.click();
    	}
    	/****  Validation of Price details *****/

    	public void price_validation()
    	{
    		
    		waitHelper.waitForElementVisibleWithPollingTime(eenmalig_bottom, 10, 1000);
    	String eenmalig_top_String = eenmalig_top.getText();
    	int eenmalig_top_Numeric = Integer.parseInt(eenmalig_top_String);

    	String eenmalig_bottom_String = eenmalig_bottom.getText();
    	int eenmalig_bottom_Numeric = Integer.parseInt(eenmalig_bottom_String);

    	String eenmalig_footer_String = eenmalig_footer.getText();
    	int eenmalig_footer_Numeric = Integer.parseInt(eenmalig_footer_String);

    	String permaand_string = permaand.getText();
    	int permaand_numeric = Integer.parseInt(permaand_string);

    	String Termijnbedrag_footer_string = Termijnbedrag_footer.getText();
    	int Termijnbedrag_footer_numeric = Integer.parseInt(Termijnbedrag_footer_string);

    	System.out.println("eenmalig in top is "+eenmalig_top_Numeric);	
    	System.out.println("eenmalig in bottom  is "+eenmalig_bottom_Numeric);
    	System.out.println("eenmalig in Footer  is "+eenmalig_footer_Numeric);

    			if((eenmalig_top_Numeric == eenmalig_bottom_Numeric) && (eenmalig_top_Numeric == eenmalig_footer_Numeric))
    			{
    				System.out.println("All eenmalig values are equal");
    			}
    			else
    			{
    				System.out.println("All eenmalig values are NOT equal");
    			}	
    			System.out.println("permaanth Price is "+permaand_numeric);
    			System.out.println("permaanth Price on footer is "+Termijnbedrag_footer_string);

    			
    			if(permaand_numeric == Termijnbedrag_footer_numeric) 
    			{
    				System.out.println("per Month values are equal ");
    			}
    			else
    			{
    				System.out.println("per Month values are NOT equal ");
    			}
    			}


    		/****Slider Validation ******/
    		public void DetailsPageValidation_slider() throws InterruptedException
    		{
    			((JavascriptExecutor) driver).executeScript(
		                "window.scrollBy(0,500)");
    			button_minus.click();
    			button_minus.click();
    			button_plus.click();
    			Actions act = new Actions(driver);
    			act.clickAndHold(sliderButton).moveByOffset(-500, 0).release().build().perform();	
    			this.price_validation();
    			Thread.sleep(1000);
    			act.clickAndHold(sliderButton).moveByOffset(500, 0).release().build().perform();	
    			this.price_validation();
    			Thread.sleep(1000);
    			act.clickAndHold(sliderButton).moveByOffset(-250, 0).release().build().perform();
    			this.price_validation();	    
    		}
    		
    		/**** Memory size validation ****/
    		public void DetailsPageValidation_Heading() throws InterruptedException
    			{
    			
    			String button64GB = Button64GB.getText();
    			System.out.println("Clicked on 64GB button");
    			String URL_64GB = driver.getCurrentUrl();
    			System.out.println("URL when clicked on 64GB button is "+URL_64GB);
    			
    			if(URL_64GB.contains("/mobiel/tablets/apple/ipad-pro-10-5-inch-wifi-cell/space-gray-64gb/standaard/2-jaar"))
    			{
    				System.out.println("Memory size button validation is fine");
    			}
    			
    			else
    			{
    				System.out.println("Memory size button validation is not good, Please chck manually.");
    			}
    			
    			Button256GB.click();    			
    			String button256GB = Button256GB.getText();
    			log.info("Clicked on 256GB button ");
    			String URL_256GB = driver.getCurrentUrl();
    			System.out.println("URL when clicked on 256GB button is "+URL_256GB);
    			
    			if(URL_256GB.contains("/mobiel/tablets/apple/ipad-pro-10-5-inch-wifi-cell/space-gray-256gb/standaard/2-jaar"))
    			{
    				System.out.println("Memory size button validation is fine");
    			}
    			
    			else
    			{
    				System.out.println("Memory size button validation is not good, Please chck manually.");
    			}
    				}
    			
    		
    		
    		public void shoppingBasketPageValidation() throws InterruptedException
    		{
    			tablets.click();
    					Thread.sleep(1000);
    				view.click();
    					log.info("Clicked on view button");
    						Thread.sleep(1000);
    						((JavascriptExecutor) driver).executeScript(
    				                "window.scrollBy(0,500)");
    			ToOrder.click();
    			log.info("Clicked on ToOrder  button");
    				Thread.sleep(1000);
    				((JavascriptExecutor) driver).executeScript(
			                "window.scrollBy(0,500)");
    					spotify_Premium_pdp.click();
	    					log.info("Clicked on spotify premium");					
    							Thread.sleep(1000);    							
    								String Per_maand_shoppingCartPage_SpotifyPremiumSelectedonShoppingCartPage = Per_mnd_shoppingCartPage_string.getText();
    								System.out.println("=======================================================================");
    								System.out.println("Per maand value when spotify premium is selected on shopping cart page is "+Per_maand_shoppingCartPage_SpotifyPremiumSelectedonShoppingCartPage);
    								System.out.println("=======================================================================");
    									SpotifyPremium_ShoppingBasketPage_RemoveButton.click();
    										log.info("Removing spotify Premium on shoppingCart Page");
    											Thread.sleep(1000); 
    							
    							Further.click();
    							log.info("Clicked on Further button");
    							Thread.sleep(1000);

    							
    							//calling Methods from extraCheckOfDevicePayment
    									extraCheckOfDevicePayment ExtraCheckOfDevicePayment=new extraCheckOfDevicePayment(driver);	        
    								//Calling methods from extraCheckOfDevicePayment 
    									ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();    									
    									log.info("Going to next page");    							
    									
    									Thread.sleep(3000);
    									((JavascriptExecutor) driver).executeScript(
    		    				                "window.scrollBy(492, 1493)");
    									Actions actions = new Actions(driver);
    									actions.moveToElement(SpotifyPremium).click().build().perform();
    									
//    									SpotifyPremium.click();
    									log.info("Clicked on spotifyPremium on personal Details page");
    									
    									driver.navigate().back();
    									log.info("Going to previous page");
    									
    									
    									String Per_maand_shoppingCartPage_SpotifyPremiumSelectedonPersonalDetailsPage = Per_mnd_shoppingCartPage_string.getText();
    									System.out.println("=======================================================================");
    	    							System.out.println("Per maand value when spotify premium is selected on Personal Details page is "+Per_maand_shoppingCartPage_SpotifyPremiumSelectedonPersonalDetailsPage);
    	    							System.out.println("=======================================================================");
    									
    									if(Per_maand_shoppingCartPage_SpotifyPremiumSelectedonShoppingCartPage.equals(Per_maand_shoppingCartPage_SpotifyPremiumSelectedonPersonalDetailsPage))
    									{
    										System.out.println("SpotifyPremium is selected on both pages");
    										System.out.println("=======================================================================");
    									}
    									else
    									{
    										System.out.println("SpotifyPremium is Not Selected on both pages,please check Manually.");
    										System.out.println("=======================================================================");
    									}
    	    							
    	    							
    									

    		}		
    									
    									
    				

    	public void priceValidation_Tablets_EndToEnd() throws InterruptedException {
    			
    			tablets.click();
    				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
    				waitHelper.WaitForElementClickable(view, 10);
    					view.click();
							log.info("Clicked on view button");
						
    		
    	}
    	public void Tablets_Buying_ClickingonLink()
    	{

			tablets.click();
    	}
    	
    	
}

    		


