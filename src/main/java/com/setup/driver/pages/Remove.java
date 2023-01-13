package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Remove {
	
	private WebDriver driver;
	
	public Remove() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div[2]/button")
	public WebElement delete;
	
	public void remove() {
		delay(2);
		delete.click();
	}
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}