package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
	static WebDriver driver;
	
	public By email_l = By.id("email");
	public By password_l = By.id("pass");
	public By signinbutton_l = By.id("send2");
	
	public By Createaccount_l = By.xpath("//div[@class=\"panel wrapper\"]//a[contains(text(),'Create an Account')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void LogintoLuma(String uname , String password) {
		WebElement email = driver.findElement(email_l);
		WebElement password1 = driver.findElement(password_l);
		WebElement signinbutton = driver.findElement(signinbutton_l);
		
		email.sendKeys(uname);
		password1.sendKeys(password);
		signinbutton.click();
	    
	}
	
	public void NavigatetoCreateaccountpage() {
		 WebElement createaccount = driver.findElement(Createaccount_l);
		 createaccount.click();
		
	}
	
}

