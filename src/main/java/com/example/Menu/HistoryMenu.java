package com.example.Menu;

import com.example.Menu.ButtonsTemplates.ItemsButton;

import javax.swing.*;
import java.awt.*;

public class HistoryMenu extends JPanel {
	HistoryMenu() {
		this.setPreferredSize(new Dimension(300, 1000));

		ItemsButton lastWeek = new ItemsButton("Last Week");
		ItemsButton lastMonth = new ItemsButton("Last Month");
		ItemsButton lastHalfYear = new ItemsButton("Last Half Year");
		ItemsButton lastYear = new ItemsButton("Last Year");
		ItemsButton custom = new ItemsButton("Custom");

		lastWeek.setBounds(0, 0, 300, 50);
		lastMonth.setBounds(0, 50, 300, 50);
		lastHalfYear.setBounds(0, 100, 300, 50);
		lastYear.setBounds(0, 150, 300, 50);
		custom.setBounds(0, 200, 300, 50);

		this.add(lastWeek);
		this.add(lastMonth);
		this.add(lastHalfYear);
		this.add(lastYear);
		this.add(custom);
	}
}
