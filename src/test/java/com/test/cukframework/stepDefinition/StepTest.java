package com.test.cukframework.stepDefinition;

import org.openqa.selenium.WebDriver;
import com.test.cukframework.managers.WebDriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.cukframework.dataProvider.ConfigFileReader;
import com.test.cukframework.managers.FileReaderManager;
import com.test.cukframework.managers.PageObjectManager;


import com.test.cukframework.pageobjects.AddtoWishlist;
import io.cucumber.java.en.And;

public class StepTest {

WebDriver driver;
AddtoWishlist AddtoWish;
WebDriverManager webDriverManager;
PageObjectManager pageObjectManager;	


@And ("^user clicks on a product$")
public void SearchforProduct()

{
	webDriverManager = new WebDriverManager();
	driver = webDriverManager.getDriver();
	pageObjectManager = new PageObjectManager(driver);
	AddtoWish = pageObjectManager.getAddtoWishlist();
	
	AddtoWish.clickonproduct();
}

@And ("^user selects color \"([^\"]*)\"$")
public void selectPink(String color)
{
	
	AddtoWish.Selectcolor(color);
}

@And ("^user selects size \"([^\"]*)\"$")
public void selectsizerequired(String size) {
	AddtoWish.Selectsize(size);
}

@And("^user selects quantity$")

public void selectquantityrequired()
{
	AddtoWish.selectquantity();
}
@And("^user creates a wishlist$")
public void createmywishlist()
{
	AddtoWish.AddtoWishmylist();
}
}
