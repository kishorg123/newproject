package khantest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import khanacademy.khanhome;
import khanacademy.khanlogin;

public class khanacademytest {
	WebDriver driver;
	@BeforeClass
	public void browser() {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\User\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		//ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("--disable-notifications");
		driver = new FirefoxDriver();	//upcasting , interface			
	}
	@BeforeMethod
	public void site() throws InterruptedException {
		driver.get("https://www.khanacademy.org/login");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    khanlogin ipage = new khanlogin(driver);
	    ipage.uname();
	}
	
	
	@Test
	public void katest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		khanhome hpage = new khanhome(driver);
		hpage.hpbiolink();
		Thread.sleep(2000);
		hpage.hpnickname();
		Thread.sleep(2000);
		hpage.hpusername();
		Thread.sleep(2000);
		hpage.hpbio();
		Thread.sleep(2000);
		hpage.hpbiosubmit();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void siteclose() {
		
	}
	@AfterClass
	public void browserclose(){
		
	}

}
