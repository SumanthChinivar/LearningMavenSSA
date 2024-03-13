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



public class ClickOnShoppingCartLinkTest extends BaseClass{
	@Test
	public void clickOnShoppingCartLink() throws IOException {
		DataUtilityClass data=new DataUtilityClass();
		String loginPageLink = data.readingDataFromPropertyFile(shoppingCart, "loginPageLink");
		String userName = data.readingDataFromPropertyFile(shoppingCart, "userName");
		String password = data.readingDataFromPropertyFile(shoppingCart, "password");
		String shoppingCartLink=data.readingDataFromPropertyFile(shoppingCart, "shoppingCartLink");
		
		HomePage home = new HomePage(driver);
				
		//click on shopping cart link
		home.getShoppingCartLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), shoppingCartLink,"Shopping cart page is not opened");
		Reporter.log("Shopping cart page is opened",true);
	}
}
