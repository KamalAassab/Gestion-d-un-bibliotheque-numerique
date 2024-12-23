import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Catalogue
        Catalogue catalogue = new Catalogue();

        // Step 2: Create some books (Livres)
        Livre livre1 = new Livre(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "A novel set in the 1920s.", true);
        Livre livre2 = new Livre(2, "1984", "George Orwell", "Dystopian", "A novel about a totalitarian regime.", true);
        Livre livre3 = new Livre(3, "To Kill a Mockingbird", "Harper Lee", "Fiction", "A novel about racial injustice.", false);

        // Step 3: Add books to the catalogue and insert into the database
        catalogue.ajouterLivre(livre1);
        DatabaseConnection.insertLivre(livre1);

        catalogue.ajouterLivre(livre2);
        DatabaseConnection.insertLivre(livre2);

        catalogue.ajouterLivre(livre3);
        DatabaseConnection.insertLivre(livre3);

        // Step 4: Create an Admin
        Admin admin = new Admin(1, "AdminUser ", "adminPass", 123456789, "admin@example.com", catalogue, null);

        // Step 5: Admin adds a new book
        Livre livre4 = new Livre(4, "Brave New World", "Aldous Huxley", "Dystopian", "A novel about a futuristic society.", true);
        admin.ajouterLivre(livre4);
        DatabaseConnection.insertLivre(livre4); // Insert into database

        // Step 6: Admin searches for a book by title
        Livre foundLivre = catalogue.rechercheLivre("1984");
        if (foundLivre != null) {
            System.out.println("Found book: " + foundLivre.getTitre());
        } else {
            System.out.println("Book not found.");
        }

        // Step 7: Admin searches for books by author
        ArrayList<Livre> livresByAuthor = catalogue.rechercheParAuteur("Harper Lee");
        System.out.println("Books by Harper Lee:");
        for (Livre livre : livresByAuthor) {
            System.out.println(livre.getTitre());
        }

        // Step 8: Create a Reader (Lecteur)
        Lecteur lecteur = new Lecteur(2, "ReaderUser ", "readerPass", 987654321, "reader@example.com", catalogue, null);

        // Step 9: Reader searches for a book by genre
        ArrayList<Livre> livresByGenre = catalogue.rechercheParGenre("Dystopian");
        System.out.println("Dystopian books:");
        for (Livre livre : livresByGenre) {
            System.out.println(livre.getTitre());
        }

        // Step 10: Reader comments on a book
        lecteur.commenter(livre1, "An amazing read!");
        lecteur.noter(livre1, 5);

        // Step 11: Create a Borrow (Emprunt)
        Emprunt emprunt = new Emprunt(lecteur, livre1, LocalDate.now());
        lecteur.ajouterEmprunt(livre1); // Add to borrow history
        System.out.println("Emprunt created for: " + emprunt.getLivre().getTitre());

        // Step 12: Create a Reservation
        Reservation reservation = new Reservation(lecteur, LocalDate.now(), 1); // Example reservation
        reservation.afficherInfosReservation();

        // Step 13: Display the current catalogue
        System.out.println("Current Catalogue:");
        catalogue.afficherCatalogue();

        // Step 14: Check for any errors in database insertion
        // This can be done by checking the database directly or by observing console outputs.
    }
}