package com.example.Content_Panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Today extends JPanel {
	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int activeLines = 3;
	int completedLines = 2;

	JButton buttonCheckBox;
	ImageIcon doneIcon;
	ImageIcon not_doneIcon;

	public Today() {
		this.setBackground(new Color(55, 80, 107));
		this.setLayout(null);

		JLabel todayLabel = new JLabel("Today");
		todayLabel.setForeground(new Color(255, 255, 255));
		todayLabel.setFont(new Font("American Typewriter", Font.BOLD, 60));
		todayLabel.setBounds(70, 60, 200, 80);

		// ===== Date, need SQL ===== //
		JLabel date = new JLabel("25");
		date.setText("25" + " " + "December");
		date.setForeground(new Color(115, 150, 200));
		date.setFont(new Font("Annai MN", Font.BOLD, 20));
		date.setHorizontalAlignment(JLabel.CENTER);
		date.setBounds(70, 138, 180, 25);

		JLabel active = new JLabel("Active");
		active.setForeground(new Color(200, 190, 25));
		active.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				active.setBounds(getWidth() / 7, 180, 100, 40);
			}
		});

		CheckBoxIcon needToDoneCheck = new CheckBoxIcon("needToDone");

		for (int i = 1; i < activeLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			checkBox.setIcon(needToDoneCheck);

			checkBox.setText("Test");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 180 + lines * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		JButton addTask = new JButton("+ add Task");
		addTask.setForeground(new Color(150, 180, 235));
		addTask.setFont(new Font("Chalkboard SE", Font.BOLD, 25));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				addTask.setBounds(getWidth() / 7 - 10, 240 + (activeLines - 1) * 55, 150, 25);
			}
		});
		addTask.setBorder(emptyBorder);

		JLabel completed = new JLabel("Completed");
		completed.setForeground(new Color(50, 190, 25));
		completed.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				completed.setBounds(getWidth() / 7, 350 + (activeLines - 1) * 55, 150, 40);
			}
		});

		CheckBoxIcon doneCheck = new CheckBoxIcon("done");

		for (int i = 1; i < completedLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			checkBox.setIcon(doneCheck);

			checkBox.setText("Test");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 460 + lines * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		this.add(todayLabel);
		this.add(date);
		this.add(active);
		this.add(addTask);
		this.add(completed);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		g2D.setPaint(new Color(120, 160, 190));
		g2D.setStroke(new BasicStroke(1));

		int activeLine = 230;
		int completedLine = 400;

		for (int i = 0; i < activeLines; i++) {
			g2D.drawLine(getWidth() / 7, activeLine + i * 55,
					getWidth() - getWidth() / 7, activeLine + i * 55);
		}

		for (int i = 0; i < completedLines; i++) {
			g2D.drawLine(getWidth() / 7, completedLine + (activeLines + i - 1) * 55,
					getWidth() - getWidth() / 7,
					completedLine + (activeLines + i - 1) * 55);
		}
	}
}

class CheckBoxIcon extends ImageIcon {
	HashMap<String, ImageIcon> checkIcons = new HashMap<>();

	ImageIcon doneIcon = resizeImage("src/main/resources/Img/CheckBox/done.png", 25, 25);
	ImageIcon needToDoneIcon = resizeImage("src/main/resources/Img/CheckBox/needToDone.png", 25, 25);

	CheckBoxIcon(String name) {
		checkIcons.put("done", doneIcon);
		checkIcons.put("needToDone", needToDoneIcon);

		setImageIcon(checkIcons.get(name));
	}

	void setImageIcon(ImageIcon icon) {
		if (icon != null) {
			this.setImage(icon.getImage());
		}
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