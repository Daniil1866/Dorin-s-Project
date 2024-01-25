package com.example.Menu;

import com.example.Menu.ButtonsTemplates.ItemsButton;

import javax.swing.*;
import java.awt.*;

public class SettingsMenu extends JPanel {
	SettingsMenu() {
		this.setPreferredSize(new Dimension(300, 1000));

		ItemsButton interfaceApp = new ItemsButton("Interface");

		interfaceApp.setBounds(0, 0, 300, 50);

		this.add(interfaceApp);
	}
}
