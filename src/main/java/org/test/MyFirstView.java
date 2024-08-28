package org.test;

import com.vaadin.ui.*;

public class MyFirstView extends MyParentView {
    @Override
    public MenuBar.Command test(Label label, MenuBar menuBar) {
        label.setValue("first");
        return null;
    }

}
