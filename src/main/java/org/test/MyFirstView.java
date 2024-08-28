package org.test;

import com.vaadin.ui.*;
import org.vaadin.viritin.layouts.MHorizontalLayout;

public class MyFirstView extends MyParentView {
    @Override
    public MenuBar.Command test(Label label, MHorizontalLayout mHorizontalLayout, MenuBar menuBar) {
        label.setValue("first");
        return null;
    }

}
