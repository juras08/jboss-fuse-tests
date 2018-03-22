package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HawtioDashboardPage {

	private static class Element {
		private static final By TAB = By.xpath("//a[text()='Dashboard']");
		private static final By SEARCHBOX = By.xpath("//input[@class='search-query ng-pristine ng-valid']");
		private static final By COLUMNS = By.xpath("//table/tbody/tr[not(contains(@style,'display: none;'))]/td[1]");
	}

	public static void switchTab() {
		$(Element.TAB).click();
	}

	public static void searchWord(String searchWord) {
		$(Element.SEARCHBOX).val(searchWord);
	}

	public static void checkColumns(String searchWord) {
		ElementsCollection col = $$(Element.COLUMNS);
		col.forEach(x -> checkAndPrint(x, searchWord));
	}

	private static void checkAndPrint(SelenideElement x, String word) {
		x.shouldHave(text(word));
		log.info(x.toWebElement().getText());
	}
}
