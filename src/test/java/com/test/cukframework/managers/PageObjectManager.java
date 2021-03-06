package com.test.cukframework.managers;





import org.openqa.selenium.WebDriver;

import com.test.cukframework.pageobjects.AddtoWishlist;
import com.test.cukframework.pageobjects.CartPage;
import com.test.cukframework.pageobjects.CheckoutPage;
import com.test.cukframework.pageobjects.HomePage;
import com.test.cukframework.pageobjects.ProductListingPage;



public class PageObjectManager {

	private WebDriver driver;

	private ProductListingPage productListingPage;

	private CartPage cartPage;

	private HomePage homePage;

	private CheckoutPage checkoutPage;
	
	private AddtoWishlist AddtoWish;

	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	

	public ProductListingPage getProductListingPage() {

		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;

	}

	

	public CartPage getCartPage() {

		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

	}

	

	public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}
	
	public AddtoWishlist getAddtoWishlist() {

		return (AddtoWish == null) ? AddtoWish = new AddtoWishlist(driver) : AddtoWish;

	}
}