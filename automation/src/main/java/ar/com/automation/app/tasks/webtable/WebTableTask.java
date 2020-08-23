package ar.com.automation.app.tasks.webtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.automation.app.page.service.webtable.WebTablePageService;

@Component
public class WebTableTask {

	@Autowired
	private WebTablePageService webTableService;

	public boolean validateWebTablePage(String title) {
		return webTableService.valdiatePageWebTable(title);
	}

}