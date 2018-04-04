package org.jboss.fuse.hawtio.pages.osgi.bundles;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.jboss.fuse.hawtio.fragments.osgi.table.Table;
import org.jboss.fuse.hawtio.pages.HawtioPage;

import org.openqa.selenium.By;

public class OsgiBundlesPage extends HawtioPage {
	private static Table table = new Table();

	public OsgiBundlesPage startBundle(String name) {
		chooseBundle(name);
		$(By.xpath("//button[text()='Start']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundlesPage stopBundle(String name) {
		chooseBundle(name);
		$(By.xpath("//button[text()='Stop']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundlesPage refreshBundle(String name) {
		chooseBundle(name);
		$(By.xpath("//button[text()='Refresh']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundlesPage updateBundle(String name) {
		chooseBundle(name);
		$(By.xpath("//button[text()='Update']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundlesPage uninstallBundle(String name) {
		chooseBundle(name);
		$(By.xpath("//button[text()='Uninstall']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundlesPage installBundle(String url) {
		$("[ng-model='bundleUrl']").shouldBe(visible).setValue(url);
		$(By.xpath("button[contains(text(), 'Install')]")).shouldBe(visible).click();
		return this;
	}

	private void chooseBundle(String name) {
		table.getRow(name).$("input[type='checkbox']").shouldBe(visible).click();
	}
}
