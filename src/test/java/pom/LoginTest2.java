package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch chrome browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);

		// create object of login page
		LoginPage2 lp = new LoginPage2(driver);

		// launch browser
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		lp.enterusername("standard_user");
		lp.enterpassword("secret_sauce");
		lp.clickloginbutton();
		//
	}
	}


