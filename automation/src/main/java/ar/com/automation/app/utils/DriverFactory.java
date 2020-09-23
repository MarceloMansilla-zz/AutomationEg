package ar.com.automation.app.utils;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ar.com.automation.app.utils.enums.Browser;

@Component
public class DriverFactory {

	private static String path = "Drivers/";

	@Value("${grid.url}")
	private String gridURL;

	@Value("${remote.execution}")
	private boolean remoteExecution;

	public WebDriver get(Browser browser) throws MalformedURLException {

		if (remoteExecution) {
			return getRemoteDriver(browser);
		}

		if (Browser.CH == browser) {
			System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
			return new ChromeDriver();
		}

		if (Browser.FX == browser) {
			System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
			return new FirefoxDriver();
		}

		if (Browser.IE == browser) {
			System.setProperty("webdriver.ie.driver", path + "IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		throw new IllegalArgumentException("Driver not found for the browser" + browser);
	}

	private RemoteWebDriver getRemoteDriver(Browser browser) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser.name());
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enab", true);
		return new RemoteWebDriver(URI.create(gridURL).toURL(), capabilities);
	}
}
