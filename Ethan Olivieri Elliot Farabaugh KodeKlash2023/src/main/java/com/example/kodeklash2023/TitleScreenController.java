package com.example.kodeklash2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TitleScreenController
{
    @FXML
    private Button btnExit;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnOne;
    @FXML
    private Button btnTwo;
    @FXML
    private VBox vbxMain;
    @FXML
    private Button btnBack;

    public void onbtnExitClick()
    {
        System.exit(0);
    }

    public void onbtnStartClick()
    {
        btnOne.setVisible(true);
        btnTwo.setVisible(true);
        btnStart.setVisible(false);
        btnBack.setVisible(true);
        vbxMain.setStyle("-fx-background-color: #D600FF");
    }

    public void onbtnOneClick(ActionEvent event) throws IOException
    {
        Stage stage;
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onbtnTwoClick(ActionEvent event) throws  IOException
    {
        Stage stage;
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void onbtnBackClick()
    {
        btnOne.setVisible(false);
        btnTwo.setVisible(false);
        btnStart.setVisible(true);
        btnBack.setVisible(false);
        vbxMain.setStyle("-fx-background-color: #FFFFFF");
    }
    public void startHoverbtnExit(){btnExit.setStyle("-fx-background-color: #FF3C3C");}
    public void stopHoverbtnExit(){btnExit.setStyle("-fx-background-color: #DAFF00");}
    public void startHoverbtnStart(){btnStart.setStyle("-fx-background-color: #FF3C3C");}
    public void stopHoverbtnStart(){btnStart.setStyle("-fx-background-color: #DAFF00");}
    public void startHoverbtnOne(){btnOne.setStyle("-fx-background-color: #FF3C3C");}
    public void stopHoverbtnOne(){btnOne.setStyle("-fx-background-color: #DAFF00");}
    public void startHoverbtnTwo(){btnTwo.setStyle("-fx-background-color: #FF3C3C");}
    public void stopHoverbtnTwo(){btnTwo.setStyle("-fx-background-color: #DAFF00");}
    public void startHoverbtnBack(){btnBack.setStyle("-fx-background-color: #FF3C3C");}
    public void stopHoverbtnBack(){btnBack.setStyle("-fx-background-color: #DAFF00");}
}