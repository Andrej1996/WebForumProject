package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    static final String DBMS_CONN_STRING = "jdbc:mysql://localhost:3306/forum_db?useSSL=false";
    static final String DBMS_USERNAME = "Andrej";
    static final String DBMS_PASSWORD = "12345";


    Connection conn = null;

    public Connection getConnection() throws SQLException {
        return open();
    }

    public Connection open() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(DBMS_CONN_STRING,
                    DBMS_USERNAME, DBMS_PASSWORD);
            System.out.println("OPEN CONNECTION");
        } else {
            System.out.println("RETURN EXISTING CONNECTION");
        }
        return conn;
    }

    public void close() throws SQLException {
        System.out.println("CLOSING CONNECTION");
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }
}
