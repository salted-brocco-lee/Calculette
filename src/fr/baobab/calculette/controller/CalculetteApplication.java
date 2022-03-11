package fr.baobab.calculette.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.JFrame;

import fr.baobab.calculette.listener.AjouterActionListener;
import fr.baobab.calculette.listener.EffacerActionListener;
import fr.baobab.calculette.view.JPanneauCalculette;

public class CalculetteApplication {
	private JPanneauCalculette ui;
	private double somme; // modèle !

	public CalculetteApplication() {
		ui = new JPanneauCalculette();
		activer();
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setVisible(true);
	}

	void setSomme(double somme) {
		this.somme = somme;
		ui.getResultatField().setText("" + somme);
	}

	public void ajouter() {
		double val = Double.parseDouble(ui.getNombre1Field().getText());
		setSomme(somme + val);
	}

	public void effacer() {
		ui.getNombre1Field().setText("0");
		setSomme(0.0);
	}

	private void activer() {
//		ui.getAjouterButton().addActionListener(new AjouterActionListener(this));
//		ui.getEffacerButton().addActionListener(new EffacerActionListener(this));
		ui.getAjouterButton().addActionListener(
				EventHandler.create(ActionListener.class, this, "ajouter"));
		ui.getEffacerButton().addActionListener(
				EventHandler.create(ActionListener.class, this, "effacer"));
		
	}
}
