package edu.bdeb.a10.uber.DAL;


import java.sql.*;

public class DBConnector {

  //  private final String DB_HOST = "";
  //  private final String DB_NAME = "";
   // private final String DB_USER = "";
  //  private final String DB_PASSWORD = "";
  //  private final String DB_URL = "jdbc:mariadb://" + DB_HOST + "/" +DB_NAME;
    
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

