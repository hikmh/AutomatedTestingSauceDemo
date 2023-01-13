package com.setup.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.setup.driver.driver.DriverSingleton;

public class Cart {
	
	private WebDriver driver;
	
	public Cart() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
	public WebElement ddown;
	
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	public WebElement choose;
	
	@FindBy(xpath="//*[@id=\"item_3_title_link\"]/div")
	public WebElement choose1;
	
	@FindBy(xpath="//*[@id=\"item_2_title_link\"]/div")
	public WebElement choose2;
	
	@FindBy(xpath="//*[@id=\"item_5_title_link\"]/div")
	public WebElement choose3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	public WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	public WebElement addtocart1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	public WebElement addtocart2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	public WebElement addtocart3;
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	public WebElement back;
	
	
	public void chooseproduct() {
		delay(2);
		choose.click();
	}
	public void chooseproduct1() {
		choose1.click();
	}
	public void chooseproduct2() {
		choose2.click();
	}
	public void chooseproduct3() {
		choose3.click();
	}
	
	public void cart() {
		delay(2);
		addtocart.click();
	}
	public void cart1() {
		delay(2);
		addtocart1.click();
	}
	public void cart2() {
		delay(2);
		addtocart2.click();
	}
		public void cart3() {
			delay(2);
			addtocart3.click();
	}
	
	public void backto() {
		back.click();
		delay(3);
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