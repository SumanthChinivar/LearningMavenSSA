package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	
	@FindBy(linkText = "$25 Virtual Gift Card")
	private WebElement virtualGiftCardLink;

	public WebElement getVirtualGiftCardLink() {
		return virtualGiftCardLink;
	}
	
	@FindBy(id="newsletter-email")
	private WebElement newsLetterEmailTextField;
	
	@FindBy(id="newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;

	public WebElement getNewsLetterEmailTextField() {
		return newsLetterEmailTextField;
	}

	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}
	
	@FindBy(linkText = "komalgupta121@gmail.com")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(xpath="//div[contains(text(),'Thank you for signing up!')]")
	private WebElement newsLetterMessage;

	public WebElement getNewsLetterMessage() {
		return newsLetterMessage;
		
	}
}
