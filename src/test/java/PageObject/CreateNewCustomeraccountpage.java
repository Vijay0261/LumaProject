package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewCustomeraccountpage {
	WebDriver driver;
	WebDriverWait wait;
	public CreateNewCustomeraccountpage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	By firstname_l = By.id("firstname");
	By lastname_l = By.id("lastname");
	By email_l = By.name("email");
	By password_l = By.id("password");
	By confirmpassword_l = By.name("password_confirmation");
	By createaccountutton_l = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
	
	 public void setpersonelinformation(String firstname,String lastname) {
		 WebElement firstname_e = wait.until(ExpectedConditions.elementToBeClickable(firstname_l));
		WebElement lastname_e = wait.until(ExpectedConditions.elementToBeClickable(lastname_l));
		firstname_e.sendKeys("vijay");
		lastname_e.sendKeys("ch");
	 }
	  public void setsignininformation(String emailId, String password) {
		  WebElement email_e = wait.until(ExpectedConditions.elementToBeClickable(email_l));
			WebElement password_e = wait.until(ExpectedConditions.elementToBeClickable(password_l));
			WebElement confirmpassword_e = wait.until(ExpectedConditions.elementToBeClickable(confirmpassword_l));
			email_e.sendKeys("vijaychintanippula@gmail.com");
			password_e.sendKeys("Vijay.261");
			confirmpassword_e.sendKeys("Vijay.261");
	  }
public void createLumaAccount(String firstname,String lastname,String emailId, String password) {
	setpersonelinformation(firstname, lastname);
	setsignininformation(emailId, password);
	WebElement button_e  = wait.until(ExpectedConditions.elementToBeClickable(createaccountutton_l));
	button_e.click();
	
}
}
