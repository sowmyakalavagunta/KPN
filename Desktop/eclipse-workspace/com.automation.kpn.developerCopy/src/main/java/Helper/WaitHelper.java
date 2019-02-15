package Helper;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.automation.mobielshop.kpn.testBase.TestBase;

public class WaitHelper extends TestBase {
	WebDriver driver;
	
	public Logger log = Logger.getLogger(WaitHelper.class);

	public WaitHelper(WebDriver driver){
		this.driver=TestBase.driver;
	}
	
	/**
	 * This is Implicit Wait
	 * @param timeout
	 * @param unit
	 */
	public void setImplicitWait(long timeout, TimeUnit unit) {
		this.driver = TestBase.driver;
		log.info("Implicit wait has been set to: " +timeout);
		driver.manage().timeouts().implicitlyWait(timeout, unit);		
	}
	
	
	/** 
	 * This Method Will help us to get WebDriverWait object
	 * @param timeOutInSeconds
	 * @param PollingEveryInMilliSec
	 * @return
	 */
	private WebDriverWait getWait(int timeOutInSeconds, int PollingEveryInMilliSec) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(PollingEveryInMilliSec));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;			
	}
	
	
	/**
	 * This method will make sure Element is visible
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 */
	public void waitForElementVisibleWithPollingTime(WebElement element, int timeOutInSeconds, int pollingEveryInMilliSec) {
		this.driver= TestBase.driver;
		log.info("Waiting for :" +element.toString()+ " for : "+timeOutInSeconds+ " Seconds ");
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMilliSec);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Element is visible now");
	}
	
	
	/**
	 * This method will make sure ElementToBeclickbale
	 * @param element
	 * @param timeOutInSeconds
	 */
	public void WaitForElementClickable(WebElement element, int timeOutInSeconds){
		log.info("Waiting for : " +element.toString() +  " for :" + timeOutInSeconds+ "seconds");
		WebDriverWait wait= new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Element is clickable now");
	}
	
	/**
	 * This method will make sure invisibility of WebElement
	 * @param element
	 * @param timeOutInSeconds
	 * @return
	 */
	public boolean waitForElementNotPresent(WebElement element, int timeOutInSeconds) {
		log.info("Waiting for :" + element.toString()+ " for :" + timeOutInSeconds+ "seconds");
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		boolean status = wait.until(ExpectedConditions.invisibilityOf(element));
		log.info("Element is invisible now");
		return status;		
	}
	
	/**
	 * This method will wait and switch to frame
	 * @param element
	 * @param timeOutInSeconds
	 */
	public void waitForFrameToBeAvailableAndSwitchToIt(WebElement element, int timeOutInSeconds) {
		log.info("Waiting for :" + element.toString()+ " for :" + timeOutInSeconds+ "seconds");
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		log.info("Frame is available and switched");
	}	
	
	
	/**
	 * This method will give us fluentWait object
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 * @return
	 */
	public Wait<WebDriver> getfluentWait(int timeOutInSeconds, int pollingEveryInMilliSec) {
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofMillis(pollingEveryInMilliSec)).ignoring(NoSuchElementException.class);
		return fwait;
	}
	
	/**
	 * 
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 * @return
	 */
	
	public WebElement waitForElement(WebElement element, int timeOutInSeconds, int pollingEveryInMilliSec)
	{
		Wait<WebDriver> fwait = getfluentWait(timeOutInSeconds, pollingEveryInMilliSec);
		fwait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	/**
	 * PageLoadWaiting
	 * @param timeout
	 * @param unit
	 */
	public void pageLoadTime(long timeout, TimeUnit unit) {
		this.driver = TestBase.driver;
		log.info("Waiting for page to load for : "+timeout+ "seconds");
		driver.manage().timeouts().pageLoadTimeout(timeout, unit);
		log.info("Page is loaded");
	}

}