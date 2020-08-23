package ar.com.automation.app.page.service.webtable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.object.webtable.WebTablePage;

@Component
public class WebTablePageService {
	@Autowired
	private WebTablePage webTableService;

	@Autowired
	private WebDriverWait wait;

	public boolean valdiatePageWebTable(String message) {
		wait.until(ExpectedConditions.visibilityOfAllElements(this.webTableService.getTitles()));
		return validatePage(webTableService.getTitles(), message);
	}

	private boolean validatePage(List<WebElement> titles, String text) {
		boolean isWebTableView = false;
		for (WebElement webElement : titles) {
			System.out.println("webElement.getText():" + webElement.getText());
			if (webElement.getText().contains(text)) {
				isWebTableView = true;
				break;
			}
		}
		return isWebTableView;
	}

}
