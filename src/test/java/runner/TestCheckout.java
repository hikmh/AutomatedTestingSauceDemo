package runner;

import org.openqa.selenium.JavascriptExecutor;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Login;
import com.setup.driver.pages.Cart;
import com.setup.driver.pages.Checkout;
import com.setup.driver.pages.Remove;
import com.setup.driver.utils.Constants;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCheckout {
	
	private static WebDriver driver;
	private Login login = new Login();
	private Checkout checkout = new Checkout();
	private Cart cart = new Cart();
	private Remove remove = new Remove();

	
	public TestCheckout() {
		driver = Hook.driver;
	
	}
	@When ("Navigate to dashboard page to checkout")
	public void page() {
		driver.get(Constants.url);
		login.login("standard_user", "secret_sauce");
		login.clickBtn();
	}
	@And ("Choose product to checkout")
	public void choose() {
		cart.chooseproduct();
		cart.cart();
	}
	@And ("Click cart")
	public void click_cart() {
		checkout.keranjang();
	}
	@And ("Click checkout")
	public void click_checkout() {
		checkout.checkout();
	}
	@And ("Fill {string} as firstname {string} as last name {string} as code") 
	public void filldata(String first, String last, String code) {
		checkout.checkout(first,last,code);
	}
	@And ("Scroll down data")
	public void home() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	@And ("Click continue")
	public void selanjutnya() {
		checkout.selanjutnya();
	}
	@And ("Click Finish")
	public void finish() {
		checkout.finish();
	}
	@Then ("Appear {string}")
	public void popUp(String expect) {
		String actual = checkout.getMessage();
		assertTrue(actual.contains(expect));	
	}




}