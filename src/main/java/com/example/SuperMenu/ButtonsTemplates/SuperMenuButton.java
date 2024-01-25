package com.example.SuperMenu.ButtonsTemplates;

import javax.swing.*;
import javax.swing.border.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class SuperMenuButton extends JButton {

	Border buttonBorder = BorderFactory.createEmptyBorder();

	HashMap<String, ImageIcon> superIcons = new HashMap<>();

	ImageIcon agendaIcon = resizeImage("src/main/resources/Img/agenda.png", 50, 50);
	ImageIcon spacesIcon = resizeImage("src/main/resources/Img/spaces.png", 50, 50);
	ImageIcon historyIcon = resizeImage("src/main/resources/Img/history.png", 50, 50);
	ImageIcon analyticsIcon = resizeImage("src/main/resources/Img/analytics.png", 50, 50);
	ImageIcon settingsIcon = resizeImage("src/main/resources/Img/settings.png", 50, 50);

	public SuperMenuButton(String imgName) {

		superIcons.put("agenda", agendaIcon);
		superIcons.put("spaces", spacesIcon);
		superIcons.put("history", historyIcon);
		superIcons.put("analytics", analyticsIcon);
		superIcons.put("settings", settingsIcon);

		this.setIcon(superIcons.get(imgName));
		this.setBorder(buttonBorder);
		this.setBounds(0, 0, 300, 40);
	}

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
