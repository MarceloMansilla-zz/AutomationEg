package ar.com.automation.app.tasks.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.models.User;
import ar.com.automation.app.page.service.register.RegisterPageService;

@Component
public class RegisterTask {

	@Autowired
	private RegisterPageService registerService;

	public void withDefaultInfo(User user) {
		registerService.writeFirstName(user.getFirstName());
		registerService.writeLastName(user.getLastName());
		registerService.writeAddress(user.getAddress());
		registerService.writeEmail(user.getEmail());
		registerService.writePhone(user.getPhone());
		registerService.selectGender(user.getGender());
		registerService.checkHobbies(user.getHobbies());
		registerService.selectCountry(user.getCountry());
		registerService.selectDateOfBirthYear(user.getDateOfBirthYear());
		registerService.selectDateOfBirthMonth(user.getDateOfBirthMonth());
		registerService.selectDateOfBirthDay(user.getDateOfBirthDay());
		registerService.writePassword(user.getPassword());
		registerService.writeConfirmPassword(user.getConfirmPassword());
		
		/*
		registerService.selectLanguage(user.getLanguage());
		registerService.selectSkills(user.getSkills());
		
		registerService.selectAnotherCountry(user.getAnotherCountry());
		
		
		
		*/
	}

	public void clickSubmit() {
		registerService.clickSubmit();
	}

	public void clickRefresh() {
		registerService.clickRefresh();
	}
}