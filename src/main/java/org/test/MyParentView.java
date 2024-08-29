package org.test;

import com.vaadin.ui.*;
import com.vaadin.flow.component.menubar.MenuBar.Command;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.Html;

public abstract class MyParentView extends MyAbstractView {

    public abstract Command test(Html label, MenuBar menuBar);

}
