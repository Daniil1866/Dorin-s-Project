package com.example.Menu;

import javax.swing.*;
import javax.swing.border.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class MenuButton extends JButton {

	Border buttonBorder = BorderFactory.createLineBorder(new Color(39, 64, 96), 1);

	HashMap<String, ImageIcon> Icons = new HashMap<>();

	ImageIcon extendIcon = resizeImage("src/main/resources/Img/menu_extends.png", 20, 20);
	ImageIcon reduceIcon = resizeImage("src/main/resources/Img/menu_reduce.png", 20, 20);

	MenuButton(String buttonName, String imgName) {

		Icons.put("extend", extendIcon);
		Icons.put("reduce", reduceIcon);

		this.setIcon(Icons.get(imgName));
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
