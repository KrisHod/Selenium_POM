package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement signInButton(WebDriver driver) {
		return driver.findElement(By.id("signin_button"));
	}

}
