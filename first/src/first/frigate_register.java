package first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class frigate_register {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");

		//   BRB3Y18819007288
	    dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\APK\\Frigate18Feb.apk");

		
//		  dc.setCapability("appPackage", "com.frigateindia");
//		  dc.setCapability("appActivity", "com.frigateindia.activities.LoginActivity");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);

		TouchAction t = new TouchAction(driver);
		t.press(561, 625).moveTo(128, 653).release().perform();

		
		Thread.sleep(5000);
		
		MobileElement e = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'txtRegister')]"));
		e.click();

		Thread.sleep(4000);
		
		MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_no')]"));
		e1.sendKeys("321456");

		MobileElement e2 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_register_email')]"));
		e2.sendKeys("test");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(4000);
		MobileElement e3 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_register_password')]"));
		e3.sendKeys("demo123");
		Thread.sleep(4000);

		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		MobileElement e4 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_register_fullname')]"));
		e4.sendKeys("tejaswini");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(4000);
		
		MobileElement e5 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_register_firmname')]"));
		e5.sendKeys("trigen");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);
		
		MobileElement e6 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_city')]"));
		e6.sendKeys("pune");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'bttn_regiter')]").click();
	}
}