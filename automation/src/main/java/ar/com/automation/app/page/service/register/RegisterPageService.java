package ar.com.automation.app.page.service.register;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.register.RegisterPage;
import ar.com.automation.app.utils.enums.gender.Gender;

@Component
public class RegisterPageService {
	@Autowired
	private RegisterPage registerService;

	@Autowired
	private WebDriverWait wait;

	public void writeFirstName(String name) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getFirstName()));
		registerService.getFirstName().sendKeys(name);
	}

	public void writeLastName(String lastName) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getLastName()));
		registerService.getLastName().sendKeys(lastName);
	}

	public void writeAddress(String address) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getAddress()));
		registerService.getAddress().sendKeys(address);
	}

	public void writeEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getEmail()));
		registerService.getEmail().sendKeys(email);
	}

	public void writePhone(String phone) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getPhone()));
		registerService.getPhone().sendKeys(phone);
	}

	private void selectFemale() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getGenderFemale()));
		registerService.getGenderFemale().click();
	}

	private void selectMale() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getGenderMale()));
		registerService.getGenderMale().click();
	}

	public void selectGender(Gender gender) {
		if (gender == Gender.male) {
			selectMale();
		} else {
			selectFemale();
		}
	}

	private void checkCricket() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getHobbiesCricket()));
		registerService.getHobbiesCricket().click();
	}

	private void checkMovies() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getHobbiesMovies()));
		registerService.getHobbiesMovies().click();
	}

	private void checkHockey() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getHobbiesHockey()));
		registerService.getHobbiesHockey().click();
	}

	public void checkHobbies(List<String> hobbies) {
		for (String hobbie : hobbies) {
			if (hobbie.equals("cricket")) {
				checkCricket();
			} else if (hobbie.equals("movies")) {
				checkMovies();
			} else if (hobbie.equals("hockey")) {
				checkHockey();
			}
		}
	}

	public void selectLanguage(String language) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getLanguage()));
		new Select(this.registerService.getLanguage()).selectByValue(language);
	}

	public void selectSkills(String skill) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getSkills()));
		new Select(this.registerService.getSkills()).selectByValue(skill);
	}

	public void selectCountry(String country) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getCountry()));
		new Select(this.registerService.getCountry()).selectByValue(country);
	}

	public void selectAnotherCountry(String anotherCountry) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getSelectCountry()));
		new Select(this.registerService.getSelectCountry()).selectByValue(anotherCountry);
	}

	public void selectDateOfBirthYear(String year) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getDateOfBirthYear()));
		new Select(this.registerService.getDateOfBirthYear()).selectByValue(year);
	}

	public void selectDateOfBirthMonth(String month) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getDateOfBirthMonth()));
		new Select(this.registerService.getDateOfBirthMonth()).selectByValue(month);
	}

	public void selectDateOfBirthDay(String day) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getDateOfBirthDay()));
		new Select(this.registerService.getDateOfBirthDay()).selectByValue(day);
	}

	public void writePassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getPassword()));
		this.registerService.getPassword().sendKeys(password);
	}

	public void writeConfirmPassword(String confirmPassword) {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getConfirmPassword()));
		this.registerService.getConfirmPassword().sendKeys(confirmPassword);
	}

	public void clickSubmit() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getSubmitBtn()));
		this.registerService.getSubmitBtn().click();
	}

	public void clickRefresh() {
		wait.until(ExpectedConditions.visibilityOf(this.registerService.getRefreshBtn()));
		this.registerService.getRefreshBtn().click();
	}

}
