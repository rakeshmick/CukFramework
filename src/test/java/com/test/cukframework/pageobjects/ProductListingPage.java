package com.test.cukframework.pageobjects;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	
	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "button.single_add_to_cart_button") 
	private WebElement btn_AddToCart;
	
	@FindAll(@FindBy(how = How.CSS, using = ".noo-product-item .noo-product-inner h3 a"))
	private List<WebElement> prd_List;	
	
	@FindBy(how = How.CSS, using ="select#pa_color") 
	WebElement colorselector;
	
	@FindBy(how = How.CSS, using ="select#pa_size") 
	WebElement sizeselector;
	
	public void clickOn_AddToCart() {
		Select color = new Select(colorselector);
		color.selectByValue("white");
		Select size = new Select(sizeselector);
		size.selectByValue("medium");
		btn_AddToCart.click();
	}
	
	public void select_Product(int productNumber) {
		prd_List.get(productNumber).click();
	}

}
