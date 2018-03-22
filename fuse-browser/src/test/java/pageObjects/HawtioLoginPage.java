package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HawtioLoginPage {

	private static class Element {
		private static final By USERNAME = By.xpath("//*[@id='username']");
		private static final By PASSWORD = By.xpath("//*[@id='password']");
		private static final By BUTTON = By.xpath("//*[@class='btn btn-success']");
	}

	public static void submit(String username, String password) {
		$(Element.USERNAME).val(username);
		$(Element.PASSWORD).val(password);
		$(Element.BUTTON).click();
	}
}
