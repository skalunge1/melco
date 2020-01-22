package stepDefination;

import org.openqa.selenium.By;

import base.utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class HomePageStep {
	AndroidDriver<?> driver;
	
	public HomePageStep() {
		this.driver = driver;
	}
	utilities u;
	
	//Locators for Home page
	By memberID = By.id("com.melco.dx.melcoapp.dev:id/fragment_login_member_id");
	By memberPin = By.id("com.melco.dx.melcoapp.dev:id/fragment_login_pin");
	By city = By.id("com.melco.dx.melcoapp.dev:id/fragment_login_city_id_switcher");
	By termsCheckbox = By.id("com.melco.dx.melcoapp.dev:id/layout_privacy_policy_checkbox");
	By memberLoginBtn = By.id("com.melco.dx.melcoapp.dev:id/fragment_login_member_login_button");
	
	@Given("^I land on Melco app home screen$")
	public void i_land_on_Melco_app_home_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		utilities.InstallInvokeAPK();
		System.out.println("User can see iOS app running on local devices");
	}

	@When("^I sign up the app using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_sign_up_the_app_using_and(String userName, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(memberID).sendKeys(userName);
		driver.findElement(memberPin).sendKeys(password);
		driver.findElement(termsCheckbox).click();
		
		driver.findElement(memberLoginBtn).click();
		System.out.println("Success in Melco Home screen");
	}

	@Then("^I land on Home screen successfully$")
	public void i_land_on_Home_screen_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Success");
	}


}
