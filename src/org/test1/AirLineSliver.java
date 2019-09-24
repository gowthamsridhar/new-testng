package org.test1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AirLineSliver {
	static WebDriver driver;
	@BeforeClass
	 private void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-11\\Desktop\\gow\\TestNg\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.silverairways.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws  Throwable {
	
	
	WebElement e1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	e1.click();
	WebElement from = driver.findElement(By.xpath("(//fieldset[@class='booking_citysearch'])[1]"));
	from.click();
	WebElement cli = driver.findElement(By.xpath("(//a[@class='Silver'])[3]"));
	cli.click();
	driver.findElement(By.xpath("(//fieldset[@class='booking_citysearch'])[2]")).click();
	driver.findElement(By.xpath("(//a[@class='Silver'])[7]")).click();
	Robot r = new Robot();

	WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	date.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	date.sendKeys("11/25/2019");

	driver.findElement(By.xpath("(//a[@class='button'])[2]")).click();
//page2
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@type='button'])[30]")).click();
//page3
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
//page4
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='Select-control'])[2]")).click();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gowtham");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sri");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("dhar");
	WebElement da = driver.findElement(By.xpath("(//div[@class='Select-control'])[4]"));
	da.click();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement mo = driver.findElement(By.xpath("(//div[@class='Select-control'])[5]"));
	mo.click();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement yr = driver.findElement(By.xpath("(//div[@class='Select-control'])[6]"));
	yr.click();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement ty1 = driver.findElement(By.xpath("(//div[@class='Select-control'])[7]"));
	ty1.click();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement phno = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
	phno.sendKeys("54546545");
	WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	email.sendKeys("gow@gmail.com");
	WebElement email1 = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
	email1.sendKeys("gow@gmail.com");

	driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
//page5
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@type='button'])[17]")).click();

//page6
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@type='button'])[28]")).click();
//page7
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='seat'])[25]")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.id("dxp-page-navigation-continue-button")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//span[text()='Continue to Payment'])[2]")).click();

}

}
