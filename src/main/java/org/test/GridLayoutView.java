package org.test;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class GridLayoutView extends CssLayout {

    public GridLayoutView() {
        final GridLayout gridLayout = new GridLayout();
        gridLayout.setColumns(5);
        gridLayout.setRows(10);

        final Label component1 = new Label("Component 1");
        final Label component2 = new Label("Component 2");
        final Label component3 = new Label("Component 3");
        final Label component4 = new Label("Component 4");
        // Add component to column 0, row 0
        gridLayout.addComponent(component1, 0, 0);
        gridLayout.setComponentAlignment(component1, Alignment.MIDDLE_LEFT);
        // Add component to column 1, row 0
        gridLayout.addComponent(component2, 1, 0);
        gridLayout.setComponentAlignment(component2, Alignment.BOTTOM_CENTER);
        // Add component and make it span from column 2 and row 0 to column 3, and row 0
        gridLayout.addComponent(component3, 2, 0, 3, 0);
        gridLayout.setComponentAlignment(component3, Alignment.TOP_RIGHT);
        // Add component and make it span from column 4 and row 0 to column 5, and row 0
        gridLayout.addComponent(component4, 4,0,5, 0);
        gridLayout.setComponentAlignment(component4, Alignment.TOP_LEFT);
    }

}
