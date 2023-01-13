package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.setup.driver.driver.DriverSingleton;

public class Login {
	
	private WebDriver driver;
	
	public Login() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	private WebElement user;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement pw;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	private WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	private WebElement popUP;
	
	public void login(String username, String password) {
		this.user.sendKeys(username);
		this.pw.sendKeys(password);
	}

	
	public void clickBtn() {
		btnLogin.click();
	}
	
	public String getMessage() {
		return this.popUP.getText();
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