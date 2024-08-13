package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Picocontainer;
import io.cucumber.java.en.When;

public class Selectitemsteps {
Picocontainer picocontainer;
	
	public Selectitemsteps(Picocontainer picocontainer) {
		this.picocontainer=picocontainer;
	}
	
	public By size_l = By.xpath("//div[@class='swatch-opt-382']//div[@option-label='M']");
	
	public By getsizelocator(String Size) {
		return By.xpath("//div[@class='swatch-opt-382']//div[@option-label="+Size +"]");
	}
	public By getcolourlocator(String Colour) {
		return By.xpath("//div[@class='swatch-opt-382']//div[@option-label="+Colour +"]");
	}
	@When("the user selects a product with {string} and {string}")
	public void the_user_selects_a_product_with_and(String size, String colour) {
		WebElement Size_e =picocontainer.driver.findElement(getsizelocator(size));
		WebElement colour_e =picocontainer.driver.findElement(getsizelocator(colour)); 
		Size_e.click();
		colour_e.click();
	}

}
