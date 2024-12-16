package org.maven.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Obtenemos la URL, el usuario y la contraseña
    private static final String URL = System.getProperty("db.url");
    private static final String USER = System.getProperty("db.user");
    private static final String PASSWORD = System.getProperty("db.password");

    // Creamos la función que nos devolvera esas variables
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}