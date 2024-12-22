import java.util.ArrayList;

public class Groupe {
    private int id;
    private String nomGroupe;
    private ArrayList<Utilisateur> membres = new ArrayList<>();
    private String type;



    public void ajouterMembre(Utilisateur membre) {
        for (Utilisateur membreExistant : membres) {
            if (membreExistant.getNom().equals(membre.getNom())) {
                System.out.println("Le membre " + membre.getNom() + " est déjà dans le groupe.");
                return; // Sortir si le membre existe déjà
            }
        }
        membres.add(membre);
        System.out.println("Le membre " + membre.getNom() + " a été ajouté au groupe.");
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

    public ArrayList<Utilisateur> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<Utilisateur> membres) {
        this.membres = membres;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
