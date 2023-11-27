import javax.naming.ldap.Control;
import javax.swing.SwingUtilities;
import Vue.Appli;
import Controleur.Controleur;


public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Appli fenetre = new Appli();
                Controleur controleur = new Controleur(fenetre);
            }
        });
    }
}
