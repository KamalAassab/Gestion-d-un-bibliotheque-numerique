import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/biblio";
    private static final String USER = "root";
    private static final String PASSWORD = "test";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Methodes pour inserer des donnees dans les tables

    // Insertion d'un livre
    public static void insertLivre(Livre livre) {
        String query = "INSERT INTO livre (id_livre, titre, auteur, genre, resume_livre, disponibilite) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, livre.getId());
            preparedStatement.setString(2, livre.getTitre());
            preparedStatement.setString(3, livre.getAuteur());
            preparedStatement.setString(4, livre.getGenre());
            preparedStatement.setString(5, livre.getResume());
            preparedStatement.setBoolean(6, livre.estDisponible());
            preparedStatement.executeUpdate();
            System.out.println("Le livre est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion du livre: " + e.getMessage());
        }
    }

    // Insertion d'un utilisateur
    public static void insertUtilisateur(Utilisateur utilisateur) {
        String query = "INSERT INTO utilisateur (id_utilisateur, nom, motDePasse, numero, email, role_utilisateur) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1,utilisateur.getId());
            preparedStatement.setString(2, utilisateur.getNom());
            preparedStatement.setString(3, utilisateur.getMotdepasse());
            preparedStatement.setInt(4, utilisateur.getNumero());
            preparedStatement.setString(5, utilisateur.getEmail());
            preparedStatement.setString(6, utilisateur.getRole());
            preparedStatement.executeUpdate();
            System.out.println("Utilisateur est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion d'utilisateur: " + e.getMessage());
        }
    }

    // Insertion d'un admin
    public static void insertAdmin(Admin admin, Utilisateur utilisateur) {
        insertUtilisateur(admin); // Insert into Utilisateur table first
        String query = "INSERT INTO admin (id_admin, id_utilisateur) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setInt(2, utilisateur.getId());
            preparedStatement.executeUpdate();
            System.out.println("Admin est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion d'admin: " + e.getMessage());
        }
    }

    // Insertion d'un lecteur
    public static void insertLecteur(Lecteur lecteur, Utilisateur utilisateur) {
        insertUtilisateur(lecteur); // Insert into Utilisateur table first
        String query = "INSERT INTO lecteur (id_lecteur, id_utilisateur) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, lecteur.getId());
            preparedStatement.setInt(2, utilisateur.getId());
            preparedStatement.executeUpdate();
            System.out.println("Lecteur est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion du lecteur: " + e.getMessage());
        }
    }

    // Insertion d'un emprunt
    public static void insertEmprunt(Emprunt emprunt) {
        String query = "INSERT INTO emprunt (id_emprunt, id_utilisateur, id_livre, dateEmprunts, dateRetour) VALUES (?, ?, ?, ?,?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, emprunt.getId());
            preparedStatement.setInt(2, emprunt.getUtilisateur().getId());
            preparedStatement.setInt(3, emprunt.getLivre().getId());
            preparedStatement.setDate(4, java.sql.Date.valueOf(emprunt.getDateEmprunts()));
            preparedStatement.setDate(5, java.sql.Date.valueOf(emprunt.getDateRetour()));
            preparedStatement.executeUpdate();
            System.out.println("Emprunt est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion d'emprunt: " + e.getMessage());
        }
    }

    // Insertion d'une reservation
    public static void insertReservation(Reservation reservation, Utilisateur utilisateur) {
        String query = "INSERT INTO reservation (id_reservation, id_utilisateur, dateReservation) VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, reservation.getId_reservation());
            preparedStatement.setInt(2, utilisateur.getId());
            preparedStatement.setDate(3, java.sql.Date.valueOf(reservation.getDateReservation()));
            preparedStatement.executeUpdate();
            System.out.println("Reservation est insérré avec succé.");
        } catch (SQLException e) {
            System.out.println("Erreur d'insertion d'une reservation: " + e.getMessage());
        }
    }
}