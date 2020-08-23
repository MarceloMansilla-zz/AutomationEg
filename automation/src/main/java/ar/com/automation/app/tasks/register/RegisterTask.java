package ar.com.automation.app.tasks.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.service.register.RegisterPageService;
import ar.com.automation.app.utils.enums.gender.Gender;

@Component
public class RegisterTask {

	@Autowired
	private RegisterPageService registerService;

	public void writeFirstName(String name) {
		registerService.writeFirstName(name);
	}

	public void writeLastName(String lastName) {
		registerService.writeLastName(lastName);
	}

	public void writeAddress(String address) {
		registerService.writeAddress(address);
	}

	public void writeEmail(String email) {
		registerService.writeEmail(email);
	}
	public void writePhone(String phone) {
		registerService.writePhone(phone);
	}

	public void selectGender(Gender gender) {
		registerService.selectGender(gender);
	}

	public void checkHobbies(List<String> hobbies) {
		registerService.checkHobbies(hobbies);

	}

	public void selectLanguage(String language) {
		//registerService.selectLanguage(language);
	}

	public void selectSkills(String skill) {
		registerService.selectSkills(skill);
	}

	public void selectCountry(String country) {
		registerService.selectCountry(country);
	}

	public void selectAnotherCountry(String anotherCountry) {
		registerService.selectAnotherCountry(anotherCountry);
	}

	public void selectDateOfBirthYear(String year) {
		registerService.selectDateOfBirthYear(year);
	}

	public void selectDateOfBirthMonth(String month) {
		registerService.selectDateOfBirthMonth(month);
	}

	public void selectDateOfBirthDay(String day) {
		registerService.selectDateOfBirthDay(day);
	}

	public void writePassword(String password) {
		registerService.writePassword(password);
	}

	public void writeConfirmPassword(String confirmPassword) {
		registerService.writeConfirmPassword(confirmPassword);
	}

	public void clickSubmit() {
		registerService.clickSubmit();
	}

	public void clickRefresh() {
		registerService.clickRefresh();
	}
}