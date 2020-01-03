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

public class frigate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");

		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\Frigate18Feb.apk");

		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);

		TouchAction t = new TouchAction(driver);
		t.press(561, 625).moveTo(128, 653).release().perform();

		
		Thread.sleep(12000);
		
		MobileElement e = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_username')]"));
		e.sendKeys("123");
//
		MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_password')]"));
		e1.sendKeys("321456");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_login')]").click();
	}
}