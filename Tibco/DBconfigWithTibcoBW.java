package rekru.rozmowy.Tibco;

import java.sql.*;
import com.tibco.plugin.jdbc.JDBCConnection;


//Konfiguracja połączenia z bazą danych przy użyciu Tibco BusinessWorks
public class DBconfigWithTibcoBW  {
    private JDBCConnection connection;

    public void init() throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "myuser";
        String password = "mypassword";
        String driver = "com.mysql.jdbc.Driver";
        connection = new JDBCConnection(url, user, password, driver);
        connection.connect();
    }

    public ResultSet executeQuery(String sql) throws Exception {
        PreparedStatement statement = connection.prepareStatement(sql);
        return statement.executeQuery();
    }

    public void close() throws Exception {
        connection.disconnect();
    }
}


