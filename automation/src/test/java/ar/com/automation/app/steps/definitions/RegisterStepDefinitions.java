package ar.com.automation.app.steps.definitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import ar.com.automation.app.builder.UserBuilder;
import ar.com.automation.app.configuration.DriverConfig;
import ar.com.automation.app.tasks.login.LoginTask;
import ar.com.automation.app.tasks.navigator.NavigatorTask;
import ar.com.automation.app.tasks.register.RegisterTask;
import ar.com.automation.app.tasks.webtable.WebTableTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@ContextConfiguration(classes = { DriverConfig.class })
public class RegisterStepDefinitions {

	@Autowired
	private NavigatorTask navigatorTask;

	@Autowired
	private LoginTask loginTask;

	@Autowired
	private RegisterTask registerTask;

	@Autowired
	private WebTableTask webTableTask;

	@Given("I want to register a user")
	public void i_want_to_register_a_user() {
		navigatorTask.goTo();
		loginTask.goToRegister();
	}

	@When("I complete: First Name {string} Last Name {string} Address {string} Email {string} Phone {string} Gender {string} Hobbies {string} Languages {string} Skill {string} Country {string} Another Country {string} Date of Birth Year {string} Date of Birth Month {string} Date of Birth Day {string} Password {string} Confirm Password {string}")
	public void i_complete_First_Name_Last_Name_Address_Email_Phone_Gender_Hobbies_Languages_Skill_Country_Another_Country_Date_of_Birth_Year_Date_of_Birth_Month_Date_of_Birth_Day_Password_Confirm_Password(
			String firstName, String lastName, String address, String email, String phone, String gender,
			String language, String skills, String hobbies, String country, String anotherCountry,
			String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String password,
			String confirmPassword) {
		registerTask.withDefaultInfo(UserBuilder.anUser()
				.withDefaultInfor(firstName, lastName, address, email, phone, gender, language, skills, hobbies,
						country, anotherCountry, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, password,
						confirmPassword)
				.build());
	}

	@When("I click on Submit")
	public void i_click_on_Submit() {
		registerTask.clickSubmit();
	}

	@Then("I am redirected to Web Table view {string}")
	public void i_am_redirected_to_Web_Table_view(String string) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Assert.assertTrue(webTableTask.validateWebTablePage(title));
	}

}
