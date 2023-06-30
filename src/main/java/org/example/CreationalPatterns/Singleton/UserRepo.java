package org.example.CreationalPatterns.Singleton;

public class UserRepo {
    //get the connection instance and work with it in repository classes
    DatabaseConnection dbConnection = DatabaseConnection.getInstance();

}
