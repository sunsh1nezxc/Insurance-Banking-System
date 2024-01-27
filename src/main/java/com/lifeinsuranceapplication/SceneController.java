package com.lifeinsuranceapplication;

import database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    public void switchToSceneRegisterPage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneLoginPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
<<<<<<< HEAD
=======

    public void loginCheck(ActionEvent actionEvent) {
        System.out.print(Database.checkLoginPassword(loginField.getText(), passwordField.getText()));
    }
>>>>>>> 154c8c419a51365e12e8068eef011b62d38deaf0
}
