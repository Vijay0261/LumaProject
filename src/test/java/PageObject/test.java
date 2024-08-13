package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static WebDriver driver;
	public static void cartpageview() throws InterruptedException {
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	LoginPage Lp = new LoginPage(driver);
	Lp.LogintoLuma("vijaychintanippula@gmail.com", "welcome123!");
	Thread.sleep(4000);
	Homepage Hp = new Homepage(driver);
	Hp.getloggeduserinformation();
	Thread.sleep(4000);
	Cartpage Cp = new Cartpage(driver);
	Cp.viewcartpage();
	Cp.opencartpage();
}
	 public static void main(String[] args) throws InterruptedException {
		cartpageview();
	}
}

 

