package runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.setup.driver.pages.Login;
import com.setup.driver.pages.Cart;
import com.setup.driver.pages.Remove;
import com.setup.driver.utils.Constants;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRemove {
	
	private static WebDriver driver;
	private Cart cart = new Cart();
	private Login login = new Login();
	private Remove remove = new Remove();


	
	public TestRemove() {
		driver = Hook.driver;
	
	} 
	@When("Navigate to dashboard page with login")
	public void navigate_to_dashboard_page() {
		driver.get(Constants.url);
		login.login("standard_user", "secret_sauce");
		login.clickBtn();
	}
	@And ("Choose product")
	public void product() {
		cart.chooseproduct();
		cart.cart();
	}
	@Then ("Remove the product")
	public void remove_the_product() {
		remove.remove();
	}

}