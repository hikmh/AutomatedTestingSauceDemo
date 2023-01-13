package runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Login;
import com.setup.driver.utils.Constants;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private Login login = new Login();


	
	public TestLogin() {
		driver = Hook.driver;
	
	}
	
	@When("navigate to login page saucedemo")
	public void navigate() {
		driver.get(Constants.url);
		
	}
	@And("enter input {string} as username and {string} as password")
	public void  enter_input_as_username_and_as_password (String username,String password) {
		login.login(username, password);
	}
	
	@And("click button login")
	public void clickBtn() {
		login.clickBtn();	
	}
	@Then("Appear popup greating {string}")
	public void appear_popup_greating(String expect) {
		String actual = login.getMessage();
		assertTrue(actual.contains(expect));	
	}
	

}