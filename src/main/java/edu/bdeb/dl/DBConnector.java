package edu.bdeb.a10.uber.DAL;


import java.sql.*;

public class DBConnector {

    private final String DB_HOST = "mysql-bdebuser.alwaysdata.net:3306";
    private final String DB_NAME = "bdebuser_a10bd";
    private final String DB_USER = "bdebuser_a10user";
    private final String DB_PASSWORD = "A10BdeB2024";
    private final String DB_URL = "jdbc:mariadb://" + DB_HOST + "/" +DB_NAME;
    // ConnectionString: jdbc:mariadb://mysql-bdebuser.alwaysdata.net:3306/bdebuser_a10bd
    private Connection connection = null;

    private static DBConnector instance = null;

    public static DBConnector getInstance() {
        if (DBConnector.instance == null)
            DBConnector.instance = new DBConnector();
        return DBConnector.instance;
    }

    private DBConnector() {
        //load connection infos from properties file
        try {
            this.connection = DriverManager.getConnection(this.DB_URL, this.DB_USER, this.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}

