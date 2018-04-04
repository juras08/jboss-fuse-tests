package org.jboss.fuse.hawtio.fragments.osgi.table;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;

public class Table {

	private int getColumnsPosition(String headerName) {
		$("thead th").shouldBe(visible);
		final ElementsCollection headers = $$("thead tr th");
		int position = -1;
		for (int i = 0; i < headers.size(); i++) {
			if (headerName.equals(headers.get(i).getText())) {
				position = i + 1;
				break;
			}
		}
		return position;
	}

	public SelenideElement getCell(String headerName, String rowName) {
		final SelenideElement row = getRow(rowName);
		final int position = getColumnsPosition(headerName);
		return row.$("td:nth-child(" + position + ")");
	}

	public ElementsCollection getColumn(String headerName) {
		final int position = getColumnsPosition(headerName);
		return $$("tbody tr[role='row'] td:nth-child(" + position + ")");
	}

	public SelenideElement getRow(String name) {
		final ElementsCollection rows = getColumn("Name");
		int position = -1;
		for (int i = 0; i < rows.size(); i++) {
			if (name.equals(rows.get(i).getText())) {
				position = i + 1;
				break;
			}
		}
		return $("tbody tr[role='row']:nth-child(" + position + ")");
	}
}
