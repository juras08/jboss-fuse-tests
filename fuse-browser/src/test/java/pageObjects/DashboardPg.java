package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.Assertions.assertThat;

import lombok.extern.slf4j.Slf4j;

// Not used now
@Slf4j
public class DashboardPg extends PageObject {

	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboardTab;

	@FindBy(xpath = "//input[@class='search-query ng-pristine ng-valid']")
	private WebElement searchBox;

	@FindBy(xpath = "//table/tbody/tr[not(contains(@style,'display: none;'))]/td[1]")
	private List<WebElement> columns;

	public DashboardPg(WebDriver driver) {
		super(driver);
	}

	public DashboardPg switchTab() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dashboardTab.click();
		return this;
	}

	public DashboardPg find(String searchword) {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchBox.sendKeys(searchword);
		return this;
	}

	public void checkColumns(String searchword) {
		for (WebElement col : columns) {
			log.info("XXXXXXXX Cell value is : {}", col.getText());
			assertThat(col.getText()).containsIgnoringCase(searchword);
		}
	}
}
