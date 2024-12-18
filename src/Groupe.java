public class Groupe {
    private int id;
    private String nomGroupe;
    private Utilisateur[] membres;
    private String type;

    public void ajouterMembre(Utilisateur membre) {

    }

    public void afficherMembres() {
        System.out.println("Groupe: " + nomGroupe);
        System.out.println("Type: " + type);
        for (Utilisateur membre : membres) {
            System.out.println("Membre: " + membre.getNom());
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Utilisateur[] getMembres() {
        return membres;
    }

    public void setMembres(Utilisateur[] membres) {
        this.membres = membres;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
