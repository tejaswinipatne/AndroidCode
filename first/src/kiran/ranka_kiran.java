package kiran;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class ranka_kiran {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("AutomationName", "Appium");
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "BRB3Y18819007288");
		dc.setCapability("platformVersion", 9);
//
		dc.setCapability("appPackage", "com.example.rankadevelopers");
//		dc.setCapability("appActivity", "com.example.rankadevelopers.Main_Screen");
 	dc.setCapability("appActivity", "com.example.rankadevelopers.MainActivity");

		
//		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\app-debug.apk");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

		// First Next
		Thread.sleep(9000);
		
		
	//	("//android.widget.Button[@text='5']")
//		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
//		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();
//		
//		Thread.sleep(3000);
//
//		// Second Next
//		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
//		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();
//
//		// Third Next
//		driver.findElementByXPath("//android.widget.Button[@text='NEXT']").click();
//		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();
//		
//		Thread.sleep(6000);

		 driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'fab')]").click();
		Thread.sleep(7000);

		
		MobileElement e5 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_name')]"));
		e5.sendKeys("test");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_number')]")).sendKeys("78787878787");
		
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_email')]")).sendKeys("krbide@gmail.com");
		
		Thread.sleep(3000);


		driver.findElement(By.xpath("//android.widget.RadioButton[contains(@resource-id,'redio_yes')]")).click();

		Thread.sleep(3000);

		// Date By using class name and text property

		driver.findElement(By.xpath("//android.view.View[@text='31']")).click();

		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_date')]")).click();

		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@index='3']")).click();

		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_time')]")).click();
		
		Thread.sleep(3000);


		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]")).click();

		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_save')]")).click();
		
		
		driver.quit();

	}

}
