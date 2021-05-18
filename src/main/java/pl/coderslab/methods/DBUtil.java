package pl.coderslab.methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String WORKSHOP2_URL = "jdbc:mysql://localhost:3306/Workshop2?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "coderslab";

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(WORKSHOP2_URL,USER_NAME,PASSWORD);
        return conn;
    }


}
