package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.home;
import zerodha.login;
import zerodha.pin;

public class testing {
	home h;
	WebDriver driver;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		//SoftAssert soft = new SoftAssert();
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		login log = new login (driver);
		log.enterpass();
		log.enteruname();
		log.lclick();
		
		pin pin = new pin(driver);
		Thread.sleep(3000);
		pin.enterupin();
		pin.continue1();
		//soft.assertAll();
		
	}
	@Test
	public void test()
	{
		System.out.println("test is passed");
		//h.hold();
		
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		 h = new home(driver);
		Thread.sleep(2000);
		h.hold();
		h.userprofile();
		h.logout();
		h.user();
		
		}
}
