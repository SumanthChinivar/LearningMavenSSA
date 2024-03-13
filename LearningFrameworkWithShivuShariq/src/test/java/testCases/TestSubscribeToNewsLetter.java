package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;
import com.utility.DataUtilityClass;

public class TestSubscribeToNewsLetter extends BaseClass {
	@Test
	public void subscribe() throws IOException {
		DataUtilityClass data=new DataUtilityClass();
		String loginPageLink = data.readingDataFromPropertyFile(subscribePath, "loginPageLink");
		String userName = data.readingDataFromPropertyFile(subscribePath, "userName");;
		String password = data.readingDataFromPropertyFile(subscribePath, "password");;
		String newsLetterEmail = data.readingDataFromPropertyFile(subscribePath, "newsLetterEmail");;
		String message=data.readingDataFromPropertyFile(subscribePath, "message");;
		HomePage home=new HomePage(driver);

		// entering email into newsletter text field
		home.getNewsLetterEmailTextField().sendKeys(newsLetterEmail);
		String actualNewsLetterEmail=home.getNewsLetterEmailTextField().getAttribute("value");
		softAssert.assertEquals(actualNewsLetterEmail, newsLetterEmail,"Data mismatch");
		Reporter.log("User entered correct email into email text field",true);
		home.getNewsLetterSubscribeButton().click();
		boolean actualResult=home.getNewsLetterMessage().isDisplayed();
		softAssert.assertEquals(actualResult, true,"Not subscribed to newsletter");
		Reporter.log("Subscribed to newsletter",true);
	}
}
