package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findUsrName() {

		return driver.findElement(By.xpath("//*[@id=\"username\"]"));
	}

	public WebElement findPswd() {

		return driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}

	public WebElement findSubmit() {

		return driver.findElement(By.cssSelector(".btn.btn-success"));
	}

	public WebElement findDashboard() {

		return driver.findElement(By.xpath("//a[text()='Dashboard']"));
	}

	public WebElement findSearchbox() {

		return driver.findElement(By.xpath("//input[@class='search-query ng-pristine ng-valid']"));
	}

	public LoginPage inputUsername(String username) {
		findUsrName().sendKeys(username);
		return this;
	}

	public LoginPage inputPassword(String password) {
		findPswd().sendKeys(password);
		return this;
	}

	public LoginPage submit() {
		findSubmit().click();
		return this;
	}

	public DashboardPage login(String username, String password) {
		inputUsername(username).inputPassword(password).submit();
		return new DashboardPage(driver);
	}

	public void switchDashboard(String searchword) {
		findDashboard().click();
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		findSearchbox().sendKeys(searchword);
	}
}
