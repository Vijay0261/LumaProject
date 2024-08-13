package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Picocontainer;
import io.cucumber.java.en.When;

public class Navigatetomensjackshirtpagestepdef {
	
Picocontainer picocontainer;
	
	public Navigatetomensjackshirtpagestepdef(Picocontainer picocontainer) {
		this.picocontainer=picocontainer;
	}
	public By menspage_l = By.xpath("//span[text()='Men']");
	public By jackets_l = By.xpath("//a[text()='Jackets']");
	@When("the user navigates to the Men jackshirtpage")
	public void the_user_navigates_to_the_men_jackshirtpage() {
		picocontainer.driver.findElement(menspage_l).click();
		picocontainer. driver.findElement(jackets_l).click();
	}

}
