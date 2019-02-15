package com.automation.mobielshop.kpn.uiActions;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
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


public class Telephones extends TestBase{
	public static final Logger log = Logger.getLogger(Telephones.class.getName());
		WebDriver driver;
			WaitHelper waitHelper = new WaitHelper(driver);
	
		public Telephones(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	/** 
	 * Initializing elements through pageFactory approach by using @FindBy annotation 
	 * */
		
	@FindBy(xpath="//div[@id='KPN_cookie_content_wrapper']//button[@name='cookies-accepteren']")
	WebElement Cookies_Acceptance;
	
	@FindBy(xpath="//*[@id='js-products']/div[1]/product-group/div/div/div/a")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"nav-open\"]/ul/ul/li[2]/a")
	WebElement Telephones_link;
	
	@FindBy(xpath="//*[@class='col col-md-6 col-xs-12 base-padding-helper']")
	WebElement ToOrder;
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-lg js-basket-submit']")
	WebElement ContinueToOrder;
	
	@FindBy(xpath="//*[@id='filter-Merk']/li[1]/div")
	WebElement Brand_Apple;
	
	@FindBy(xpath="//*[@id='filter-Merk']/li[1]/div/span[2]/span")
	WebElement productCount_LeftPanel_AppleBrand_string;
	
	@FindBy(xpath="//*[@id='filter-Kleur']/li[1]/div/span[2]/span")
	WebElement productCount_LeftPanel_colour_string;
	
	@FindBy(xpath="//a[@data-target='#filter-Merk']")
	WebElement Filter_Brand;
	
	@FindBy(xpath ="//a[@data-target='#filter-Kleur']")
	WebElement Filter_Colour;
	
	@FindBy(xpath="//a[@data-target = '#filter-Besturingssysteem']")
	WebElement Filter_OperatingSystem;
	
	@FindBy(xpath="//*[@id='filter-Merk']/li[11]/a[1]")
	WebElement Toon_Mer_Brand;
	
	@FindBy(xpath="//*[@id='<ul']//span[@class='js-optionCount']")
	WebElement productCount_LeftPanel;
	
	@FindBy(xpath="//*[@id='filter-Kleur']/li[1]")
	WebElement colour_Zwart;
	
	@FindBy(xpath="//li[@class='color-container__li color-selected' AND @data-color='zwart']")
	WebElement zwart_color_block;
	
	@FindBy(xpath="//*[@id='filter-Besturingssysteem']//div")
	WebElement Android_Filter;	
	
	@FindBy(xpath="//*[@id='filter-Besturingssysteem']//span[@class='js-optionCount']")
	WebElement productCount_LeftPanel_Android_string;
	
	@FindBy(xpath="//button[@class='btn bundle-selector__open col-xs-2 col-md-3 col-sm-3 hidden-xs']")
	WebElement WijZig;
	
	@FindBy(xpath="//div[@id='bundle-selector-subscription-modal.html']//a[@id='kiesbutton']")
	WebElement kiesbutton;
	
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
	
	@FindBy(xpath="//div[@id='phone-info']//h1[contains(text(), GB)]")
	WebElement heading;
	
	@FindBy(xpath="//div[@class='shopping-basket-bottom-buttons']//div[3]//div[2]//button")
	WebElement Further;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[1]/button[1]")
	WebElement ToestelverzekeringSchade_ShoppingBasketPage;
	
	@FindBy(xpath="//input[@class='mr-xs js-updatecart-vas js-checkout-upsell'][@value='1675294900']")
	WebElement ToestelverzekeringSchade_PersonalDetailsPage;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[1]/button[2]")
	WebElement ToestelverzekeringSchade_ShoppingBasketPage_RemoveButton;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[2]/button[1]")
	WebElement ToestelverzekeringTotaal_ShoppingBasketPage; 
	
	@FindBy(xpath="//input[@class='mr-xs js-updatecart-vas js-checkout-upsell'][@value='375294939']")
	WebElement 	ToestelverzekeringTotaal_PersonalDetailsPage;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[2]/button[2]")
	WebElement ToestelverzekeringTotaal_ShoppingBasketPage_RemoveButton;	
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[3]/button[1]")
	WebElement SpotifyPremium_ShoppingBasketPage;
	
	@FindBy(css = "label[for=BuySpotify]")
	WebElement SpotifyPremium_personalDetailsPage;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[6]/div[3]/button[2]")
	WebElement SpotifyPremium_ShoppingBasketPage_RemoveButton;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[2]/ul/li[1]/p[2]/span")
	WebElement Eenmalig_pdp_Page_String;
	
