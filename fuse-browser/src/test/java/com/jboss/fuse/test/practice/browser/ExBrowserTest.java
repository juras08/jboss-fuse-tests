package com.jboss.fuse.test.practice.browser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.jboss.fuse.test.practice.Practice;

import java.util.concurrent.TimeUnit;

import pageObjects.DashboardPg;
import pageObjects.LoginPg;

public class ExBrowserTest extends Practice {

	private static WebDriver driver;
	private DashboardPg dashboardPg;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get("http://localhost:8181/hawtio");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dashboardPg = new LoginPg(driver).submit("fafram", "fafram");
	}

	@Test
	public void exBrowserTest() {
		dashboardPg.switchTab().find("Process").checkColumns("Process");
	}

	@After
	public void cleanUp() {
		driver.close();
	}
}
