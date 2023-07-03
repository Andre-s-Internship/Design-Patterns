package org.example.CreationalPatterns.Singleton;

public class DatabaseConnection {
    //No need for connecting to database several times in the project for accessing or mutating data from repo classes,
    // that's why DatabaseConnection can be Singleton
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
