package Vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Vue.Accueil;

public class Appli{

    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    JFrame fenetre;
    JPanel content;
    
    public Appli() {
        fenetre = new JFrame("Badminton APP");
        fenetre.setSize(WIDTH, HEIGHT);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        // Mini taille de la fenêtre
        fenetre.setMinimumSize(fenetre.getSize());

        content = new PreMenu();
        fenetre.add(content);
    }

    public void changeContent(JPanel newContent) {
        fenetre.remove(content);
        content = newContent;
        fenetre.add(content);
        fenetre.revalidate();
        fenetre.repaint();
    }


}
