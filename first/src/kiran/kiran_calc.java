package kiran;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class kiran_calc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("AutomationName", "Appium");
		dc.setCapability("deviceName", "4DQ8C6I799999999");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", 7);
//		dc.setCapability("app",app.getAbsolutePath());	
		dc.setCapability("appPackage","com.android.bbkcalculator");
		dc.setCapability("appActivity", "com.android.bbkcalculator.Calculator");	
		URL u= new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,dc);
		
		driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'digit5')]").click();
		
		driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'plus')]").click();
		
        driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'digit8')]").click();
        
        
		driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'equal')]").click();
		
		
//		MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'digit3')]"));
//        e1.click();
//        
//        driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'equal')]").click();
		
//		MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'digit3')]"));
//        e1.click();
        
        driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'equal')]").click();
        
		driver.quit();

	}

}
