package com.jboss.fuse.test.practice.browser;

import org.junit.Before;
import org.junit.Test;

import com.jboss.fuse.test.practice.Practice;

import pageObjects.HawtioDashboardPage;
import pageObjects.HawtioLoginPage;

import static com.codeborne.selenide.Selenide.open;

public class ExBrowserTest extends Practice {

//	Commented: old code for pure Selenium
//	-------------------------------------
//	private static WebDriver driver;
//	private DashboardPg dashboardPg;
//
//	@Before
//	public void setUp() {
//		driver = new ChromeDriver();
//		try {
//			Thread.sleep(5000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.get("http://localhost:8181/hawtio");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		try {
//			Thread.sleep(5000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		dashboardPg = new LoginPg(driver).submit("fafram", "fafram");
//	}
//
//	@Test
//	public void exBrowserTest() {
//		dashboardPg.switchTab().find("Process").checkColumns("Process");
//	}
//
//	@Test
//	public void userCanSearch() {
//		GooglePage page = open("https://google.com/ncr", GooglePage.class);
//		SearchResultsPage results = page.searchFor("selenide");
//		results.getResults().shouldHave(sizeGreaterThan(1));
//		results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
//	}
//
//	@After
//	public void cleanUp() {
//		driver.close();
//	}
//	----------------

	@Before
	public void setUp() {
		open("http://localhost:8181/hawtio");
		HawtioLoginPage.submit("fafram", "fafram");
	}

	@Test
	public void moveToDashboard() {
		HawtioDashboardPage.switchTab();
		HawtioDashboardPage.searchWord("Process");
		HawtioDashboardPage.checkColumns("Process");
	}
}
