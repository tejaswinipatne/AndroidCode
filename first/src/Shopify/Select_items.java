package Shopify;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Select_items {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\APK\\Shopify_21Nov.apk");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);
		
		Thread.sleep(5000);
		MobileElement m = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@index,'0')]"));
		m.click();
		
		MobileElement m1 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@index,'1')]"));
		m1.click();
		
		Thread.sleep(3000);
		//driver.scrollTo("Sale");
		MobileElement m2 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView\r\n" + 
				""));
     	m2.click();

		Thread.sleep(10000);
		
		
		TouchAction t = new TouchAction(driver);
		t.tap(250,420).perform();
		
	
		Thread.sleep(10000);
//		
		driver.swipe(647, 1020, 650, 447, 1041);
		System.out.println("test");
		 
		Thread.sleep(5000);
	     MobileElement m3= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='44/XXL']"));
	     m3.click();
	     
	     driver.swipe(647, 1020, 650, 447, 1041);
	     MobileElement m4 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Regular Fit']"));
	     m4.click();
	     
	    
	     MobileElement m5 = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[@text='Half Sleeve']"));
	     m5.click();
	     
	    
	     MobileElement m6 = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[@text='Without Pocket']"));
	     m6.click();
	     
	     
	     MobileElement m7 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='ADD TO CART']"));
	     m7.click();
		
	//	driver.scrollTo("ADD TO CART");
		
	}

}
