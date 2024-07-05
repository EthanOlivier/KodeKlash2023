package com.example.kodeklash2023;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController
{
    @FXML
    private Label lblUsername;
    public void onbtnConnectClick()
    {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String connectQuery = "SELECT `User Name` FROM users;";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);
            while (queryOutput.next())
            {
                lblUsername.setText(queryOutput.getString("User Name"));
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}