public class Admin extends Utilisateur {
   private Catalogue catalogue;

    public Admin(int id, String nom, String motDePasse, int numero, String email,Catalogue catalogue) {
        super(id,nom, motDePasse, numero, email);
        this.catalogue = catalogue;
    }

    public void ajouterLivre(Livre livre){
        catalogue.ajouterLivre(livre);
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
