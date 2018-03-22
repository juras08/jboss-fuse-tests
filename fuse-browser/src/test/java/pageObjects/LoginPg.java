package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPg extends PageObject {

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//*[@class='btn btn-success']")
	private WebElement submitButton;

	public LoginPg(WebDriver driver) {
		super(driver);
	}

	private void typeUsername(String username) {
		this.username.sendKeys(username);
	}

	private void typePassword(String password) {
		this.password.sendKeys(password);
	}

	public DashboardPg submit(String username, String password) {
		typeUsername(username);
		typePassword(password);
		submitButton.click();
		return new DashboardPg(driver);
	}
}
