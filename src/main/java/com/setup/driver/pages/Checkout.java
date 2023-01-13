package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Checkout {
	
	private WebDriver driver;
	
	public Checkout() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	public WebElement keranjang;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	public WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	public WebElement first;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	public WebElement last;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	public WebElement code;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	public WebElement selanjutnya;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	public WebElement finish;
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	public WebElement popUP;
	
	public void keranjang() {
		keranjang.click();
	}
	
	public void checkout() {
		checkout.click();
	}


	public void checkout(String first, String last, String code) {
		this.first.sendKeys(first);
		this.last.sendKeys(last);
		this.code.sendKeys(code);
		
	}
	public void selanjutnya() {
		selanjutnya.click();
	}

	public void home() {
		System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");

		   driver.navigate().to("https://demoblaze.com/index.html"); // Specify the Website URL

		   //to perform scroll on an application using Selenium
	}
	
	public void finish() {
		finish.click();
	}
	public String getMessage() {
		return this.popUP.getText();
	}
}