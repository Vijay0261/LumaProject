package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cartpage {
	WebDriver driver;
	public Cartpage(WebDriver driver) {
		this.driver = driver;
		
	}
	By cartbutoon_l = By.xpath("//a[@class=\"action showcart\"]");
	By toopencartpage_l = By.xpath("//div[@class='secondary']//a[@class='action viewcart']");
	
	public void viewcartpage() {
		WebElement CartButton= driver.findElement(cartbutoon_l);
		CartButton.click();
	}
	public void opencartpage() {
		WebElement OpenCartpage = driver.findElement(toopencartpage_l);
		OpenCartpage.click();
	}

	
}
