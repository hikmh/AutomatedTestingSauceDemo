package runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;


import com.setup.driver.pages.Login;
import com.setup.driver.pages.Logout;
import com.setup.driver.utils.Constants;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogout {
	
	private static WebDriver driver;
	private Login login = new Login();
	private Logout logout = new Logout();


	
	public TestLogout() {
		driver = Hook.driver;
	
	}
	@When ("User navigate to dashboard page")
	public void nav() {
		driver.get(Constants.url);
		login.login("standard_user", "secret_sauce");
		login.clickBtn();
	}
	@And ("Click menu")
	public void menu() {
		logout.menu();
	}
	@Then ("Click logout")
	public void logout() {
		logout.logout();
	}
}