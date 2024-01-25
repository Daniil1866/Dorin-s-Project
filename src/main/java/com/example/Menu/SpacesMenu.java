package com.example.Menu;

import com.example.Menu.ButtonsTemplates.ItemsButton;

import javax.swing.*;
import java.awt.*;

public class SpacesMenu extends JPanel {
	SpacesMenu() {
		this.setPreferredSize(new Dimension(300, 1000));

		ItemsButton everytimeTask = new ItemsButton("EveryTime Task");
		ItemsButton newSpace = new ItemsButton("+ Create Space");

		everytimeTask.setBounds(0, 0, 300, 50);
		everytimeTask.setBounds(0, 50, 300, 50);

		this.add(everytimeTask);
		this.add(newSpace);
	}
}
