package com.example.Content_Panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Tomorrow extends JPanel {
	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int activeLines = 7;

	JButton buttonCheckBox;

	public Tomorrow() {
		this.setBackground(new Color(55, 80, 107));
		this.setLayout(null);

		JLabel tomorrowLabel = new JLabel("Tomorrow");
		tomorrowLabel.setForeground(new Color(255, 255, 255));
		tomorrowLabel.setFont(new Font("American Typewriter", Font.BOLD, 60));
		tomorrowLabel.setBounds(70, 60, 330, 80);
		// tomorrowLabel.setBorder(border);

		// ===== Date, need SQL ===== //
		JLabel date = new JLabel("26");
		date.setText("26" + " " + "May");
		date.setForeground(new Color(115, 150, 200));
		date.setFont(new Font("Annai MN", Font.BOLD, 20));
		date.setHorizontalAlignment(JLabel.CENTER);
		date.setBounds(70, 128, 330, 30);
		// date.setBorder(border);

		JLabel active = new JLabel("Active");
		active.setForeground(new Color(200, 190, 25));
		active.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				active.setBounds(getWidth() / 7, 180, 100, 40);
			}
		});

		CheckBoxIcon futureTaskCheck = new CheckBoxIcon("futureTask");

		for (int i = 1; i < activeLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			checkBox.setIcon(futureTaskCheck);

			checkBox.setText("  Test");
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

		this.add(tomorrowLabel);
		this.add(date);
		this.add(active);
		this.add(addTask);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		g2D.setPaint(new Color(120, 160, 190));
		g2D.setStroke(new BasicStroke(1));

		int activeLine = 230;

		for (int i = 0; i < activeLines; i++) {
			g2D.drawLine(getWidth() / 7, activeLine + i * 55,
					getWidth() - getWidth() / 7, activeLine + i * 55);
		}
	}
}