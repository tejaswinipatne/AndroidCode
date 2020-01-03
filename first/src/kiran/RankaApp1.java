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

public class RankaApp1 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("AutomationName", "Appium");
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "4DQ8C6I799999999");
		dc.setCapability("platformVersion", 7);

//		dc.setCapability("appPackage", "com.example.rankadevelopers");
//		dc.setCapability("appActivity", "com.example.rankadevelopers.Main_Screen");
//		dc.setCapability("appActivity", "com.example.rankadevelopers.MainActivity");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\app-debug.apk");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

		Thread.sleep(8000);
		// First Next

//		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();
		MobileElement e = (MobileElement) driver
				.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_next')]"));
		e.click();

		Thread.sleep(3000);

		// Second Next

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();

		Thread.sleep(3000);
		// Third Next

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_next')]").click();

		Thread.sleep(3000);

		driver.findElementByXPath("//android.widget.ImageButton[contains(@resource-id,'fab')]").click();
		Thread.sleep(3000);

		// Appointment page

		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'edt_name')]").sendKeys("tejas");
//		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'edt_number')]")
				.sendKeys("78787878787");
//		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'edt_email')]")
				.sendKeys("krbide@gmal.com");
		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.findElementByXPath("//android.widget.RadioButton[contains(@resource-id,'redio_yes')]").click();

		Thread.sleep(3000);

		// Date By using class name and text property

		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'edt_date')]").click();

		driver.findElementByXPath("//android.view.View[@text='31']").click();

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'button1')]").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'edt_time')]").click();

//		driver.findElementByXPath("//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@index='3']").click();

		Thread.sleep(3000);

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'button1')]").click();

		driver.scrollTo("SAVE");

		driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'btn_save')]").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);

		// Open Navigator

		MobileElement tg = (MobileElement) driver
				.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']"));
		tg.click();

		// Click on Highlight

		MobileElement high = (MobileElement) driver
				.findElement(By.xpath("//android.widget.CheckedTextView[@text='Highlight']"));
		high.click();

		// Location Highlight

		MobileElement loc = (MobileElement) driver
				.findElement(By.xpath("//android.widget.TextView[@text='LOCATION HIGHLIGHTS']"));
		loc.click();

		driver.pressKeyCode(AndroidKeyCode.BACK);

		// Open navigator again

		Thread.sleep(3000);
		tg.click();

		// Open Gallery

		MobileElement gl = (MobileElement) driver
				.findElement(By.xpath("//android.widget.CheckedTextView[@text='Gallery']"));
		gl.click();
		Thread.sleep(3000);

//		driver.scrollTo("");

		// Click on Phase one

		MobileElement ph1 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='PHASE1-6']"));
		ph1.click();
		Thread.sleep(3000);

		// Select Image
		MobileElement p1 = (MobileElement) driver
				.findElement(By.xpath("android.widget.ImageView[contains(@resource-id,'galleryImages']"));
		p1.click();

		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.navigate().forward();

		driver.quit();

	}

}
