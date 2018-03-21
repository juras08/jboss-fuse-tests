package com.jboss.fuse.test.practice.browser;

import static org.junit.Assert.assertTrue;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jboss.fuse.test.practice.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import pageObjects.LoginPage;

public class ExBrowserTest extends Practice {
//	@ClassRule
//	public static Fafram fafram = new Fafram();

	//protected static WebDriver driver = new ChromeDriver();

	@Before
	public void launchPage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void exBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8181/hawtio");

		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("fafram", "fafram");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		loginPage.switchDashboard("Process");

		/*
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("fafram");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fafram");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Dashboard']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='search-query ng-pristine ng-valid']")).sendKeys("Process");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr[not(contains(@style,'display: none;'))]/td[1]"));
		for (WebElement el : elements) {
			System.out.println("Cell value is : " + el.getText());
			//assertTrue(el.getText().contains("process"));
			assertThat(el.getText()).containsIgnoringCase("Process");
		}*/

		/*
		login.login("fafram", "fafram").searchFor("Process").assertCorrectFiltering();
		 */
	}
}
