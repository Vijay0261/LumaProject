package POM;

import java.time.Duration;
import java.lang.*;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	WebDriver driver;
	WebDriverWait wait;
	
	public By login_l = By.id("login2");
	public By Email_l = By.id("loginusername");
	public By Password_l = By.id("loginpassword");
	public static  By signUpButton_L = By.xpath("//button[contains(text(),'Log in')]");
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
 public void singintodemoblaze() throws InterruptedException {
	 Actions act = new Actions(driver);
	 WebElement Signin_e = driver.findElement(login_l);
	 Signin_e.click();
	 WebElement email_e =driver.findElement(Email_l);
	 WebElement password_e = driver.findElement(Password_l);
	 Thread.sleep(2000);
	 email_e.sendKeys("vijaychintanippula@gmail.com");
	 Thread.sleep(2000);
	  password_e.sendKeys("Vijay.261");
	  WebElement signupbutton =wait.until(ExpectedConditions.visibilityOfElementLocated(signUpButton_L));
	  signupbutton.click();
 }
	
	 public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.demoblaze.com/"); 
	  Loginpage lp = new Loginpage(driver); 
	  lp.singintodemoblaze();
	  
	  
	 }  
	 
}