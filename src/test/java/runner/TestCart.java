 package runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.setup.driver.pages.Login;
import com.setup.driver.pages.Cart;
import com.setup.driver.utils.Constants;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCart {
	
	private static WebDriver driver;
	private Cart cart = new Cart();
	private Login login = new Login();


	
	public TestCart() {
		driver = Hook.driver;
	
	} 
	@When("Navigate to dashboard page")
	public void navigate_to_dashboard_page() {
		driver.get(Constants.url);
		login.login("standard_user", "secret_sauce");
		login.clickBtn();
	}
	@And ("Add to cart with product name A to Z")
	public void choose_name_a_to_z(){
		Select select = new Select(cart.ddown);
		select.selectByValue("az");
		select.selectByIndex(0);
		cart.chooseproduct();
		cart.cart();
		cart.backto();
		
	
	}
	@And ("Add to cart with product name Z to A")
	public void choose_name_z_to_a() {
		Select select = new Select(cart.ddown);
		select.selectByValue("za");
		select.selectByIndex(1);
		cart.chooseproduct1();
		cart.cart1();
		cart.backto();
	}
   
    @And ("Add to cart with product price low to high")
    public void choose_product_price_high_to_low() {
    	Select select = new Select(cart.ddown);
		select.selectByValue("lohi");
		select.selectByIndex(2);
		cart.chooseproduct2();
		cart.cart2();
		cart.backto();
    }
    @Then ("Add to cart with product price high to low")
    public void low_to_high() {
    	Select select = new Select(cart.ddown);
		select.selectByValue("hilo");
		select.selectByIndex(3);
		cart.chooseproduct3();
		cart.cart3();
		cart.backto();
    }
   
}