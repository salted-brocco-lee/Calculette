package fr.baobab.calculette.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.baobab.calculette.controller.CalculetteApplication;

public class AjouterActionListener implements ActionListener {
	private final CalculetteApplication app;

	public AjouterActionListener(CalculetteApplication app) {
		this.app = app;
	}

	public void actionPerformed(ActionEvent e) {
		this.app.ajouter();
	}
}
