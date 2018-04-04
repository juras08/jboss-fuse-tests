package org.jboss.fuse.hawtio.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
	public HawtioPage login(String username, String password) {
		$("#username").val(username);
		$("#password").val(password);
		$("button[type='submit']").click();
		return page(HawtioPage.class);
	}
}
