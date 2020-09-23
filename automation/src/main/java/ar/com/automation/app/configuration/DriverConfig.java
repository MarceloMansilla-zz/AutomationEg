package ar.com.automation.app.configuration;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ar.com.automation.app.utils.DriverFactory;
import ar.com.automation.app.utils.enums.Browser;

@Configuration
@ComponentScan(basePackages = "ar.com.automation.app")
@PropertySource("classpath:/application-${environment:dev}.properties")
public class DriverConfig {

	@Value("${driver.type}")
	private Browser driverType;

	@Value("${element.wait.timeout.seconds}")
	private int webDriverWaitTimeOut;

	@Autowired
	private DriverFactory driverFactory;
	@Bean
	public WebDriver getWebdriver() throws MalformedURLException {
		return driverFactory.get(driverType);
	}

	@Bean
	public WebDriverWait waitFor() throws MalformedURLException {
		return new WebDriverWait(getWebdriver(), Duration.ofSeconds(webDriverWaitTimeOut).getSeconds());
	}
}
