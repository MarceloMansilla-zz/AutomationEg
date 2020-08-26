package ar.com.automation.app.builder;

import ar.com.automation.app.models.User;

public class UserBuilder {

	private User user;

	private UserBuilder() {
		user = User.builder().build();
	}

	public static UserBuilder anUser() {
		return new UserBuilder();
	}
	

	public UserBuilder but(String firstName, String lastName, String address, String email, String phone, String gender,
			String language, String skills, String hobbies, String country, String anotherCountry, String birthDay,
			String birthMonth, String birthYear, String password, String confirmPassword) {
		return withDefaultInfor(firstName, lastName, address, email, phone, gender, language, skills, hobbies, country,
				anotherCountry, birthDay, birthMonth, birthYear, password, confirmPassword);
	}

	public UserBuilder withDefaultInfor(String firstName, String lastName, String address, String email, String phone,
			String gender, String language, String skills, String hobbies, String country, String anotherCountry,
			String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String password,
			String confirmPassword) {
		this.user = User.builder().firstName(firstName).lastName(lastName).address(address).email(email).phone(phone)
				.gender(gender).language(language).skills(skills).hobbies(hobbies).country(country)
				.anotherCountry(anotherCountry).dateOfBirthDay(dateOfBirthDay).dateOfBirthMonth(dateOfBirthMonth)
				.dateOfBirthYear(dateOfBirthYear).password(password).confirmPassword(confirmPassword).build();
		return this;
	}

	public User build() {
		return this.user;
	}

	public UserBuilder withoutFirstName() {
		this.user.setFirstName("");
		return this;
	}

	public UserBuilder withoutLastName() {
		this.user.setLastName("");
		return this;
	}

	public UserBuilder withoutAddress() {
		this.user.setAddress("");
		return this;
	}

	public UserBuilder withoutEmail() {
		this.user.setEmail("");
		return this;
	}

	public UserBuilder withoutPhone() {
		this.user.setPhone("");
		return this;
	}

	public UserBuilder withoutGender() {
		this.user.setGender("");
		return this;
	}

	public UserBuilder withoutHobbies() {
		this.user.setHobbies("");
		return this;
	}

	public UserBuilder withoutLanguage() {
		this.user.setLanguage("");
		return this;
	}

	public UserBuilder withoutSkills() {
		this.user.setSkills("");
		return this;
	}

	public UserBuilder withoutCountry() {
		this.user.setCountry("");
		return this;
	}

	public UserBuilder withoutAnotherCountry() {
		this.user.setAnotherCountry("");
		return this;
	}

	public UserBuilder withoutDateOfBirthYear() {
		this.user.setDateOfBirthYear("");
		return this;
	}

	public UserBuilder withoutDateOfBirthMonth() {
		this.user.setDateOfBirthMonth("");
		return this;
	}

	public UserBuilder withoutDateOfBirthDay() {
		this.user.setDateOfBirthDay("");
		return this;
	}

	public UserBuilder withoutPassword() {
		this.user.setPassword("");
		return this;
	}

	public UserBuilder withoutConfirmPassword() {
		this.user.setConfirmPassword("");
		return this;
	}
}