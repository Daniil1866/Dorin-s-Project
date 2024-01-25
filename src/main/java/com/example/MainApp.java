package com.example;

import javax.swing.*;
import java.awt.*;

import com.example.Menu.Menu;
import com.example.SuperMenu.SuperMenu;

public class MainApp extends JFrame {

	private int wPosition;

	public MainApp() {
		this.setTitle("TO DO");
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		SuperMenu superMenu = new SuperMenu();

		JPanel content = new JPanel();
		content.setBackground(new Color(39, 64, 96));
		content.setLayout(new BorderLayout());

		Menu menu = new Menu(this);

		content.add(menu, BorderLayout.WEST);

		this.add(content, BorderLayout.CENTER);
		this.add(superMenu, BorderLayout.WEST);
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		g2D.setPaint(new Color(100, 100, 100));
		g2D.setStroke(new BasicStroke(1));

		g2D.drawLine(70, 0, 70, getHeight());
		g2D.drawLine(wPosition, 0, wPosition, getHeight());

	}

	public void switchLinePosition(int newPosition) {
		wPosition = newPosition;
		repaint();
	}
}
