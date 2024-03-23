package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class LoginPage2 {

	WebDriver driver;

	// constructor
	LoginPage2(WebDriver d) {
		driver = d;
		//this method 	will create web elements
		PageFactory.initElements(driver, this);
	}

	// identify web elements
	// identify user name
	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement loginbtn;

	public void enterusername(String uname) {
		username.sendKeys(uname);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickloginbutton() {
		loginbtn.click();

	}
}
