public class Notification {
    private String type;
    private String contenu;
    private Utilisateur destinataire;

    public void envoyer() {
        System.out.println("Notification envoy e : " + type + " - " + contenu + " - " + destinataire.getNom());
    }
}
