package com.example;

import javax.swing.*;
import javax.swing.border.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class SuperMenu extends JPanel {

	private Menu panelMenu;

	SuperMenu(Menu panelM) {
		this.panelMenu = panelM;

		this.setBackground(new Color(27, 47, 69));
		this.setPreferredSize(new Dimension(70, 1000));
		this.setLayout(null);

		panelMenu.setCurrentMenuPanel(panelMenu.AgendaMenu);

		// ===== Initialization BUTTONS in SuperMenu ===== //
		// Agenda Button
		SuperMenuButton AgendaButton = new SuperMenuButton("agenda");
		AgendaButton.setBounds(0, 0, 68, 68);
		AgendaButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.AgendaMenu));

		// Spaces Button
		SuperMenuButton SpacesButton = new SuperMenuButton("spaces");
		SpacesButton.setBounds(0, 70, 68, 68);
		SpacesButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.SpacesMenu));

		// History Button
		SuperMenuButton HistoryButton = new SuperMenuButton("history");
		HistoryButton.setBounds(0, 140, 68, 68);
		HistoryButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.HistoryMenu));

		// Analytics Button
		SuperMenuButton AnalyticsButton = new SuperMenuButton("analytics");
		AnalyticsButton.setBounds(0, 210, 68, 68);
		AnalyticsButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.AnalyticsMenu));

		// Settings Button
		SuperMenuButton SettingsButton = new SuperMenuButton("settings");
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				SettingsButton.setBounds(0, getHeight() - 72, 66, 68);
			}
		});
		SettingsButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.SettingsMenu));

		this.add(AgendaButton);
		this.add(SpacesButton);
		this.add(HistoryButton);
		this.add(AnalyticsButton);
		this.add(SettingsButton);
	}
}

// ========== BUTTONS TEMPLATE ========== //
class SuperMenuButton extends JButton {

	Border buttonBorder = BorderFactory.createEmptyBorder();

	ImageIcon agendaIcon = resizeImage("src/main/resources/Img/SuperMenu/agenda.png", 50, 50);
	ImageIcon spacesIcon = resizeImage("src/main/resources/Img/SuperMenu/spaces.png", 50, 50);
	ImageIcon historyIcon = resizeImage("src/main/resources/Img/SuperMenu/history.png", 50, 50);
	ImageIcon analyticsIcon = resizeImage("src/main/resources/Img/SuperMenu/analytics.png", 50, 50);
	ImageIcon settingsIcon = resizeImage("src/main/resources/Img/SuperMenu/settings.png", 50, 50);

	HashMap<String, ImageIcon> superIcons = new HashMap<>();

	SuperMenuButton(String name) {
		superIcons.put("agenda", agendaIcon);
		superIcons.put("spaces", spacesIcon);
		superIcons.put("history", historyIcon);
		superIcons.put("analytics", analyticsIcon);
		superIcons.put("settings", settingsIcon);

		this.setIcon(superIcons.get(name));
		this.setBorder(buttonBorder);
	}

	// ===== Function for RESIZE Images ===== //
	public ImageIcon resizeImage(String imagePath, int width, int height) {
		try {
			BufferedImage originalImage = ImageIO.read(new File(imagePath));
			Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

			return new ImageIcon(resizedImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
