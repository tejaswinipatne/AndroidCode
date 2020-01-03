package Shopify;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class ShopeeMenus {

	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities  dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\APK\\Shopify_21Nov.apk");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"APPIUM");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);   
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "BRB3Y18819007288");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(u,dc);
	
		Thread.sleep(3000);
		//Click on Menu Toggle
		MobileElement m1=(MobileElement)driver.findElement(By.xpath("	//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		m1.click();
//		
//		driver.navigate().back();
		Thread.sleep(4000);
//		 
//		
//		//Click on  Account
//		
//		MobileElement m3=(MobileElement)driver.findElement(By.xpath("android.widget.TextView[@text='Account']"));
//		m3.click();
//		
//
//		//About US
//		
//		MobileElement m2=(MobileElement)driver.findElement(By.xpath("android.widget.TextView[@text='About Us']"));
//		m2.click();
//		
//		
		
		
		//Click on Contact US
		MobileElement m2Element=(MobileElement)driver.findElement(By.xpath("//android.widget.ImageView[@elementId='2']"));
		MobileElement m4=(MobileElement)driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView\r\n" + 
				""));
		m4.click();
		Thread.sleep(3000);
		
		m2Element.click();
		
		
	}
}