	@FindBy(xpath="//div[@class='row shopping-basket-total']//div[@class='col-xs-3 col-sm-2 col-md-1']//b//span")
	WebElement Eenmalig_shoppingBasketPage_string;
	
	@FindBy(xpath="//*[@id='placeholderCartView']/div[2]/div/div[3]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_personalDetailsPage_string;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[3]/div/div[2]/a/div/div/div/span[2]/span/span")
	WebElement Eenmalig_checkOutPage_string;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div[2]//span//span")
	WebElement Eenmalig_FinalPage_string;
	
	@FindBy(xpath="//*[@id='phone-info']/div[4]/form/div[2]/div[3]/ul/li[1]/p[2]/span")
	WebElement Totaal_mnd_pdpPage_string;
	
	@FindBy(xpath="//*[@id='shoppingBasketWrapper']/div[5]/div[2]/div/div[3]/span[3]/b/span")
	WebElement Totaal_mnd_shoppingCartPage_string;
	
	@FindBy(xpath="//div[@class='receipt__wrap']/div/div/div//span/span/span")
	WebElement Totaal_mnd_personalDetailsPage_string;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/div[3]/div/div[1]/a/div/div/div/span[2]/span/span")
	WebElement Totaal_mnd_checkOutPage_string;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset']/div//span//span")
	WebElement Totaal_mnd_FinalPage_string;
	
	@FindBy(xpath="//span[@class='kpn-display-price js-total-oneoff']")
	WebElement Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_String;
	
	@FindBy(xpath="//label[@for='BuySpotify']")
	WebElement Spotify_Premium;
	
	@FindBy(xpath="//span[@class='kpn-display-price js-total-oneoff']")
	WebElement Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage_String;
	
	@FindBy(xpath="//ul[@id='filter-Sim']//div")
	WebElement DualSim_Filter;
	
	@FindBy(xpath="//ul[@id='filter-Sim']//div//span[@class='js-optionCount']")
	WebElement DualSim_Filter_LeftPanelCount;
	
	@FindBy(xpath="//ul[@id='filter-Promotion']//div")
	WebElement Promotion_Filter;
	
	@FindBy(xpath="//ul[@id='filter-Staat']//div")
	WebElement Filter_Staat;
	
	@FindBy(xpath="//ul[@id='filter-Staat']//span[@class='js-optionCount']")
	WebElement productCount_LeftPanel_Niew_string;
	
	@FindBy(xpath="//ul[@id='filter-Promotion']//span[@class='js-optionCount']")
	WebElement productCount_LeftPanel_Promotion_string;
	
	@FindBy(xpath="//span[@id='js-total']")
    WebElement productCount_Heading_Brand;
	
	String Eenmalig_pdp_Page_Checked;
	String Totaal_mnd_pdpPage_Checked;
	String Totaal_mnd_ShoppingBasketPage_Checked;
	String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage_Checked;
	String lineBreaker = "=======================================================================";
	
	
	//Accepting Cookes 	
	public void Cookies_Acceptance() throws InterruptedException
    {
			if(driver.findElements(By.xpath("//div[@id='KPN_cookie']//div[2]//button[@class='KPN_cookie_button KPN_cookie_personal']")).size()!=0)
			{
				 driver.findElement(By.xpath("//div[@id='KPN_cookie']//div[2]//button[@class='KPN_cookie_button KPN_cookie_personal']")).click();
				 	System.out.println(" Clicked on Acceptance button of cookies ");
			}
			
			else
			{
				System.out.println("No Cookies popup available ");
			}

    }
	
	
	// Part Of  End To End Scenraio Test
	public void Telefoons_product_Buying() throws InterruptedException
	{		
		
		// Clicking on Phone icon in the listto start buying
		phone.click();
		log.info("clicked on view and object is:-"+phone.toString());
		
		Thread.sleep(7000);
		//clicking on ToOrder button on the page
		ToOrder.click();
		log.info("clicked on ToOrder and object is:-"+ToOrder.toString());
		
		Thread.sleep(7000);
		//once all the details are good to go - Click on Continue_To_Order button on the page
		ContinueToOrder.click();
		log.info("clicked on ContinueToOrder and object is:-" +ContinueToOrder.toString());		
	}
	
