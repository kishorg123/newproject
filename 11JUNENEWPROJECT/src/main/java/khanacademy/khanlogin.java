package khanacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class khanlogin {
	@FindBy (xpath = "(//input[@class='_1azps1NaN'])[1]")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement submit;
	
	public khanlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void uname() throws InterruptedException {
		username.sendKeys("deepakkadam1983@gmail.com");
	    Thread.sleep(3000);
	    password.sendKeys("Abc@1234");
	    Thread.sleep(2000);
	    submit.click();
	}

}
