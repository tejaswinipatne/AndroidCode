package Shopify;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\APK\\Shopify_21Nov.apk");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);
		
		Thread.sleep(4000);
		
		MobileElement m4= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));
		m4.click();
		

		MobileElement m5= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='LOG IN']"));
		m5.click();
		
		MobileElement m1= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
		m1.sendKeys("shubham@gmail.com");
		
		MobileElement m2= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
		m2.sendKeys("12345");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(3000);
		MobileElement m3= (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='LOGIN']"));
		m3.click();
		
		Thread.sleep(5000);
		m4.click();
		
		Thread.sleep(4000);
		MobileElement m6= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Address']"));
		m6.click();
		
		Thread.sleep(3000);
		MobileElement m7= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='+ ADD NEW ADDRESS']"));
		m7.click();
		
		
	}

}
