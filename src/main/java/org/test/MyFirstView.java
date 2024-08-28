package org.test;

import com.vaadin.ui.*;

public class MyFirstView extends MyParentView {

    private final GridLayout gridLayout = new GridLayout();

    public MyFirstView() {
        // FIXME:
        // The following line results in this after migration:
        // ((HasStyle) setClassName()).setStyleName("MyFirstView");
        setStyleName("MyFirstView");

        // FIXME:
        // The result of the following is:
        // gridLayout.setComponentAlignment(new Html("<span>" + "label" + "</span>"), FlexComponent.Alignment.BOTTOM_CENTER);
        // FlexComponent.Alignment.BOTTOM_CENTER is not defined in Flow
        gridLayout.setComponentAlignment(new Label("label"), Alignment.BOTTOM_CENTER);

        // FIXME:
        // The result of this is:
        //   final Html label = new Html("<span>" + "</span>");
        //   label.addClassName("my-style");
        // Html component in Flow does not have addClassName method
        final Label label = new Label();
        label.addStyleName("my-style");
    }

    @Override
    public MenuBar.Command test(Label label, MenuBar menuBar) {
        label.setValue("first");
        return null;
    }

}
