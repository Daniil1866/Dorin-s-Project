package com.example;

import javax.swing.*;
import java.awt.*;

public class Content extends JPanel {

	JPanel TodayContent;
	JPanel TomorrowContent;
	JPanel NextWeekContent;
	JPanel EveryTimeContent;
	JPanel NewSpaceContent;
	JPanel LastWeekContent;
	JPanel LastMonthContent;
	JPanel LastHalfYearContent;
	JPanel LastYearContent;
	JPanel CustomContent;
	JPanel DoneContent;
	JPanel DisciplineContent;
	JPanel InterfaceAppContent;

	JPanel currentContentPanel;

	Content() {
		this.setBackground(new Color(55, 80, 107));

		// ===== Initialization PANELS in Content ===== //

		// ========== AGENDA Menu ========== //

		// ========== TODAY PANEL ========== //
		TodayContent = new JPanel();
		TodayContent.setBackground(new Color(55, 80, 107));

		JLabel todayLabel = new JLabel("today page");

		TodayContent.add(todayLabel);

		// ========== TOMORROW PANEL ========== //
		TomorrowContent = new JPanel();
		TomorrowContent.setBackground(new Color(55, 80, 107));

		JLabel tomorrowLabel = new JLabel("tomorrow page");

		TomorrowContent.add(tomorrowLabel);

		// ========== NEXT WEEK PANEL ========== //
		NextWeekContent = new JPanel();
		NextWeekContent.setBackground(new Color(55, 80, 107));

		JLabel nextWeekLabel = new JLabel("nextWeek page");

		NextWeekContent.add(nextWeekLabel);

		// ========== SPACES Menu ========== //

		// ========== EVERY TIME PANEL ========== //
		EveryTimeContent = new JPanel();
		EveryTimeContent.setBackground(new Color(55, 80, 107));

		JLabel everyTimeLabel = new JLabel("everyTime page");

		EveryTimeContent.add(everyTimeLabel);

		// ========== NEW SPACE PANEL ========== //
		NewSpaceContent = new JPanel();
		NewSpaceContent.setBackground(new Color(55, 80, 107));

		JLabel newSpaceLabel = new JLabel("newSpace page");

		NewSpaceContent.add(newSpaceLabel);

		// ========== HISTORY Menu ========== //

		// ========== LAST WEEK PANEL ========== //
		LastWeekContent = new JPanel();
		LastWeekContent.setBackground(new Color(55, 80, 107));

		JLabel lastWeekLabel = new JLabel("lastWeek page");

		LastWeekContent.add(lastWeekLabel);

		// ========== LAST MONTH PANEL ========== //
		LastMonthContent = new JPanel();
		LastMonthContent.setBackground(new Color(55, 80, 107));

		JLabel lastMonthLabel = new JLabel("lastMonth page");

		LastMonthContent.add(lastMonthLabel);

		// ========== LAST HALF YEAR PANEL ========== //
		LastHalfYearContent = new JPanel();
		LastHalfYearContent.setBackground(new Color(55, 80, 107));

		JLabel lastHalfYearLabel = new JLabel("lastHalfYear page");

		LastHalfYearContent.add(lastHalfYearLabel);

		// ========== LAST YEAR PANEL ========== //
		LastYearContent = new JPanel();
		LastYearContent.setBackground(new Color(55, 80, 107));

		JLabel lastYearLabel = new JLabel("lastYear page");

		LastYearContent.add(lastYearLabel);

		// ========== CUSTOM PANEL ========== //
		CustomContent = new JPanel();
		CustomContent.setBackground(new Color(55, 80, 107));

		JLabel customLabel = new JLabel("custom page");

		CustomContent.add(customLabel);

		// ========== ANALYTICS Menu ========== //

		// ========== DONE PANEL ========== //
		DoneContent = new JPanel();
		DoneContent.setBackground(new Color(55, 80, 107));

		JLabel doneLabel = new JLabel("done page");

		DoneContent.add(doneLabel);

		// ========== DISCIPLINE PANEL ========== //
		DisciplineContent = new JPanel();
		DisciplineContent.setBackground(new Color(55, 80, 107));

		JLabel disciplineLabel = new JLabel("discipline page");

		DisciplineContent.add(disciplineLabel);

		// ========== SETTINGS Menu ========== //

		// ========== INTERFACE APP PANEL ========== //
		InterfaceAppContent = new JPanel();
		InterfaceAppContent.setBackground(new Color(55, 80, 107));

		JLabel interfaceAppLabel = new JLabel("interfaceApp page");

		InterfaceAppContent.add(interfaceAppLabel);

		this.add(TodayContent);
		this.add(TomorrowContent);
		this.add(NextWeekContent);
		this.add(EveryTimeContent);
		this.add(NewSpaceContent);
		this.add(LastWeekContent);
		this.add(LastMonthContent);
		this.add(LastHalfYearContent);
		this.add(LastYearContent);
		this.add(CustomContent);
		this.add(DoneContent);
		this.add(DisciplineContent);
		this.add(InterfaceAppContent);

	}

	// Change the panels
	public void setCurrentContentPanel(JPanel newPanel) {
		if (currentContentPanel != null) {
			this.remove(currentContentPanel);
		}
		if (newPanel != null) {
			this.add(newPanel);
			currentContentPanel = newPanel;
			revalidate();
			repaint();
		}
	}
}
