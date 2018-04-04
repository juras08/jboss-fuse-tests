package org.jboss.fuse.hawtio.pages.osgi.bundles;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

public class OsgiBundleDetailPage {
	public OsgiBundleDetailPage start() {
		$(By.xpath("//button[text()='Start']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundleDetailPage stop() {
		$(By.xpath("//button[text()='Stop']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundleDetailPage refresh() {
		$(By.xpath("//button[text()='Refresh']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundleDetailPage update() {
		$(By.xpath("//button[text()='Update']")).shouldBe(visible).click();
		return this;
	}

	public OsgiBundleDetailPage uninstall() {
		$(By.xpath("//button[text()='Uninstall']")).shouldBe(visible).click();
		return this;
	}
}
