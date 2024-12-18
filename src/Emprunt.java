public class Emprunt {
    private int id;
    private Utilisateur utilisateur;
    private Livre livre;
    private String dateEmprunts;
    private String LimiteDuree;

    public int CalculeDeRetard(){
        return 0;
    }

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public Utilisateur getUtilisateur() {
    return utilisateur;
}

public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
}

public Livre getLivre() {
    return livre;
}

public void setLivre(Livre livre) {
    this.livre = livre;
}

public String getDateEmprunts() {
    return dateEmprunts;
}

public void setDateEmprunts(String dateEmprunts) {
    this.dateEmprunts = dateEmprunts;
}

public String getLimiteDuree() {
    return LimiteDuree;
}

public void setLimiteDuree(String limiteDuree) {
    LimiteDuree = limiteDuree;
}
}
