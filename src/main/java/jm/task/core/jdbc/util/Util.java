package jm.task.core.jdbc.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Util {

    private static final String dbURL = "jdbc:mysql://localhost:3306/kata113";
    private static final String dbUserName = "root";
    private static final String dbPassword = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
        } catch (SQLException | ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
