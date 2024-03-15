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
		this.setMinimumSize(new Dimension(700, 380));

		content = new Content();
		menu = new Menu(content);
		superMenu = new SuperMenu(menu);

		content.setLayout(new BorderLayout());
		content.add(menu, BorderLayout.WEST);
		content.setCurrentContentPanel(content.TodayContent);

		this.add(superMenu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
