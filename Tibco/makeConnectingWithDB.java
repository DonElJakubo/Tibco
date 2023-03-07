package rekru.rozmowy.Tibco;


//Tworzenie połączenia z bazą danych:


// Importowanie klasy do obsługi bazy danych
import java.sql.*;

public class makeConnectingWithDB {
    // Tworzenie połączenia z bazą danych
    Connection connection = null;
        try {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydatabase",
                "myuser",
                "mypassword");
    } catch (SQLException e) {
        System.out.println("Błąd przy tworzeniu połączenia z bazą danych.");
        e.printStackTrace();
    }

}
