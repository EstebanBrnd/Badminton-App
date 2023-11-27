package Vue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Accueil extends JPanel{

    BarreSupérieure barreSupérieure = new BarreSupérieure();

    public Accueil() {
        // Ajoute l'image de fond et s'adapte à la taille de la fenêtre meme si elle est redimensionnée
        setLayout(new BorderLayout());
        barreSupérieure = new BarreSupérieure();
        add(barreSupérieure, BorderLayout.NORTH);
        add(new JLabel("\nAccueil"), BorderLayout.CENTER);
        add(new JLabel("BAS DE PAGE"), BorderLayout.SOUTH);

    }
    
}
