package Vue;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;

import Controleur.Controleur;

import java.awt.Image;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ResourceBundle.Control;


public class PreMenu extends JPanel{

    ImageIcon imageFond = new ImageIcon("Img/welcome.jpeg");


    public PreMenu() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // Texte en blanc 
        JLabel label = new JLabel("Bienvenue sur Badminton APP");
        label.setForeground(java.awt.Color.WHITE);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Taille du texte en 30 avec la police par défaut
        label.setFont(label.getFont().deriveFont(25f));
        add(label);
        // Ajoute un bouton "ENTRER" en dessous du texte
        JButton bouton = new JButton("ENTRER");
        bouton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(bouton);

        bouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Controleur ctrl = Controleur.getInstance();
                ctrl.afficherAccueil();
            }
        });

        
    }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageFond.getImage(), 0, 0, getWidth(), getHeight(), this);
        // Ecrit le texte "BAS DE PAGE" en blanc en bas de la fenêtre
        g.setColor(java.awt.Color.WHITE);
        // Taille du texte Hauteur de la fenêtre / 120
        g.setFont(g.getFont().deriveFont(getHeight()/35f));
        g.drawString("Esteban Barneaud - 2023", getWidth()/160, getHeight()-getHeight()/120);

    }

}
