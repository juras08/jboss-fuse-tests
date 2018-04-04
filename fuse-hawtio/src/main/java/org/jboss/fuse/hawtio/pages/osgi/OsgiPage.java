package org.jboss.fuse.hawtio.pages.osgi;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.jboss.fuse.hawtio.pages.HawtioPage;
import org.jboss.fuse.hawtio.pages.osgi.bundles.OsgiBundlesPage;

import org.openqa.selenium.By;

public class OsgiPage extends HawtioPage {
	public OsgiBundlesPage openBundlesPage() {
		$(By.xpath("//a[contains(text(), 'Bundles')]")).shouldBe(visible).click();
		return page(OsgiBundlesPage.class);
	}
}
