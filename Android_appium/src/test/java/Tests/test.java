package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import TestBase.Testbase;

public class test extends Testbase {
	
	@Test
	public void test1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("automated");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
   
	
	
	
	
	}
/*
	 protected AndroidDriver driver;
    @Test
    public void sampeTest(){
 
    //click on Accessibility link
    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility")));
    driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
 
    //click on 'Accessibility Node Querying' link
    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility Node Querying")));
    driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();
 
    //back
    driver.navigate().back();
 
    //back
    driver.navigate().back();
    }
    */
}
