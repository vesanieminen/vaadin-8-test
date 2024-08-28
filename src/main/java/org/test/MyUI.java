package org.test;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
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

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue()
                    + ", it works!"));
        });

        layout.addComponents(name, button);

        addMenuBar(layout);

        setContent(layout);

    }

    private static void addMenuBar(VerticalLayout layout) {
        MenuBar barmenu = new MenuBar();
        layout.addComponent(barmenu);

        MenuBar.MenuItem drinks = barmenu.addItem("Beverages", null, null);
        drinks.addSeparator();
        drinks.addItem("Quit Drinking", null, null);
    }

    public MenuBar.Command test(MenuBar menuBar) {
        return null;
    }


}
