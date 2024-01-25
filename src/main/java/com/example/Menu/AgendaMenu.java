package com.example.Menu;

import com.example.Menu.ButtonsTemplates.ItemsButton;

import javax.swing.*;
import java.awt.*;

public class AgendaMenu extends JPanel {

	public AgendaMenu() {
		this.setPreferredSize(new Dimension(300, 1000));

		ItemsButton today = new ItemsButton("Today");
		ItemsButton tomorrow = new ItemsButton("Tomorrow");
		ItemsButton nextWeek = new ItemsButton("Next Week");

		today.setBounds(0, 0, 300, 50);
		tomorrow.setBounds(0, 50, 300, 50);
		nextWeek.setBounds(0, 100, 300, 50);

		this.add(today);
		this.add(tomorrow);
		this.add(nextWeek);

	}
}
