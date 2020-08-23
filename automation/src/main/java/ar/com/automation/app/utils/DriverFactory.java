package ar.com.automation.app.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ar.com.automation.app.utils.enums.Browser;

public class DriverFactory {

	private static String path = "Drivers/";

	public static WebDriver get(Browser browser) {
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
}
