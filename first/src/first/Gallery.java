package first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gallery {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
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
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Gallery']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='PHASE 7']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("android.widget.ImageView[contains@resource-id, 'galleryImages']")).click();

	}

}
