package org.jboss.fuse.hawtio.pages;

import org.jboss.fuse.hawtio.fragments.Menu;
import org.jboss.fuse.hawtio.fragments.Panel;

public class HawtioPage {

	private Menu menu;
	private Panel panel;

	public HawtioPage() {
		menu = new Menu();
		panel = new Panel();
	}

	public Menu menu() { return menu; }
	public Panel panel() { return panel; }
}
