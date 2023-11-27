package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BarreSupérieure extends JPanel{

    public BarreSupérieure() {
        // Ajoute une barre de 3 boutons collés à gauche
        JButton bouton1 = new JButton("Accueil");
        JButton bouton2 = new JButton("Joueurs");
        JButton bouton3 = new JButton("Tournois");
        add(bouton1);
        add(bouton2);
        add(bouton3);
    }

}
