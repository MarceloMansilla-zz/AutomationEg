package ar.com.automation.app.tasks.login;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.service.login.LoginPageService;

@Component
public class LoginTask {

	@Autowired
	private WebDriver webDriver;

	@Autowired
	private LoginPageService loginPageService;

	@Value("${url}")
	private String url;

	public void goTo() {
		this.webDriver.get(url);
	}

	public void goToRegister() {
		loginPageService.clickLoginButton();
	}
}