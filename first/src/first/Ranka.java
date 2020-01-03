package first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Ranka {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1714");
		dc.setCapability(MobileCapabilityType.UDID, "4DQ8C6I799999999");
//		dc.setCapability(MobileCapabilityType.UDID, "BRB3Y18819007288");
		
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Trigen\\Downloads\\app-debug.apk");
		
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);
		
		Thread.sleep(9000);
		MobileElement e = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_next')]"));
		e.click();
		
		MobileElement e1 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_next')]"));
		e1.click();
		
		MobileElement e2 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_next')]"));
		e2.click();
		Thread.sleep(6000);

		
		MobileElement e4 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'fab')]"));
		e4.click();
	
		
		MobileElement e5 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_name')]"));
		e5.sendKeys("test");
		
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		
		MobileElement e6 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_number')]"));
		e6.sendKeys("123");
		
		
		MobileElement e7 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_email')]"));
		e7.sendKeys("demo");
		 

		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(4000);
		
		//
		//redio_yes
		MobileElement e8 = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[contains(@resource-id,'redio_yes')]"));
		e8.click();
		
		MobileElement e9 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_date')]"));
		e9.click();
		
//		
//		
		MobileElement e11 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
		e11.click();
		
		MobileElement e10 = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_time')]"));
		e10.click();
		
		MobileElement e13 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
		e13.click();
		
		Thread.sleep(3000);
		driver.scrollTo("SAVE");
//		MobileElement e12 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_save')]"));
//		e12.click();
//		
		
		
		
		

		
		///android.widget.Button/button1/OK
		
	}

}
