package com.example.Content_Panels;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class Today extends JPanel {

	int activeLines = 100; 

	public Today() {
		this.setLayout(new BorderLayout()); // Use BorderLayout for overall layout

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

		// Adding date label with custom design
		LocalDate todayDate = LocalDate.now();
		String day = String.valueOf(todayDate.getDayOfMonth());
		
		String month = todayDate.getMonth().toString().toLowerCase();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		
		JLabel dateLabel = new JLabel(day + " " + month);
		dateLabel.setForeground(new Color(115, 150, 200));
		dateLabel.setFont(new Font("Annai MN", Font.BOLD, 20));
		dateLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		contentPanel.add(dateLabel);

		// Adding tasks with custom design
		CheckBoxIcon needToDoneCheck = new CheckBoxIcon("needToDone");

		for (int i = 0; i < activeLines; i++) {
			JCheckBox checkBox = new JCheckBox();
			checkBox.setIcon(needToDoneCheck);
			checkBox.setText("Test #" + i);
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(true);
			checkBox.setAlignmentX(Component.LEFT_ALIGNMENT);
			contentPanel.add(checkBox);
		}

		// Add contentPanel to a JScrollPane
		JScrollPane scrollPane = new JScrollPane(contentPanel);
		this.add(scrollPane, BorderLayout.CENTER);

		contentPanel.setBackground(new Color(39, 64, 96)); 
	}
}
