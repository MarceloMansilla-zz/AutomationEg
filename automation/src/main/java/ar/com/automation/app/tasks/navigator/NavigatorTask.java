package ar.com.automation.app.tasks.navigator;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NavigatorTask {

	@Autowired
	private WebDriver webDriver;
	
	@Value("${url}")
	private String url;

	public void goTo() {
		this.webDriver.get(url);
	}

}