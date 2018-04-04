package org.jboss.fuse.hawtio.fragments;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.jboss.fuse.hawtio.pages.osgi.OsgiPage;

public class Menu {

	public OsgiPage osgi() {
		$("li[data-target='#osgi-secondary']").shouldBe(visible).click();
		return page(OsgiPage.class);
	}
}
