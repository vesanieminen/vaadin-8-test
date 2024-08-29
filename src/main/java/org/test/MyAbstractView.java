package org.test;

import com.vaadin.server.Page;
import com.vaadin.ui.CssLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.html.Div;
import Page.BrowserWindowResizeEvent;

// FIXME:
// Migrating this class will result in importing the following package which is incorrect:
// import Page.BrowserWindowResizeEvent;
public abstract class MyAbstractView extends Div {

    public void browserEvent(BrowserWindowResizeEvent browserWindowResizeEvent) {
    }

}
