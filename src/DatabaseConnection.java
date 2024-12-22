import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/biblio"; // Change 'biblio' to your database name
    private static final String USER = "root"; // Default username for XAMPP
    private static final String PASSWORD = "test"; // Default password is empty for XAMPP

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void insertLivre(Livre livre) {
        String query = "INSERT INTO livre (titre, auteur, genre, resume, disponibilite) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, livre.getTitre());
            preparedStatement.setString(2, livre.getAuteur());
            preparedStatement.setString(3, livre.getGenre());
            preparedStatement.setString(4, livre.getResume());
            preparedStatement.setBoolean(5, livre.estDisponible());
            preparedStatement.executeUpdate();
            System.out.println("Livre inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting livre: " + e.getMessage());
        }
    }
}