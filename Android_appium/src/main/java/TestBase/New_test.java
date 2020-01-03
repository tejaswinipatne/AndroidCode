package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_test {

	public static WebDriver driver;
	public static Properties prop;
	
public New_test() {
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void initial() {
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium 64 bit\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));
	}
}
