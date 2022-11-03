package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kart {
 WebDriver driver;
//	@FindBy (xpath="//a[@class='_3SkBxJ']")
//	private WebElement cart;
//	@FindBy (xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]")
//	private WebElement home;
	@FindBy (xpath="//input[@class='_3704LK']")
	private WebElement search;
	@FindBy (xpath="//button[@class='L0Z3Pu']")
	private WebElement searchbutton;
	@FindBy (xpath="//div[@class='exehdJ']")
	private WebElement myaccount;
	@FindBy (xpath="(//div[@class='_3vhnxf'])[9]")
	private WebElement logout;
	
	
	

 public kart(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
// public void cart1()
// {
//	 cart.click();
// }
// 
// public void myord()
// {
//	 home.click();
// }
 public void search1()
 {
	 search.sendKeys("boat airdopes");
	 
 }
 public void searchbutt()
 {
	 searchbutton.click();
	 
 }
 public void myac(WebDriver driver)
 {
 Actions act = new Actions( driver );
 act.moveToElement(myaccount).build().perform();
act.moveToElement(logout).click().perform();

	
 }

}