	/**** Brand_Apple Validation 
	 * @throws InterruptedException ****/
public void Apple_Brand() throws InterruptedException
	{

	
	Telephones_link.click();
		waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
	
	//Selecting Apple brand
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
					
	
		Brand_Apple.click();
		
		
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
	

	/*** Sim Kaart Filter Validation ***/
	public void Filter_SimKaart_DualSIM()
		{
			//Clicking on Dual Sim
				DualSim_Filter.click();
					System.out.println("********************************************************************************************");
						log.info("Clicked on Dual Sim");
						System.out.println("********************************************************************************************");
			
			//Calculating the product count on Left Panel
				int productCount_LeftPanel = Integer.parseInt(DualSim_Filter_LeftPanelCount.getText());
					System.out.println("Available product count on Left panel is " +productCount_LeftPanel);
								
			//Calculating the product count on main page
				List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
					int productCountOnMainPage = Telephones_links.size();
									
			//Calculating the product count those are belongs those contains dual sim only		
					List<WebElement> dualSim_Products = driver.findElements(By.xpath("//div[@class='catalog-products__product'  and @data-sim='dual-sim']"));
						int countOfdualSim_Products = dualSim_Products.size();
							System.out.println("Number Of products those are belongs those contains dualSim only on Main page are " +countOfdualSim_Products);
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
			
			// Validating the product count which are belongs to dual sim displaying on main page		
						if(productCount_LeftPanel == countOfdualSim_Products )
							{
							   
							System.out.println("All the products contains dualSim only.");
							}
						else
							{
							
							System.out.println("some other products i.e., Other than dualSim products are also displaying");
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
			
						DualSim_Filter.click();
						
						}
					
					
					

	/****  Filter_Staat_Nieuw Validation 
	 * @throws InterruptedException *****/
	
		public void Filter_Staat_Nieuw()
		{
			Filter_Staat.click();
			System.out.println("********************************************************************************************");
			log.info("Clicked on Staat filter ");
			System.out.println("********************************************************************************************");
			
			//calculating the product count on Left panel 
			int productCount_LeftPanel_Niew = Integer.parseInt(productCount_LeftPanel_Niew_string.getText());
			System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_Niew);
			
			//Calculating the product count on main page
			List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
			int productCountOnMainPage = Telephones_links.size();
			System.out.println("Available product count on the Main Page is  "+productCountOnMainPage);		
			
			//Calculating the product count those are belongs to nieuw
			List<WebElement> Nieuw_products = driver.findElements(By.xpath("//div[@class='catalog-products__product' and @data-staat='nieuw']"));
			int CountOfNieuwProducts_MainPage = Nieuw_products.size();
			System.out.println("Number Of products those are neiuw on Main page are " +CountOfNieuwProducts_MainPage);

			// Calculating the product count mentioned in heading					
			int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
			System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);
			
			
			// Validating the product count displaying on main page		
				if(CountOfNieuwProducts_MainPage == productCountOnMainPage)
				{
					System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
				}
				else
				{
					System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
				}		
	
			
			// Validating the product count those are belongs to nieuw only
				if(productCount_LeftPanel_Niew == CountOfNieuwProducts_MainPage )
				{
					System.out.println("All the products are Nieuw");
				}
				
				else
				{
					System.out.println("Some other products are also there  i.e., Other than Nieuw products are also displaying");
				}
			
			// Validating the product count in heading
				if(productCount_LeftPanel_Niew == ProductCountinHeading)
				{
					System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
				}
				else
				{
					System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
				}
				
				Filter_Staat.click();
				
			}
		
