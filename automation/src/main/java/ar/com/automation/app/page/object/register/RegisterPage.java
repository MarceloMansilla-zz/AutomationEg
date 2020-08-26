package ar.com.automation.app.page.object.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.BasePage;
import lombok.Getter;

@Component
@Getter
public class RegisterPage extends BasePage {

	@Autowired
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@ng-model='FirstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@ng-model='LastName']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;

	@FindBy(xpath = "//input[@ng-model='EmailAdress']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;

	@FindBy(xpath = "//input[@value='Male']")
	private WebElement genderMale;

	@FindBy(xpath = "//input[@value='FeMale']")
	private WebElement genderFemale;

	@FindBy(xpath = "//input[@value='Cricket']")
	private WebElement hobbiesCricket;

	@FindBy(xpath = "//input[@value='Movies']")
	private WebElement hobbiesMovies;

	@FindBy(xpath = "//input[@value='Hockey']")
	private WebElement hobbiesHockey;

	@FindBy(id = "msdd")
	private WebElement language;

	@FindBy(id = "Skills")
	private WebElement skills;

	@FindBy(id = "countries")
	private WebElement country;

	@FindBy(className = "select2-selection")
	private WebElement selectCountry;

	@FindBy(id = "yearbox")
	private WebElement dateOfBirthYear;

	@FindBy(xpath = "//select[@ng-model='monthbox']")
	private WebElement dateOfBirthMonth;

	@FindBy(xpath = "//select[@ng-model='daybox']")
	private WebElement dateOfBirthDay;

	@FindBy(id = "firstpassword")
	private WebElement password;

	@FindBy(id = "secondpassword")
	private WebElement confirmPassword;

	@FindBy(id = "submitbtn")
	private WebElement submitBtn;

	@FindBy(xpath = "//button[@value='Refresh']")
	private WebElement refreshBtn;
	
	
	@FindBy(xpath = "//div[@ng-if='EmailExists']")
	private WebElement emailExist;
	
	@FindBy(xpath = "//div[@ng-if='PhoneExists']")
	private WebElement phoneExist;
	
	
}
