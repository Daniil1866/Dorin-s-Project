package com.example.Content_Panels;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class CheckBoxIcon extends ImageIcon {
	HashMap<String, ImageIcon> checkIcons = new HashMap<>();

	ImageIcon doneIcon = resizeImage("src/main/resources/Img/CheckBox/done.png", 25, 25);
	ImageIcon needToDoneIcon = resizeImage("src/main/resources/Img/CheckBox/needToDone.png", 25, 25);
	ImageIcon futureTaskIcon = resizeImage("src/main/resources/Img/CheckBox/futureTask.png", 20, 20);

	CheckBoxIcon(String name) {
		checkIcons.put("done", doneIcon);
		checkIcons.put("needToDone", needToDoneIcon);
		checkIcons.put("futureTask", futureTaskIcon);

		setImageIcon(checkIcons.get(name));
	}

	void setImageIcon(ImageIcon icon) {
		if (icon != null) {
			this.setImage(addPaddingToIcon(icon.getImage(), 3, 0));
		}
	}

	private Image addPaddingToIcon(Image image, int paddingTop, int paddingBottom) {
		int width = image.getWidth(null);
		int height = image.getHeight(null) + paddingTop + paddingBottom;

		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = newImage.createGraphics();
		g2d.drawImage(image, 0, paddingTop, null);
		g2d.dispose();

		return newImage;
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
