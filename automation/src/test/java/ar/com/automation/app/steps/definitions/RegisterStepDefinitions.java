package ar.com.automation.app.steps.definitions;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

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

	@When("I complete First Name {string}")
	public void i_complete_First_Name(String firstName) {
		registerTask.writeFirstName(firstName);
	}

	@When("I complete Last Name {string}")
	public void i_complete_Last_Name(String lastName) {
		registerTask.writeLastName(lastName);
	}

	@When("I complete Address {string}")
	public void i_complete_Address(String address) {
		registerTask.writeAddress(address);
	}

	@When("I complete Email {string}")
	public void i_complete_Email(String email) {
		registerTask.writeEmail(email);
	}

	@When("I complete Phone {string}")
	public void i_complete_Phone(String phone) {
		registerTask.writePhone(phone);
	}

	@When("I select Gender {string}")
	public void i_select_Gender(String gender) {
		registerTask.selectGender(gender);
	}

	@When("I check Hobbies {string},{string}")
	public void i_check_Hobbies(String string, String string2) {
	}

	@When("I select Languages {string}")
	public void i_select_Languages(String language) {
		//registerTask.selectLanguage(language);
	}

	@When("I select Skill {string}")
	public void i_select_Skill(String skill) {
		registerTask.selectSkills(skill);
	}

	@When("I select Country {string}")
	public void i_select_Country(String country) {
		registerTask.selectCountry(country);
	}

	@When("I select Another Country {string}")
	public void i_select_Another_Country(String anotherCountry) {
		//registerTask.selectAnotherCountry(anotherCountry);
	}

	@When("I select Date of Birth Year {string}")
	public void i_select_Date_of_Birth_Year(String year) {
		registerTask.selectDateOfBirthYear(year);
	}

	@When("I select Date of Birth Month {string}")
	public void i_select_Date_of_Birth_Month(String month) {
		registerTask.selectDateOfBirthMonth(month);
	}

	@When("I select Date of Birth Day {string}")
	public void i_select_Date_of_Birth_Day(String day) {
		registerTask.selectDateOfBirthDay(day);
	}

	@When("I complete Password {string}")
	public void i_complete_Password(String password) {
		registerTask.writePassword(password);
	}

	@When("I complete Confirm Password {string}")
	public void i_complete_Confirm_Password(String confirmPassword) {
		registerTask.writeConfirmPassword(confirmPassword);
	}

	@When("I click on Submit")
	public void i_click_on_Submit() {
		registerTask.clickSubmit();

	}

	@Then("I am redirected to Web Table view {string}")
	public void i_am_redirected_to_Web_Table_view(String title) {
		Assert.assertTrue(webTableTask.validateWebTablePage(title));
	}

}
