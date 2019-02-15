package com.automation.mobielshop.kpn.screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils; 


import com.automation.mobielshop.kpn.testBase.TestBase;

public class Screenshot extends TestBase {


@Test
/*public void tearDown(ITestResult result)
{
if(ITestResult.FAILURE==result.getStatus())
{
try 
{
// Create refernce of TakesScreenshot
TakesScreenshot ts=(TakesScreenshot)driver;

// Call method to capture screenshot
File src=ts.getScreenshotAs(OutputType.FILE);

// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
FileUtils.copyFile(src, File("C:\\Users\\sowmyak\\eclipse-workspace\\com.automation.kpn\\test-output\\Failed testcase screenshots\\Failedtestcases")+result.getName()+".png"));

System.out.println("Screenshot taken");
} 
catch (Exception e)
{

System.out.println("Exception while taking screenshot "+e.getMessage());
} 
*/



public  void captureScreenShot(WebDriver driver){
 
  // Take screenshot and store as a file format
  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
  // now copy the  screenshot to desired location using copyFile method
 
 FileUtils.copyFile(src, new File("C:\\Users\\sowmyak\\eclipse-workspace\\com.automation.kpn\\test-output\\Failed testcase screenshots\\Failedtestcases"+System.currentTimeMillis()+".png"));
       }
 catch (IOException e)
 
{
 
System.out.println(e.getMessage());
 
    }
 
}
}



