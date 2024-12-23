public class Admin extends Utilisateur {


    public Admin(int id, String nom, String motDePasse, int numero, String email,Catalogue catalogue,Livre livre) {
        super(id,nom, motDePasse, numero, email,catalogue, livre);

    }

    public void ajouterLivre(Livre livre){
        getCatalogue().ajouterLivre(livre);
    }

}
