package fr.baobab.calculette.view;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class JPanneauCalculette extends JFrame {
	private JTextField nombre1Field, resultatField;
	private JButton ajouterButton;
	private JButton effacerButton;

	public JPanneauCalculette() {
		nombre1Field = new JTextField(10);
		resultatField = new JTextField(10);
		resultatField.setEditable(false); // pas modifiable.
		ajouterButton = new JButton("+");
		effacerButton = new JButton("effacer");
		mettreEnPage();
	}
	
	private void mettreEnPage() {
		// On crée le conteneur.
		JPanel panel1 = new JPanel();
		// On fixe son "layout" : une grille de
		// 4 lignes et 1 colonnes.
		panel1.setLayout(new GridLayout(4,1));
		panel1.add(nombre1Field);
		panel1.add(ajouterButton);
		panel1.add(resultatField);
		panel1.add(effacerButton);
		this.add(panel1);// ajoute le panel à la frame.
//		JPanel panel2= new JPanel();
//		JTextField nomField = new JTextField(30);
//		JTextField prenomField = new JTextField(20);
//		panel2.setLayout(new MigLayout());
//		panel2.add(new JLabel("nom"));
//		panel2.add(nomField, "wrap");
//		panel2.add(new JLabel("prenom"));
//		panel2.add(prenomField);
//		add(panel2);
//		JPanel p= new JPanel();
//		p.setLayout(new GridBagLayout());
//		JTextField nomField = new JTextField(30);
//		JTextField prenomField = new JTextField(20);
//		GridBagConstraints cc = new GridBagConstraints();
//		cc.gridx = 0;
//		p.add(new JLabel("Nom"), cc); // ajoute en pos. 0,0
//		cc.gridx = 1;
//		p.add(nomField, cc); // ajoute en pos. 1,0
//		cc.gridx = 0; cc.gridy = 1;
//		p.add(new JLabel("Prenom"), cc); // pos. 0,1
//		cc.gridx = 1;
//		p.add(prenomField, cc); // ajoute en pos 1,1
//		// On fixe la taille de la frame :
//		add(p);
//		JPanel parent= new JPanel();
//		CardLayout layout= new CardLayout();
//		parent.setLayout(layout);
//		parent.add(panel1, "p1");
//		parent.add(panel2, "p2");
//		layout.show(parent, "p1");
//		add(parent);
		this.pack();
	}
	
	public JTextField getNombre1Field() {
		return nombre1Field;
	}
	
	public JTextField getResultatField() {
		return resultatField;
	}
	
	public JButton getAjouterButton() {
		return ajouterButton;
	}

	public JButton getEffacerButton() {
		return effacerButton;
	}
}
