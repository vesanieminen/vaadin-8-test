package org.test;

import com.vaadin.ui.*;
import com.vaadin.featurepack.ui.GridLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.menubar.MenuBar.Command;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Html;

public class MyFirstView extends MyParentView {

    private final GridLayout gridLayout = new GridLayout();
    private final Grid grid = new Grid<>();

    public MyFirstView() {
        // FIXME:
        // The following line results in this after migration:
        // ((HasStyle) setClassName()).setStyleName("MyFirstView");
        ((HasStyle) setClassName()).setStyleName("MyFirstView");

        // FIXME:
        // The result of the following is:
        // gridLayout.setComponentAlignment(new Html("<span>" + "label" + "</span>"), FlexComponent.Alignment.BOTTOM_CENTER);
        // FlexComponent.Alignment.BOTTOM_CENTER is not defined in Flow
        gridLayout.setComponentAlignment(new Html("<span>" + "label" + "</span>"), FlexComponent.Alignment.BOTTOM_CENTER);

        // FIXME:
        // The result of this is:
        //   final Html label = new Html("<span>" + "</span>");
        //   label.addClassName("my-style");
        // Html component in Flow does not have addClassName method
        final Html label = new Html("<span>" + "</span>");
        label.addClassName("my-style");
    }

    @Override
    public Command test(Html label, MenuBar menuBar) {
        label.setValue("first");
        return null;
    }

}
