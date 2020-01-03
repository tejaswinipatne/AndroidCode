package TestBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testbase {

	protected static AndroidDriver<WebElement> driver;
	
	
	@Test
	public void open() {
		try {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 7);
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4DQ8C6I799999999");
		
		URL u= new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(u, dc);

		} catch (MalformedURLException e) {
			System.out.println("Cause is "+e.getCause());
			System.out.println("Message is "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	

	
	
	
	
}
	/*
	   protected AndroidDriver driver;
	    protected WebDriverWait wait;
	 
	    @BeforeTest
	    protected void createAppiumDriver() throws MalformedURLException, InterruptedException {
	 
	    final File classpathRoot = new File(System.getProperty("user.dir"));
	    final File appDir = new File(classpathRoot, "src/test/resources/apps/");
	    final File app = new File(appDir, "ApiDemos-debug.apk");
	 
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "");
	    caps.setCapability("platform", "ANDROID");
	    caps.setCapability("platformVersion", "5.0");
	    caps.setCapability("deviceName", "ANDROID");
	    caps.setCapability("app", app.getAbsolutePath());
	 
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	 
	    wait = new WebDriverWait(driver, 10);
	    }
	 
	    @AfterTest
	    public void afterTest(){
	 
	    //quit the driver
	    driver.quit();
	    }
}
*/