package fr.baobab.calculette.view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class MonPanel extends JPanel {

	private JToolBar toolBar;
	private JTextField texteField;

	private void mettreEnPage() {
		setLayout(new BorderLayout());
		// barre d’outils à gauche de l’écran
		add(toolBar, BorderLayout.WEST);
		// On ajoute le champ de l'éditeur,
		// avec en plus des ascenceurs.
		add(new JScrollPane(texteField), BorderLayout.CENTER);
	}
}
