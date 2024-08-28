package org.test;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();

        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        final Button button = addButton(layout, name);

        layout.addComponents(name, button);

        setContent(layout);
    }

    private static Button addButton(VerticalLayout layout, TextField name) {
        Button button = new Button("Click Me");
        // FIXME:
        // The following line is kept the same:
        //      button.addClickListener((Button.ClickListener) e -> {
        // The problem is that Flow doesn't have Button.ClickListener but rather ComponentEventListener
        button.addClickListener((Button.ClickListener) e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() + ", it works!"));
        });
        return button;
    }

}
