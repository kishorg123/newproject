package ftest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook.facelogin;
import facebook.fhome;

public class facetest 
{
	WebDriver driver;
	facelogin flo;
	fhome fh;
	@Parameters("browser")
	
	@BeforeTest
	public void beforetest(String browserName)
	{
		System.out.println(browserName);
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		}
		if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			//ChromeOptions opt = new ChromeOptions();
			//opt.addArguments("--disable-notifications");
			driver = new FirefoxDriver();
		}
		
		
	}
	@BeforeClass
	public void flogin()
	{
		flo = new facelogin (driver);
		fh = new fhome(driver);
		
	}
	
	@BeforeMethod 
	public void face() throws IOException
	{
	
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		flo.enterun();
		flo.enterupass();
		flo.clickf();
		
	
	}
	@Test
	public void ftest()
	{
		System.out.println("test one");
		fh.home();
		//String url = driver.getCurrentUrl();
		//String title = driver.getTitle();
		//Assert.assertEquals(url, "https://www.facebook.com/");
		//Assert.assertEquals(title, "Facebook");
	}
	
	@AfterMethod
		public void logout() throws InterruptedException
		{
		Thread.sleep(1000);
		fh.prof();
		Thread.sleep(3000);
		fh.log();
		}
	@AfterClass
	public void close() {
		driver.close();
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
}