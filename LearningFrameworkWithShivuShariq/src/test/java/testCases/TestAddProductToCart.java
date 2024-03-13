package testCases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.objectRepository.HomePage;
import com.objectRepository.ProductDetailsPage;



public class TestAddProductToCart extends BaseClass {
	@Test
	public void addProductToCart() {
		
		HomePage home=new HomePage(driver);
		home.getVirtualGiftCardLink().click();
		
		ProductDetailsPage product=new ProductDetailsPage(driver);
		product.getRecipientNameTextField().sendKeys("L R Aditya");
		product.getRecipientEmailTextField().sendKeys("pr@gmail.com");
		product.getAddToCartButton().click();
		
		product.getShoppingCartLink().click();
		
	}
}
