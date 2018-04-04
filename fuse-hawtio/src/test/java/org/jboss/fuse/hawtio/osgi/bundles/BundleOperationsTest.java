package org.jboss.fuse.hawtio.osgi.bundles;

import static com.codeborne.selenide.Condition.text;

import org.jboss.fuse.hawtio.fragments.osgi.table.Table;
import org.jboss.fuse.hawtio.pages.LoginPage;
import org.jboss.fuse.hawtio.pages.osgi.OsgiPage;

import org.junit.Before;
import org.junit.Test;

import com.codeborne.selenide.Selenide;
// test bundles operations (start stop refresh install uninstall update)

public class BundleOperationsTest {

	private static OsgiPage page = new OsgiPage();
	private static Table table = new Table();

	public static <P> P open(Class<P> pageObjectClass, String... params) {
		return Selenide.open("http://localhost:8181/hawtio", pageObjectClass);
	}

	@Before
	public void init() {
		final LoginPage login = open(LoginPage.class);
		page = login.login("admin", "admin").menu().osgi();
		//NavigateTabs.installBundle("mvn:com.jboss.fuse.tests.practice/hawtio-bundle/1.0");
	}

	@Test
	public void checkRefreshBundleWithNameJacksonAnnotaions() {
		page.openBundlesPage().refreshBundle("Jackson-annotations");
	}

//	public void checkStartBundleWithNameJacksonAnotation() {
//		page.openBundlesPage().startBundle("Jackson-annotations");
//		table.getCell("State", "Jackson-annotation").shouldHave(text("active"));
//	}
}

