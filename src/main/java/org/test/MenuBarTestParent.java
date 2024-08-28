package org.test;

import com.vaadin.ui.*;
import org.vaadin.viritin.layouts.MHorizontalLayout;

public abstract class MenuBarTestParent extends MyAbstractView {

    public abstract MenuBar.Command test(Label label, MHorizontalLayout mHorizontalLayout, MenuBar menuBar);

}
