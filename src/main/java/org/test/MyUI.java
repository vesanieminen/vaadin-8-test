package org.test;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.featurepack.util.V8Utils;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.textfield.TextField;

@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();

        final TextField name = new TextField();
        if (name instanceof HasLabel) {
			((HasLabel) name).setLabel("Type your name here:");
		}

        final Button button = addButton(layout, name);

        layout.add(name, button);

        V8Utils.setContent(this, layout);
    }

    private static Button addButton(VerticalLayout layout, TextField name) {
        Button button = new Button("Click Me");
        // FIXME:
        // The following line is kept the same:
        //      button.addClickListener((Button.ClickListener) e -> {
        // The problem is that Flow doesn't have Button.ClickListener but rather ComponentEventListener
        button.addClickListener((Button.ClickListener) e -> {
            layout.add(new Html("Thanks " + name.getValue() + ", it works!"));
        });
        return button;
    }

}
