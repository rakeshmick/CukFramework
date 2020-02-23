package com.test.cukframework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoWishlist {
	
	WebDriver driver;
	
	public AddtoWishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'pink drop shoulder oversized t shirt')]") 
	WebElement prd_check;
	
	@FindBy(how = How.CSS, using ="select#pa_color") 
	WebElement colorselector;
	
	@FindBy(how = How.CSS, using ="select#pa_size") 
	WebElement sizeselector;
	
	@FindBy(how = How.CSS, using ="i.icon_plus") 
	WebElement quantityselector;
	
	@FindBy(how = How.CSS,using ="a.add_to_wishlist single_add_to_wishlist")
	WebElement wishlisticon;
	
	
	
	
	
	public void clickonproduct()
	{

		prd_check.click();
	}
	
	public void Selectcolor(String color) {
		Select sel = new Select(colorselector);
		sel.selectByValue(color);
	}

	public void Selectsize(String size) {
		Select sel = new Select(sizeselector);
		sel.selectByValue(size);
	}
	
	public void selectquantity()
	{
		quantityselector.click();
	}
	
	public void AddtoWishmylist()
	
	{
		wishlisticon.click();
	}
}
