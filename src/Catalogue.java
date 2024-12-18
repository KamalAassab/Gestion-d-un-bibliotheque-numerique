import java.util.ArrayList;

public class Catalogue {
    private Livre[] listeLivres;

    public Livre[] rechercheLivre(String titre) {
        Livre[] resultats = new Livre[0];
        for (Livre livre : listeLivres) {
            if (livre.getTitre().contains(titre)) {
                resultats = ajouter(resultats, livre);
            }
        }
        return resultats;
    }

    public Livre[] rechercheParAuteur(String auteur) {
        Livre[] resultats = new Livre[0];
        for (Livre livre : listeLivres) {
            if (livre.getAuteur().contains(auteur)) {
                resultats = ajouter(resultats, livre);
            }
        }
        return resultats;
    }

    public Livre[] rechercheParGenre(String genre) {
        Livre[] resultats = new Livre[0];
        for (Livre livre : listeLivres) {
            if (livre.getGenre().contains(genre)) {
                resultats = ajouter(resultats, livre);
            }
        }
        return resultats;
    }





    private Livre[] ajouter(Livre[] tab, Livre element) {
        Livre[] nouveauTab = new Livre[tab.length + 1];
        System.arraycopy(tab, 0, nouveauTab, 0, tab.length);
        nouveauTab[tab.length] = element;
        return nouveauTab;
    }
}
