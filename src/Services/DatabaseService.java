package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
     protected static Connection contexto = null;
    
    public DatabaseService() throws ClassNotFoundException, SQLException {
        Class.forName(DatabaseConfig.driver);

        contexto = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.usuario, DatabaseConfig.senha);           
    }
}
