public class Reservation {
    private String dateReservation;
    private int id_Utilisateur;
    private int id_reservation;


public void afficherInfosReservation() {
    System.out.println("ID de la réservation: " + id_reservation);
    System.out.println("Date de la réservation: " + dateReservation);
    System.out.println("ID de l'utilisateur: " + id_Utilisateur);
}
}
