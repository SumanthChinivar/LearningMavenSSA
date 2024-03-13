package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	public ProductDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="giftcard_2_RecipientName")
	private WebElement recipientNameTextField;
	
	@FindBy(id="giftcard_2_RecipientEmail")
	private WebElement recipientEmailTextField;
	
	@FindBy(id="add-to-cart-button-2")
	private WebElement addToCartButton;

	public WebElement getRecipientNameTextField() {
		return recipientNameTextField;
	}

	public WebElement getRecipientEmailTextField() {
		return recipientEmailTextField;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	@FindBy(id="add-to-wishlist-button-2")
	private WebElement addToWishListButton;

	public WebElement getAddToWishListButton() {
		return addToWishListButton;
	}
	
	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	private WebElement message;

	public WebElement getMessage() {
		return message;
	}
}
