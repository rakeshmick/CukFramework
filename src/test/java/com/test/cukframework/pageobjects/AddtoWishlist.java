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
	WebElement color;
	
	
	
	//Select sel = new Select(driver.findElement(By.cssSelector("select#pa_color")));
	
	
	
	public void clickonproduct()
	{
		prd_check.click();
	}
	
	public void Selectcolor() {
		Select sel = new Select(color);
		color.selectByValue("pink");
	}

}
