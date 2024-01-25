package com.example.Menu;

import com.example.Menu.ButtonsTemplates.ItemsButton;

import javax.swing.*;
import java.awt.*;

public class AnaliticsMenu extends JPanel {
	AnaliticsMenu() {
		this.setPreferredSize(new Dimension(300, 1000));

		ItemsButton done = new ItemsButton("Done");
		ItemsButton discipline = new ItemsButton("Discipline");

		done.setBounds(0, 0, 300, 50);
		discipline.setBounds(0, 50, 300, 50);

		this.add(done);
		this.add(discipline);
	}
}
