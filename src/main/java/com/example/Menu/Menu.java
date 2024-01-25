package com.example.Menu;

import com.example.MainApp;
import com.example.Menu.ButtonsTemplates.MenuButton;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

	private MainApp mainApp;

	AgendaMenu agendaMenu = new AgendaMenu();
	SpacesMenu spacesMenu = new SpacesMenu();
	HistoryMenu historyMenu = new HistoryMenu();
	AnaliticsMenu analiticsMenu = new AnaliticsMenu();
	SettingsMenu settingsMenu = new SettingsMenu();

	public Menu(MainApp mainApp) {
		this.mainApp = mainApp;
		this.setPreferredSize(new Dimension(300, 100));
		this.setBackground(new Color(39, 64, 96));
		// this.setLayout(new FlowLayout(FlowLayout.CENTER, 250, 10));
		this.setLayout(null);

		MenuButton Extend = new MenuButton("Extend", "extend");
		MenuButton Reduce = new MenuButton("Reduce", "reduce");

		Reduce.setBounds(270, 0, 30, 30);
		Extend.setBounds(0, 0, 30, 30);

		this.add(Reduce);
		this.mainApp.switchLinePosition(370);

		Reduce.addActionListener(
				(e) -> {
					this.setPreferredSize(new Dimension(50, 100));
					this.remove(Reduce);
					this.add(Extend);
					Extend.setBounds(0, 0, 30, 30);
					this.mainApp.switchLinePosition(100);
				});

		Extend.addActionListener(
				(e) -> {
					this.setPreferredSize(new Dimension(300, 100));
					this.remove(Extend);
					this.add(Reduce);
					Reduce.setBounds(270, 0, 30, 30);
					this.mainApp.switchLinePosition(370);
				});
	}
}
