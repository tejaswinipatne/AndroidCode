package Shopify;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;


public class Add_to_cart_and_checkout {

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
	     MobileElement m3= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='42/L']"));
	     m3.click();
	     
	     driver.swipe(647, 1020, 650, 447, 1041);
	     MobileElement m4 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Regular Fit']"));
	     m4.click();
	     
	    
	     MobileElement m5 = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[@text='Half Sleeve']"));
	     m5.click();
	     
	    
	     MobileElement m6 = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[@text='Without Pocket']"));
	     m6.click();
	     
	     driver.swipe(647, 1020, 650, 447, 1041);
	     MobileElement m7 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@index,'2')]"));
	     m7.click();
	   
		
	     MobileElement m8 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@index,'11')]"));
	     m8.click();
		
	     
	     MobileElement m9 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='VIEW CART']"));
	     m9.click();
	     
	     MobileElement m10= (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='CHECKOUT']"));
	     m10.click();
	     
	     Thread.sleep(5000);
	    
	     MobileElement m11 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_email_or_phone')]"));
	     
	     m11.sendKeys("14141");
	     
	     driver.pressKeyCode(AndroidKeyCode.BACK);
	     MobileElement m12 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_first_name')]"));
	     m12.sendKeys("test");
	     
	     driver.pressKeyCode(AndroidKeyCode.BACK);
	     MobileElement m13= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_last_name')]"));
	     m13.sendKeys("demo");
	     
	     driver.pressKeyCode(AndroidKeyCode.BACK);
	     
	     
	     MobileElement m16= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_city')]"));
	     m16.sendKeys("pune");
	     
//	     MobileElement m14= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_address1')]"));
//	     m14.sendKeys("Pune, Maharashtra, India");
//	     m14.sendKeys(Keys.ENTER);
//	     
//	     driver.pressKeyCode(AndroidKeyCode.BACK);
	     
//	     MobileElement m15= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_address2')]"));
//	     m15.sendKeys("balewadi");
	   
	     
//	     driver.pressKeyCode(AndroidKeyCode.BACK);
//
//	     MobileElement m17= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'checkout_shipping_address_province')]"));
//	     m17.click();
//	     
//	     MobileElement m18= (MobileElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Assam']"));
//	     m18.click();
//	     
//	     MobileElement m19= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='CHECKOUT']"));
//	     m10.click();
//	     
//	     MobileElement m20= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='CHECKOUT']"));
//	     m20.click();
	     
	     
		
	}

}
