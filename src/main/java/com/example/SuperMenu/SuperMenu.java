package com.example.SuperMenu;

import javax.swing.*;

import java.awt.*;

public class SuperMenu extends JPanel {

	public SuperMenu() {
		this.setPreferredSize(new Dimension(70, 100));
		this.setBackground(new Color(27, 47, 69));
		// this.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 15));
		this.setLayout(null);

		SuperMenuButton Agenda = new SuperMenuButton("agenda");
		SuperMenuButton Spaces = new SuperMenuButton("spaces");
		SuperMenuButton History = new SuperMenuButton("history");
		SuperMenuButton Analytics = new SuperMenuButton("analytics");
		SuperMenuButton Settings = new SuperMenuButton("settings");

		Agenda.setBounds(0, 0, 68, 68);
		Spaces.setBounds(0, 70, 68, 68);
		History.setBounds(0, 140, 68, 68);
		Analytics.setBounds(0, 210, 68, 68);

		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Settings.setBounds(0, getHeight() - 72, 68, 68);
			}
		});

		this.add(Agenda);
		this.add(Spaces);
		this.add(History);
		this.add(Analytics);
		this.add(Settings);
	}
}
