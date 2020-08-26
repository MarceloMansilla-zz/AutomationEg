package ar.com.automation.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private String language;
	private String skills;
	private String hobbies;
	private String country;
	private String anotherCountry;
	private String dateOfBirthDay;
	private String dateOfBirthMonth;
	private String dateOfBirthYear;
	private String password;
	private String confirmPassword;
}