		/****  Promotion filter Validation 
		 * @throws InterruptedException *****/
	
public void Filter_Promotions() throws InterruptedException {
	
	Promotion_Filter.click();
	System.out.println("********************************************************************************************");
	log.info("clicked on promotions filter");
	System.out.println("********************************************************************************************");
	
		//Calculating the product count in left panel
			int productCount_LeftPanel_Promotion = Integer.parseInt(productCount_LeftPanel_Promotion_string.getText());
			System.out.println("Available product count on Left Panel is  "+productCount_LeftPanel_Promotion);
			
		//Calculating the product count on main page
			List<WebElement> Telephones_links = driver.findElements(By.xpath("//div[@class='catalog-products__product']"));
			int productCountOnMainPage = Telephones_links.size();
			System.out.println("Available product count on the Main Page is  "+productCountOnMainPage);	
			
		//Calculating the product count those are in promotions dispalaying on Main page
			List<WebElement> Promotion_Blocks = driver.findElements(By.xpath("//div[@class='catalog-products__product' and @data-promotion='aanbiedingen']"));
			int CountOfPromotionProducts_MainPage = Promotion_Blocks.size();
			System.out.println("Number Of products those are in promotions dispalaying on Main page are " +CountOfPromotionProducts_MainPage);
		
		// Calculating the product count mentioned in heading	
			int ProductCountinHeading = Integer.parseInt(productCount_Heading_Brand.getText());
			System.out.println("Product count mentioned in heading is  "+ProductCountinHeading);
			

		// Validating the product count displaying on main page	
			if(CountOfPromotionProducts_MainPage == productCountOnMainPage)
			{
				System.out.println("Number of Products on LeftSide panel is EQUALS to Number of Products on Main Page");
			}
			else
			{
				System.out.println("Number of Products on LeftSide panel is NOT EQUALS to Number of Products on Main Page");
			}		

		// Validating the product count those are in promotions dispalaying on Main page 
			if(productCount_LeftPanel_Promotion == CountOfPromotionProducts_MainPage )
			{
				System.out.println("All the products are in promotions");
			}			
			else
			{
			   System.out.println("Some other products are also there  i.e., Other than promotions products are also displaying");
			}
			
		// Validating the product count in heading
			if(productCount_LeftPanel_Promotion == ProductCountinHeading)
			{
				System.out.println("Product count mentioned in heading is equals to the product count on leftPanel");
			}
			else
			{
				System.out.println("Product count mentioned in heading is Not Equals to the product count on leftPanel");
			}
	
				Promotion_Filter.click();

				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("scroll(0, 50);");
			
}


/****  OperatingSystem_Android Validation *****/
public void Filter_OS_Android() {
	
	//checking Android Operating System Filter
	
	Android_Filter.click();
		
			System.out.println("********************************************************************************************");
				log.info("Clciked on Android checkbox");
				System.out.println("********************************************************************************************");
				
	//Calculating the product count in left panel 
		int productCount_LeftPanel_Android = Integer.parseInt(productCount_LeftPanel_Android_string.getText());
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
//	log.info("Unchecked Android checkbox");
	
	
	}



/*** pdp Page Validation 
 * @throws InterruptedException *****/
		public void DetailsPageValidation_subscription() throws InterruptedException
		{
			
			Telephones_link.click();
			waitHelper.pageLoadTime(20, TimeUnit.SECONDS);
			waitHelper.waitForElementVisibleWithPollingTime(phone, 10, 1000);
					phone.click();
						log.info("Clicked on phone in cat page");			
					
					waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
//					waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,700)");
					
					//Caluculating subscription options availability		
					List<WebElement> subscriptionOptions = driver.findElements
									(By.xpath("//div[starts-with(@class,'input-radio-custom subscription-plan col-xs-12 js-refresh')]"));
					
								
							int optionsAvailable = subscriptionOptions.size();
							System.out.println(lineBreaker);
								System.out.println("Number of subscriptions options available are  "+optionsAvailable);
								System.out.println(lineBreaker);
								
								
					// Clicking on every subscription button available on th epage
							for(int option=0;option<=optionsAvailable-1;option++)
							{
								
								List<WebElement> subscriptionOptions_callingAsPageIsRefreshing = driver.findElements(By.xpath("//div[starts-with(@class,'input-radio-custom subscription-plan col-xs-12 js-refresh')]"));	
										subscriptionOptions_callingAsPageIsRefreshing.get(option).click();	
									System.out.println("Clicked on the button");
									waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
									
									
							}
			}




	
		/****  Validation of Price details *****/

