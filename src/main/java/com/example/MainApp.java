package com.example;

import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {

	private SuperMenu superMenu;
	private Menu menu;
	private Content content;

	MainApp() {
		this.setTitle("TO DO");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		menu = new Menu();
		superMenu = new SuperMenu(menu);
		content = new Content();

		content.setLayout(new BorderLayout());
		content.add(menu, BorderLayout.WEST);

		this.add(superMenu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
