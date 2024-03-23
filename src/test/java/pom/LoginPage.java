package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without page factory
public class LoginPage {

	WebDriver driver;

	// constructor
	LoginPage(WebDriver d) {
		driver = d;
	}

	// Locate webelements
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By submit = By.xpath("//input[@id='login-button']");

	public void enterusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickloginbutton() {
		driver.findElement(submit).click();

	}
}
