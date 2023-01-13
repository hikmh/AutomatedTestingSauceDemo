package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Logout {
	
	private WebDriver driver;
	
	public Logout() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	public WebElement menu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	public WebElement logout;
	
	public void menu() {
		delay(2);
		menu.click();
	}
	public void logout() {
		delay(2);
		logout.click();
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
	