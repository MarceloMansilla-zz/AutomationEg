package ar.com.automation.app.page.object.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.BasePage;
import lombok.Getter;

@Component
@Getter
public class LoginPage extends BasePage{

	@Autowired
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "enterimg")
	private WebElement loginBtn;
}
