package org.test;

import com.vaadin.ui.*;

public class MyFirstView extends MyParentView {

    public MyFirstView() {
        // FIXME:
        // The following line results in this after migration:
        // ((HasStyle) setClassName()).setStyleName("MyFirstView");
        setStyleName("MyFirstView");

        GridLayout gridLayout = new GridLayout();
        gridLayout.setComponentAlignment(new Label("label"), Alignment.BOTTOM_CENTER);
    }

    @Override
    public MenuBar.Command test(Label label, MenuBar menuBar) {
        label.setValue("first");
        return null;
    }

}
