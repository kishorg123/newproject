package fliptest;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkart.flogin;
import flipkart.kart;

public class fltest {
	WebDriver driver;
	Date d;
	kart ka;
	FileInputStream f1;
	@BeforeClass 
	public void beforeclass()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

	}
	@BeforeMethod 
	public void beforemethod() throws IOException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		flogin flog = new flogin (driver);
		flog.fusername();
		flog.fpassword();
		flog.floginclick();
		
		
	}
	@Test
	public  void test() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		
		 ka = new kart(driver);
		//ka.cart1();
		//ka.myord();
		//ka.myord();
		ka.search1();
		ka.searchbutt();
		//Utility.capturescreenshot(driver, d);
		//Utility.getdatafromexcel( f1,1,1);
		
	}
	@AfterMethod 
	public void aftermethod() throws InterruptedException
	{
		
		Thread.sleep(1000);
		ka.myac(driver);
	
	
	
	}
	@AfterClass
	public void afterclass() throws InterruptedException
	{
		//Thread.sleep(2000);
		//driver.close();
	}
}
