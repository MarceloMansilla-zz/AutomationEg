package ar.com.automation.app.page.object.webtable;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.BasePage;
import lombok.Getter;

@Component
@Getter
public class WebTablePage extends BasePage {

	@Autowired
	public WebTablePage(WebDriver driver) {
		super(driver);
	}

	@FindBys({ @FindBy(tagName = "h4") })
	private List<WebElement> titles;

}
