package StepDefinations;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Picocontainer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageStepdef {
	Picocontainer picocontainer;
	
	public LoginpageStepdef(Picocontainer picocontainer) {
		this.picocontainer=picocontainer;
	}

	public By email_l = By.id("email");
	public By password_l = By.id("pass");
	public By signinbutton_l = By.id("send2");
	
	@Given("the user is on the Luma login page to login with valid details {string} and {string}")
	public void the_user_is_on_the_luma_login_page_to_login_with_valid_details_and(String uname, String password) {
		picocontainer.driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		picocontainer.driver.manage().window().maximize();
		WebElement email = picocontainer.driver.findElement(email_l);
		WebElement password1 = picocontainer.driver.findElement(password_l);
		WebElement signinbutton = picocontainer.driver.findElement(signinbutton_l);
		
		email.sendKeys(uname);
		password1.sendKeys(password);
		signinbutton.click();
	    
	}
	

}
