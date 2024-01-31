package com.example;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel {
	JPanel AgendaMenu;
	JPanel SpacesMenu;
	JPanel HistoryMenu;
	JPanel AnalyticsMenu;
	JPanel SettingsMenu;

	JPanel currentPanel;

	Menu() {
		this.setPreferredSize(new Dimension(300, 1000));
		this.setBackground(new Color(39, 64, 96));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// ===== Initialization PANELS in Menu ===== //

		// ========== AGENDA Menu ========== //
		AgendaMenu = new JPanel();
		AgendaMenu.setPreferredSize(new Dimension(300, 1000));
		AgendaMenu.setBackground(new Color(39, 64, 96));
		AgendaMenu.setLayout(new BoxLayout(AgendaMenu, BoxLayout.Y_AXIS));

		// Agenda Buttons
		MenuButton today = new MenuButton("Today");
		MenuButton tomorrow = new MenuButton("Tomorrow");
		MenuButton nextWeek = new MenuButton("Next Week");

		AgendaMenu.add(today);
		AgendaMenu.add(tomorrow);
		AgendaMenu.add(nextWeek);

		// ========== SPACES Menu ========== //
		SpacesMenu = new JPanel();
		SpacesMenu.setPreferredSize(new Dimension(300, 1000));
		SpacesMenu.setBackground(new Color(39, 64, 96));
		SpacesMenu.setLayout(new BoxLayout(SpacesMenu, BoxLayout.Y_AXIS));

		// Spaces Buttons
		MenuButton everytimeTask = new MenuButton("EveryTime Task");
		MenuButton newSpace = new MenuButton("+ Create Space");

		SpacesMenu.add(everytimeTask);
		SpacesMenu.add(newSpace);

		// ========== HISTORY Menu ========== //
		HistoryMenu = new JPanel();
		HistoryMenu.setPreferredSize(new Dimension(300, 1000));
		HistoryMenu.setBackground(new Color(39, 64, 96));
		HistoryMenu.setLayout(new BoxLayout(HistoryMenu, BoxLayout.Y_AXIS));

		// History Buttons
		MenuButton lastWeek = new MenuButton("Last Week");
		MenuButton lastMonth = new MenuButton("Last Month");
		MenuButton lastHalfYear = new MenuButton("Last Half Year");
		MenuButton lastYear = new MenuButton("Last Year");
		MenuButton custom = new MenuButton("Custom");

		HistoryMenu.add(lastWeek);
		HistoryMenu.add(lastMonth);
		HistoryMenu.add(lastHalfYear);
		HistoryMenu.add(lastYear);
		HistoryMenu.add(custom);

		// ========== ANALYTICS Menu ========== //
		AnalyticsMenu = new JPanel();
		AnalyticsMenu.setPreferredSize(new Dimension(300, 1000));
		AnalyticsMenu.setBackground(new Color(39, 64, 96));
		AnalyticsMenu.setLayout(new BoxLayout(AnalyticsMenu, BoxLayout.Y_AXIS));

		// Analytics Buttons
		MenuButton done = new MenuButton("Done");
		MenuButton discipline = new MenuButton("Discipline");

		AnalyticsMenu.add(done);
		AnalyticsMenu.add(discipline);

		// ========== SETTINGS Menu ========== //
		SettingsMenu = new JPanel();
		SettingsMenu.setPreferredSize(new Dimension(300, 1000));
		SettingsMenu.setBackground(new Color(39, 64, 96));
		SettingsMenu.setLayout(new BoxLayout(SettingsMenu, BoxLayout.Y_AXIS));

		// Setting Button
		MenuButton interfaceApp = new MenuButton("Interface");

		SettingsMenu.add(interfaceApp);
	}

	// Change the panels
	public void setCurrentPanel(JPanel newPanel) {
		if (currentPanel != null) {
			this.remove(currentPanel);
		}
		if (newPanel != null) {
			this.add(newPanel);
			currentPanel = newPanel;
			revalidate();
			repaint();
		}
	}

}

// ========== BUTTON TEMPLATE ========== //
class MenuButton extends JButton {

	Border emptyBorder = BorderFactory.createEmptyBorder(5, 5, 5, 0);
	Border roundBorder = new RoundBorder(8);

	CompoundBorder finalButtonBorder = new CompoundBorder(emptyBorder, roundBorder);

	MenuButton(String name) {
		this.setText(name);
		this.setForeground(new Color(255, 255, 255));
		this.setFont(new Font("dfgvhbj", Font.PLAIN, 20));
		this.setMaximumSize(new Dimension(295, 50));
		this.setBorder(finalButtonBorder);
		this.addMouseListener(new ButtonMouseListener());
	}

	// ========== BUTTON BORDER ========== //
	public static class RoundBorder extends AbstractBorder {
		private int radius;

		public RoundBorder(int radius) {
			this.radius = radius;
		}

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			Graphics2D g2d = (Graphics2D) g.create();

			int strokeWidth = 2; // Adjust this value to set the thickness of the border
			g2d.setStroke(new BasicStroke(strokeWidth));

			g2d.drawRoundRect(x + strokeWidth / 2, y + strokeWidth / 2,
					width - strokeWidth, height - strokeWidth,
					radius, radius);

			g2d.dispose();
		}

		// Set all 4 margins(left, top, right, bottom) to the value of radius
		@Override
		public Insets getBorderInsets(Component c, Insets insets) {
			insets.left = insets.top = insets.right = insets.bottom = radius;
			return insets;
		}
	}

	// ========== BUTTON ANIMATION ========== //
	private class ButtonMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			MenuButton button = (MenuButton) e.getSource();
			button.setForeground(new Color(5, 205, 5));
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			MenuButton button = (MenuButton) e.getSource();
			button.setForeground(new Color(255, 255, 255));

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			MenuButton button = (MenuButton) e.getSource();
			button.setForeground(new Color(150, 150, 150));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			MenuButton button = (MenuButton) e.getSource();
			button.setForeground(new Color(255, 255, 255));
		}
	}
}
