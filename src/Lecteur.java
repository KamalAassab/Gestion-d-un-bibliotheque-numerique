public class Lecteur extends Utilisateur{

    private Catalogue catalogue;
    private Livre livre;

    public Lecteur(int id, String nom, String motDePasse, int numero, String email, Catalogue catalogue, Livre livre) {
        super(id, nom, motDePasse, numero, email);
        this.catalogue = catalogue;
        this.livre = livre;
    }

    public void rechercheLivre(String titre){
        catalogue.rechercheLivre(titre);
    }
    public void rechercheParAuteur(String auteur){
        catalogue.rechercheParAuteur(auteur);
    }
    public void rechercheParGenre(String genre){
        catalogue.rechercheParGenre(genre);
    }
}
