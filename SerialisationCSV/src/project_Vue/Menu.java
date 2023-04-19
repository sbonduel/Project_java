package project_Vue;

import java.awt.*;
import javax.swing.*;

public class Menu {
    private JMenuBar menuBar;
    private JMenu menu;

    public Menu() {
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuBar.add(menu);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public JMenu getMenu() {
        return menu;
    }
}
