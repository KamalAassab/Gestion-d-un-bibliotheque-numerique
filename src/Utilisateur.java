import java.util.ArrayList;

public class Utilisateur {
    private int id;
    private String nom;
    private String motedepasse;
    private int numero;
    private int note;
    private String commentaire;
    private String email;
    private ArrayList<Livre> historiqueEmprunts ;



    public void ajouterEmprunt (Livre livre){
        historiqueEmprunts.add(livre);
    }

    public void creerListePersonnalise(){
        // A implementer
    }

    public void sInscrire(){
        // A implementer
    }

    public void seConnecter(){
        // A implementer
    }



    // getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotedepasse() {
        return motedepasse;
    }

    public void setMotedepasse(String motedepasse) {
        this.motedepasse = motedepasse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Livre> getHistoriqueEmprunts() {
        return historiqueEmprunts;
    }

    public void setHistoriqueEmprunts(ArrayList<Livre> historiqueEmprunts) {
        this.historiqueEmprunts = historiqueEmprunts;
    }

}