		public void price_validation()
		{
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
					
					System.out.println(lineBreaker);
				}
				else
				{
					System.out.println("per Month values are NOT equal ");
					System.out.println(lineBreaker);
				}
				}
				
				/****Slider Validation ******/
				public void DetailsPageValidation_slider() throws InterruptedException
				{
					Thread.sleep(1000);
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
			List<WebElement> buttons_Memory = driver.findElements(By.xpath("//div[starts-with(@class,'memory-block')]//button"));
			System.out.println("Number of memory buttons available are "+buttons_Memory.size());
			
			Thread.sleep(1000);
			String buttons_Memory_string;
			String Memory_heading;
			for(int j=0; j<= buttons_Memory.size()-1;j++)
				{	
					buttons_Memory.get(j).click();
						log.info("Clicked on the button");					
							buttons_Memory_string = buttons_Memory.get(j).getText().replaceAll("\\s","");
								System.out.println("Memory size on button is "+buttons_Memory_string);
									Thread.sleep(3000);
										Memory_heading = heading.getText();
											System.out.println(Memory_heading);		
						
						if(heading.getText().contains(buttons_Memory_string))
						{
							System.out.println(" Memory size validation is good ");
						}
						else
						{
							System.out.println(" There is a difference in memory size displaying, please check ");
						}					
						
			}
		}
		
		
	public void shoppingBasketPageValidation() throws InterruptedException
	{
			phone.click();
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");	
					Actions actions = new Actions(driver);
						actions.moveToElement(ToOrder).click().build().perform(); 
							log.info("Clicked on Bestellen button");
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
						
		//* Validating ToestelverzekeringSchade Insurance option **//
				ToestelverzekeringSchade_ShoppingBasketPage.click();
					log.info("Clicked on ToestelverzekeringSchade insurance");				
						Further.click();
						waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
		//calling Methods from extraCheckOfDevicePayment
			extraCheckOfDevicePayment ExtraCheckOfDevicePayment=new extraCheckOfDevicePayment(driver);	        
		//Calling methods from extraCheckOfDevicePayment 
				ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
					log.info("Going to next page");
					waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
					waitHelper.waitForElementVisibleWithPollingTime(ToestelverzekeringSchade_PersonalDetailsPage, 10, 1000);
//						
//						((JavascriptExecutor) driver).executeScript(
//				                "window.scrollBy(0, 1000)");	
	
		if(ToestelverzekeringSchade_PersonalDetailsPage.isSelected())
		{
			log.info("check done");
			System.out.println("=======================================================================");	
			System.out.println("ToestelverzekeringSchade option is selected on both shoppingCart and PersonalDetails Pages");
			System.out.println("=======================================================================");
		}
		else
		{
			log.info("check done");
			System.out.println("=======================================================================");
				System.out.println("Some other option is selected on both shoppingCart and PersonalDetails Pages");
				System.out.println("=======================================================================");
		}
			
			Thread.sleep(3000);	
				driver.navigate().back();
					log.info("I went to previous page");
						Thread.sleep(3000);
							ToestelverzekeringSchade_ShoppingBasketPage_RemoveButton.click();
		
		//* Validating ToestelverzekeringTotaal Insurance option **//
				ToestelverzekeringTotaal_ShoppingBasketPage.click();
					Further.click();
						Thread.sleep(3000);
							log.info("Going to next page");
								Thread.sleep(3000);
									ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
										log.info("Going to next page");
											Thread.sleep(3000);
				
		// Validating Insurance options
				if(ToestelverzekeringTotaal_PersonalDetailsPage.isSelected())
				{
					log.info("check done");
					System.out.println("=======================================================================");
						System.out.println("ToestelverzekeringTotaal option is selected on both shoppingCart and PersonalDetails Pages");
						System.out.println("=======================================================================");
				}
				else
				{
					log.info("check done");
					System.out.println("=======================================================================");
						System.out.println("Some other option is selected on both shoppingCart and PersonalDetails Pages");
						System.out.println("=======================================================================");
				}
				
				driver.navigate().back();
					log.info("I went to previous page");
						Thread.sleep(3000);	
						ToestelverzekeringTotaal_ShoppingBasketPage_RemoveButton.click();
	}
						
		/*//Validatin spotiofy premium insurance individually
						
						SpotifyPremium_ShoppingBasketPage.click();
							String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_String.getText();				
								System.out.println("Totaal value on ShoppingCart page when Spotify PRemium is selected on Shopping Cart Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage);
								SpotifyPremium_ShoppingBasketPage_RemoveButton.click();	
									Further.click();
									Thread.sleep(3000);
										log.info("Going to next page");
											Thread.sleep(3000);
												ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
													log.info("Going to next page");
														Thread.sleep(3000);
														((JavascriptExecutor) driver).executeScript(
												                "window.scrollBy(0, 800)");
															Spotify_Premium.click();
															log.info("clicked on SpotifyInsurance on personalDetails page");
															driver.navigate().back();
															Thread.sleep(3000);
														
							String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPagee = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage_String.getText();													
								System.out.println("Totaal value on ShoppingCart page when Spotify PRemium is selected on personalDetails Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPagee);		
																
								
								
								if(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage.equals(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPagee))	
								{
									System.out.println("=======================================================================");
									System.out.println("Spotify premium is selected on both shoppingCart and PersonalDetails Pages");
									System.out.println("=======================================================================");
								}
								else
								{
									System.out.println("=======================================================================");
									System.out.println("Spotify premium is not selected on both shoppingCart and PersonalDetails Pages");
									System.out.println("=======================================================================");
								} 
						
									Thread.sleep(3000);	*/
						
	/*// Validating ToestelverzekeringSchade and spotifyPremium options together functionality 
									ToestelverzekeringSchade_ShoppingBasketPage.click();
										log.info("clicked on  ToestelverzekeringSchade button on shopping cart page");									
											String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringSchade = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_String.getText();
												System.out.println("-----------------------------------------------------------------------");
													System.out.println("Totaal value on ShoppingCart page when Spotify PRemium is selected on Shopping Cart Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringSchade);
														System.out.println("-----------------------------------------------------------------------");
															SpotifyPremium_ShoppingBasketPage_RemoveButton.click();	
																log.info("Removed Spofify Insurance on shoppingCart page");
																	Further.click();
																		log.info("Going to Next page");
																			Thread.sleep(3000);						
					
		//Calling methods from extraCheckOfDevicePayment 
					ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
							log.info("Going to next page");
								Thread.sleep(3000);
								((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800)");
								Thread.sleep(1000);
									Spotify_Premium.click();
										log.info("clicked on SpotifyInsurance on personalDetails page");
										 	driver.navigate().back();
										Thread.sleep(3000);
										
										
										String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringSchade = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage_String.getText();													
										System.out.println("-----------------------------------------------------------------------");
										System.out.println("Totaal value on ShoppingCart page when Spotify PRemium is selected on personalDetails Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringSchade);
										System.out.println("-----------------------------------------------------------------------");
								
								if(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringSchade.equals(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringSchade))	
										{
									System.out.println("=======================================================================");		
									System.out.println("ToestelverzekeringSchade and Spotify Premium is selected on both shoppingCart and PersonalDetails Pages");
									System.out.println("=======================================================================");
										}
										else
										{
											System.out.println("=======================================================================");
											System.out.println("ToestelverzekeringSchade and Spotify premium is Not selected on both shoppingCart and PersonalDetails Pages");
											System.out.println("=======================================================================");
										} 
								
		// Validating ToestelverzekeringTotaal and spotifyPremium options together functionality 
				ToestelverzekeringSchade_ShoppingBasketPage_RemoveButton.click();
					log.info("Removed ToestelverzekeringSchade button on shopping cart page" );
						ToestelverzekeringTotaal_ShoppingBasketPage.click();
							log.info("clicked on ToestelverzekeringTotaal button on shoppingbasket page");
										String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringTotaal = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_String.getText();
										System.out.println("-----------------------------------------------------------------------");	
										System.out.println("Totaal value on ShoppingCart page when Spotify Premium is selected on Shopping Cart Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringTotaal);
										System.out.println("-----------------------------------------------------------------------");
												SpotifyPremium_ShoppingBasketPage_RemoveButton.click();	
													log.info("Removed Spofify Insurance on shoppingCart page");
														Further.click();
															Thread.sleep(3000);
															
		//Calling methods from extraCheckOfDevicePayment 
				ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
					log.info("Going to next page");
						Thread.sleep(3000);
						((JavascriptExecutor) driver).executeScript(
				                "window.scrollBy(0, 1000)");	
						Thread.sleep(1000);
							Spotify_Premium.click();
								log.info("clicked on SpotifyInsurance on personalDetails page");	
								driver.navigate().back();
								log.info("Going back to shoppig cart page");
								Thread.sleep(3000);

								String Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringTotaal = Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage_String.getText();	
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Totaal value on ShoppingCart page when Spotify PRemium is selected on personalDetails Page"+Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringTotaal);
								System.out.println("-----------------------------------------------------------------------");
										
												if(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnShoppingCartPage_ToestelverzekeringTotaal.equals(Totaal_mnd_ShoppingBasketPage_SpotifySelectedOnPersonalDetailsPage__ToestelverzekeringTotaal))	
													{
													System.out.println("=======================================================================");
														System.out.println("ToestelverzekeringTotaal and spotifyPremium is selected on both shoppingCart and PersonalDetails Pages");
														System.out.println("=======================================================================");
													}
												else
													{
													System.out.println("=======================================================================");
														System.out.println("ToestelverzekeringTotaal and spotifyPremium is selected on both shoppingCart and PersonalDetails Pages");
														System.out.println("=======================================================================");
													} 				
		
		}*/
		
		public void priceValidation_Phones_EndToEnd() throws InterruptedException, AWTException
		{
			waitHelper.waitForElementVisibleWithPollingTime(phone, 10, 1000);
			 waitHelper.WaitForElementClickable(phone,10);
			 waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
				phone.click();
		}
	
}