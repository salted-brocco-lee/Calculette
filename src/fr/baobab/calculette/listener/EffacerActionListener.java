package fr.baobab.calculette.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.baobab.calculette.controller.CalculetteApplication;

public class EffacerActionListener implements ActionListener {
	private final CalculetteApplication calculetteApplication;

	public EffacerActionListener(CalculetteApplication calculetteApplication) {
		this.calculetteApplication = calculetteApplication;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculetteApplication.effacer();
	}

}
