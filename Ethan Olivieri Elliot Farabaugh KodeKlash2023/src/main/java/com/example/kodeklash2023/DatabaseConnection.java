package com.example.kodeklash2023;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection
{
    public Connection databaseLink;

    public Connection getConnection()
    {
        String databaseName = "kodeklash";
        String databaseUser = "root";
        String databasePassword = "CP4school!";
        String url = "jdbc:mysql://127.0.0.1:3306/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return databaseLink;
    }
}
