package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	By contactinformaton_l = By.xpath("//div[@class='box-content']/p");
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void getloggeduserinformation(){
		  List<WebElement> contactInfo = driver.findElements(contactinformaton_l);
		  for (WebElement element : contactInfo) {
	          String text = element.getText();
	          System.out.println("userdetails: " + text);
	      }
	      }  
}
