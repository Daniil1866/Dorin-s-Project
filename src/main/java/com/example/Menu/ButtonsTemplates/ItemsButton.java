package com.example.Menu.ButtonsTemplates;

import javax.swing.*;
import javax.swing.border.*;

public class ItemsButton extends JButton {
	Border buttonBorder = BorderFactory.createEmptyBorder();

	public ItemsButton(String buttonName) {
		this.setText(buttonName);
		this.setBorder(buttonBorder);
		this.setBounds(0, 0, 300, 50);
	}

}
