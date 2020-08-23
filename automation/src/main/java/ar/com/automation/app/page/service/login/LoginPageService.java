package ar.com.automation.app.page.service.login;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.login.LoginPage;

@Component
public class LoginPageService {

	@Autowired
	private LoginPage loginPage;

	@Autowired
	private WebDriverWait wait;

	public void clickLoginButton() {
		wait.until(ExpectedConditions.visibilityOf(this.loginPage.getLoginBtn()));
		loginPage.getLoginBtn().click();
	}
}
