package org.test;

import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;

public class MyOtherView extends MyAbstractView {

    private void test() {
        final MyFirstView components1 = new MyFirstView();
        final MenuBar.Command test = components1.test(new Label(), new MenuBar());
    }

}
