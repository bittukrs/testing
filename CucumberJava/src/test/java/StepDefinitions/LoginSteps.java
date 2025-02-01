package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside Step-user is login page");
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside Step-user enters username and password");
		
	}

	@And("click on login butoon")
	public void click_on_login_butoon() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside Step- clicks on login button");
	
	}

	@Then("user navigate to the home page")
	public void user_navigate_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside Step- user is navigated to the home page");
		
	}



}
