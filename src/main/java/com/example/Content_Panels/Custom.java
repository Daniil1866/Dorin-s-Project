package com.example.Content_Panels;

import javax.swing.*;
import java.awt.*;

public class Custom extends JPanel {
	public Custom() {

		this.setBackground(new Color(55, 80, 107));

		JLabel customLabel = new JLabel("custom page");

		this.add(customLabel);

	}
}
