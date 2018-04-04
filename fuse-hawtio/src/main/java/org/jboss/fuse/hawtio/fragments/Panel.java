package org.jboss.fuse.hawtio.fragments;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.jboss.fuse.hawtio.pages.LoginPage;

import org.openqa.selenium.By;

public class Panel {

	public LoginPage logout() {
		this.openDropDownMenu();
		$(By.linkText("Logout")).shouldBe(visible).click();
		return page(LoginPage.class);
	}

	private void openDropDownMenu() {
		$("#userDropdownMenu").shouldBe(visible).click();
	}
}
