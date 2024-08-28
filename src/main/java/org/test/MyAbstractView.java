package org.test;

import com.vaadin.server.Page;
import com.vaadin.ui.CssLayout;

public abstract class MyAbstractView extends CssLayout {
// Migrating this class will result in importing the following package which is incorrect:
// import Page.BrowserWindowResizeEvent;

    public void browserEvent(Page.BrowserWindowResizeEvent browserWindowResizeEvent) {
    }

}
