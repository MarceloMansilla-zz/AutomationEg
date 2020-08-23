package ar.com.automation.app.builder;

import java.util.List;

import ar.com.automation.app.models.User;
import ar.com.automation.app.utils.enums.gender.Gender;

public class UserBuilder {

	private User user;

	public static UserBuilder anUser() {
		return new UserBuilder();
	}

	public UserBuilder but(String firstName, String lastName, String address, String email, String phone, Gender gender,
			String language, String skills, List<String> hobbies, String country, String selectCountry, String birthDay,
			String birthMonth, String birthYear, String password, String confirmPassword) {
		return withDefaultInforWithMegadealer(firstName, lastName, address, email, phone, gender, language, skills,
				hobbies, country, selectCountry, birthDay, birthMonth, birthYear, password, confirmPassword);
	}

	public UserBuilder withDefaultInforWithMegadealer(String firstName, String lastName, String address, String email,
			String phone, Gender gender, String language, String skills, List<String> hobbies, String country,
			String selectCountry, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear,
			String password, String confirmPassword) {
		this.user = User.builder().firstName(firstName).lastName(lastName).address(address).email(email).phone(phone)
				.gender(gender).language(language).skills(skills).hobbies(hobbies).country(country)
				.selectCountry(selectCountry).dateOfBirthDay(dateOfBirthDay).dateOfBirthMonth(dateOfBirthMonth)
				.dateOfBirthYear(dateOfBirthYear).password(password).confirmPassword(confirmPassword).build();
		return this;
	}

	public User build() {
		return this.user;
	}

	public UserBuilder withEmptyFirstName() {
		this.user.setFirstName("");
		return this;
	}

	public UserBuilder withEmptyLastName() {
		this.user.setLastName("");
		return this;
	}

	public UserBuilder withEmptyAddress() {
		this.user.setAddress("");
		return this;
	}

	public UserBuilder withEmptyEmail() {
		this.user.setEmail("");
		return this;
	}

	public UserBuilder withEmptyPhone() {
		this.user.setPhone("");
		return this;
	}

	public UserBuilder withEmptyHobbies() {
		List<String> hobbies = null;
		this.user.setHobbies(hobbies);
		return this;
	}

	public UserBuilder withEmptyLanguage() {
		this.user.setLanguage("");
		return this;
	}

	public UserBuilder withEmptySkills() {
		this.user.setSkills("");
		return this;
	}

	public UserBuilder withEmptyCountry() {
		this.user.setCountry("");
		return this;
	}

	public UserBuilder withSelectCountry() {
		this.user.setSelectCountry("");
		return this;
	}

	public UserBuilder withEmptyDateOfBirthYear() {
		this.user.setDateOfBirthYear("");
		return this;
	}

	public UserBuilder withEmptyDateOfBirthMonth() {
		this.user.setDateOfBirthMonth("");
		return this;
	}

	public UserBuilder withEmptyDateOfBirthDay() {
		this.user.setDateOfBirthDay("");
		return this;
	}

	public UserBuilder withEmptyPassword() {
		this.user.setPassword("");
		return this;
	}

	public UserBuilder withEmptyConfirmPassword() {
		this.user.setConfirmPassword("");
		return this;
	}
}