package com.test.cukframework.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SerachAndSelectItemFromResult {
	
	WebDriver driver;
	
	public SerachAndSelectItemFromResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how= How.CSS, using="#noo-site > .noo-container-shop.noo-shop-wrap .noo-row  .products.noo-row .noo-product-item .noo-product-inner h3 a")
	List<WebElement> itemTilesInResultPage;
	
	
	
	public WebElement getElementWithTheExpectedText(String expectedText) {
		
		for (WebElement webElement : itemTilesInResultPage) {
			
			if(webElement.getText().contains(expectedText))
			{
				return webElement;
				
			}
		}
		return null;
		
	}
}
