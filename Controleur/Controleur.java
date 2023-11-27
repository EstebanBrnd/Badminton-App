package Controleur;

import Vue.Appli;

public class Controleur {
    private static Controleur instance = null;

    Appli app;

    public Controleur(Appli fenetre) {
        app = fenetre;
        instance = this;
    }

    public static Controleur getInstance() {
        if (instance == null) {
            return null;
        }
        return instance;
    }

    public void afficherAccueil() {
        app.changeContent(new Vue.Accueil());
    }
}
