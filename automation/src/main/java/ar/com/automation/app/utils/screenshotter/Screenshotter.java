package ar.com.automation.app.utils.screenshotter;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Screenshotter {

	@Autowired
	private WebDriver webDriver;

	@Value("${take.screenshot.condition:none}")
	private TakeScreenshotCondition takenScreenshotCondition;

	@AfterStep
	public void takeScreenshotEveryStep(Scenario scenario) {
		if (TakeScreenshotCondition.everyStep == takenScreenshotCondition) {
			takeScreenshot(scenario);
		}
	}

	@After
	public void takeScreenshotFailingScenario(Scenario scenario) {
		if (scenario.isFailed() && TakeScreenshotCondition.failingScenario == takenScreenshotCondition) {
			takeScreenshot(scenario);
		}
	}

	@After
	public void takeScreenshotEndOfScenario(Scenario scenario) {
		if (TakeScreenshotCondition.everyStep == takenScreenshotCondition) {
			takeScreenshot(scenario);
		}
	}

	private void takeScreenshot(Scenario scenario) {
		try {
			final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Test 1");
		} catch (WebDriverException e) {
			Logger.getLogger(e.getMessage());
		}
	}

}
