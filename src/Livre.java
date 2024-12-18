public class Livre extends Document{
    private String resume;
    private boolean disponibilite;

    public void afficherDetaille() {
        System.out.println("Résumé: " + resume);
        System.out.println("Disponibilité: " + (disponibilite ? "Disponible" : "Indisponible"));
    }


    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public boolean estDisponible() {
        return disponibilite; // getDisponibilité
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

}
