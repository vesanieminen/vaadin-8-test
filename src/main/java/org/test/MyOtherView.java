package org.test;

import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import org.vaadin.viritin.layouts.MHorizontalLayout;

public class MyOtherView extends MyParentView {
    @Override
    public MenuBar.Command test(Label label, MHorizontalLayout mHorizontalLayout, MenuBar menuBar) {
        label.setValue("other");
        return null;
    }

}
