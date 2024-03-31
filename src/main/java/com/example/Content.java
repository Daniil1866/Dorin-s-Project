package com.example;

import javax.swing.*;
import java.awt.*;

import com.example.Content_Panels.*;

public class Content extends JPanel {

	Today TodayContent;
	Tomorrow TomorrowContent;
	NextWeek NextWeekContent;
	EveryTime EveryTimeContent;
	NewSpace NewSpaceContent;
	LastWeek LastWeekContent;
	LastMonth LastMonthContent;
	LastHalfYear LastHalfYearContent;
	LastYear LastYearContent;
	Custom CustomContent;
	Done DoneContent;
	Discipline DisciplineContent;
	InterfaceApp InterfaceAppContent;

	JPanel currentContentPanel;

	Content() {
		this.setBackground(new Color(55, 80, 107));

		// ===== Initialization of PANELS in Content ===== //

		// ========== AGENDA Menu ========== //
		TodayContent = new Today();
		TomorrowContent = new Tomorrow();
		NextWeekContent = new NextWeek();

		// ========== SPACES Menu ========== //
		EveryTimeContent = new EveryTime();
		NewSpaceContent = new NewSpace();

		// ========== HISTORY Menu ========== //
		LastWeekContent = new LastWeek();
		LastMonthContent = new LastMonth();
		LastHalfYearContent = new LastHalfYear();
		LastYearContent = new LastYear();
		CustomContent = new Custom();

		// ========== ANALYTICS Menu ========== //
		DoneContent = new Done();
		DisciplineContent = new Discipline();

		// ========== SETTINGS Menu ========== //
		InterfaceAppContent = new InterfaceApp();

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
