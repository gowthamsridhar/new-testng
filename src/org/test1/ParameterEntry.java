package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEntry {
	
	@Parameters({"username","password"})
	@Test
	private void test1(@Optional("gow")String s1,@Optional("12345678")String s2) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\gow\\TestNg\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//hardassert (dont create obj because of this is static class)
	
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(driver.getTitle().contains("Facebook"));
	WebElement e1 = driver.findElement(By.id("email"));
	e1.sendKeys(s1);
	Assert.assertEquals("gow", e1.getAttribute("value"));
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys(s2);
	Assert.assertEquals("12345678", pass.getAttribute("value"));
	
	driver.findElement(By.id("login")).click();
	
	
	
	
	}
	

}
