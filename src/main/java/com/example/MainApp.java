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

		content = new Content();
		menu = new Menu(content);
		superMenu = new SuperMenu(menu);

		content.setLayout(new BorderLayout());
		content.add(menu, BorderLayout.WEST);

		this.add(superMenu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		g2D.setPaint(new Color(255, 255, 255));
		g2D.setStroke(new BasicStroke(1));

		g2D.drawLine(70, 0, 70, getHeight());
		g2D.drawLine(370, 0, 370, getHeight());

	}
}
