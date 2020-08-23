package ar.com.automation.app.page.service;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.BasePage;

@Component
public class BasePageService {

	@Autowired
	private BasePage basePage;

	@Autowired
	private WebDriverWait wait;

}
