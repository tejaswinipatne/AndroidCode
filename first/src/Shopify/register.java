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

public class register {

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
		

		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		MobileElement m3= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Home']"));
		m3.click();

		
		MobileElement m4= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));
		m4.click();
		
		MobileElement m5= (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']"));
		m5.click();
				
		MobileElement m6= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
		m6.sendKeys("test");
		
		MobileElement m7= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
		m7.sendKeys("test@123");
		
		MobileElement m8= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']"));
		m8.sendKeys("demo");
		
		MobileElement m9= (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Last Name']"));
		m9.sendKeys("123");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(3000);
		MobileElement m10= (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='REGISTER']"));
		m10.click();
		
//				
//     	driver.scrollTo("test");
     	
     	
//	     Thread.sleep(7000);
//		MobileElement m3 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[text='Search Product']"));
//	     Thread.sleep(5000);
//		m3.sendKeys("Francisco");
//		System.out.println("test");
//		
//		
//		driver.swipe(639, 1052, 614, 1052, 2000);
				
	}

}
