package com.automation.mobielshop.kpn.testBase;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.internal.TestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.WaitHelper;

public class TestBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	  public static WebDriver driver;
	  public  String url = "https://mobielshop2.test.marketingmakers.nl";
	     String browser = "chrome";    //Initializing the firefox browser to driver
//	     String browser = "InternetExplorer";    //Initializing the firefox browser to driver
	     public static ExtentReports extent;
	 	 public static ExtentTest test;
	 	 public TestResult result;
	 	 PageLoad pageLoad;
	     
	     
	 //Below is the method which contains browser to test and log4j funcion to logging in console
	     public void init() throws InterruptedException{
	    	 selectBrowser(browser);
	    	  getUrl(url);
	    	  extent = new ExtentReports (System.getProperty("user.dir") + "C:\\Users\\sowmyak\\eclipse-workspace\\com.automation.kpn\\src\\main\\java\\com\\automation\\mobielshop\\kpn\\report\\test.html",false);
	    	  String log4jConfPath = "log4j.properties";
	    	  PropertyConfigurator.configure(log4jConfPath);
	    	  WaitHelper waitHelper = new WaitHelper(driver);
	    	  waitHelper.pageLoadTime(20,TimeUnit.SECONDS);
	    	  Cookies_Acceptance();
	    	  Thread.sleep(3000);
	    	  }

	 // Parameter will get browser from testng.xml on which browser test to run
	 	public void selectBrowser(String myBrowser) {
	 		if (System.getProperty("os.name").contains("Window"))
	 		{
	 			if (myBrowser.equalsIgnoreCase("firefox"))
	 			{
	 				// https://github.com/mozilla/geckodriver/releases
	 				System.out.println(System.getProperty("user.dir"));
	 				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/drivers/geckodriver.exe");
	 				driver = new FirefoxDriver();
	 		
	 			} 
	 			else if (myBrowser.equalsIgnoreCase("chrome")) 
	 			{
	 				// https://chromedriver.storage.googleapis.com/index.html
	 				
	 				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	 				driver = new ChromeDriver();
	 				 				
	 			}
	 			else if(myBrowser.equalsIgnoreCase("IE"))
	 			{
					//https://docs.seleniumhq.org/download/
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"/drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
	 			} 
	 			}
	 		}
	     
	     
		
		//Below is the code to enter the URL of application(KPN) into the browser and maximization of windo
			public void getUrl(String url){
		    	 log.info("navigating to :-"+url);
		    	 driver.get(url);	
		    	 driver.manage().window().maximize();
			}
				
		public String captureScreen(String fileName) {
			if (fileName == "") {
				fileName = "blank";
			}
			File destFile = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "C:\\Users\\sowmyak\\eclipse-workspace\\com.automation.kpn\\test-output\\Failed testcase screenshots\\Failedtestcases";
				destFile = new File((String) reportDirectory + fileName + "_" + formater.format(calendar.getTime()) + ".png");
				FileUtils.copyFile(scrFile, destFile);
				// This will help us to link the screen shot in testNG report
				Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return destFile.toString();
		}

		
		@BeforeMethod
		public void beforeMethod(Method result) {
			test = extent.startTest(result.getName());
			test.log(LogStatus.INFO, result.getName() + " test Started");
		}
		
		//Accepting Cookes 	
		public void Cookies_Acceptance() throws InterruptedException
	    {
				if(driver.findElements(By.xpath("//div[@id='KPN_cookie']//div[2]//button[@class='KPN_cookie_button KPN_cookie_personal']")).size()!=0)
				{
					 driver.findElement(By.xpath("//div[@id='KPN_cookie']//div[2]//button[@class='KPN_cookie_button KPN_cookie_personal']")).click();
					 System.out.println("__________________________________________");	
					 System.out.println("|  Clicked on Acceptance button of cookies|");
					 System.out.println("|_________________________________________|" + "\n");
				}
				
				else
				{
					System.out.println("  _____________________________ ");	
					System.out.println(" |  No Cookies popup available |");
					System.out.println(" |_____________________________|" + "\n");
				}
	      
	        
			
//	    	//Accepting Cookies to proceed
//	    	Cookies_Acceptance.click();
//	    	log.info("Accepted Cookies");
	    }
		
		
		
		}
