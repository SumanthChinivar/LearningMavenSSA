package com.base;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;
import com.utility.DataUtilityClass;
import com.utility.FrameworkConstants;


public class BaseClass implements FrameworkConstants {

	//Base class
	public WebDriver driver;
	public SoftAssert softAssert;
	WelcomePage welcome ;
	LoginPage login;

	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			// to launch empty browser--Upcasting
			driver = new ChromeDriver();
			Reporter.log("Browser is launched",true);
		} else if (browserName.equalsIgnoreCase("edge")) {
			// to launch empty browser--Upcasting
			 driver= new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			// to launch empty browser--Upcasting
			 driver= new FirefoxDriver();
		}
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
		softAssert=new SoftAssert();
	}

	@BeforeMethod
	public void login() throws IOException {
		welcome= new WelcomePage(driver);
		welcome.getLoginLink().click();

		DataUtilityClass data=new DataUtilityClass();
		String email=data.readingDataFromPropertyFile(loginPath, "email");
		String password=data.readingDataFromPropertyFile(loginPath, "password");
		
		login = new LoginPage(driver);
		login.getEmailTextField().sendKeys(email);
		login.getPasswordTextField().sendKeys(password);
		login.getLoginButton().click();
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		softAssert.assertAll();
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}
}
