package ar.com.automation.app.utils.screenshotter;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class Screenshotter {

	@Autowired
	private WebDriver webDriver;

	/*@After
	public void takeScreenshot(Scenario scenario) {
		try {
			final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Test 1");
		} catch (WebDriverException e) {
			Logger.getLogger(e.getMessage());
		}
	}*/

}
