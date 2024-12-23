import java.time.LocalDate;

public class Reservation {
    //les attributs
    private LocalDate dateReservation;
    private Utilisateur utilisateur;
    private int id_reservation;
    //constructeurs
    public Reservation(Utilisateur utilisateur,LocalDate dateReservation,  int id_reservation) {
        this.utilisateur = utilisateur;
        this.dateReservation = dateReservation;
        this.id_reservation = id_reservation;
    }


public void afficherInfosReservation() {
    System.out.println("ID de la réservation: " + id_reservation);
    System.out.println("Date de la réservation: " + dateReservation);
    System.out.println("ID de l'utilisateur: " + utilisateur);
}
}
