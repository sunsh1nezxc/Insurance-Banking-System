package com.lifeinsuranceapplication;

import database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    // Register page START
    @FXML
    private TextField passwordRegisterField;

    @FXML
    private TextField passwordRegisterFieldRepeat;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField IINReg;

    @FXML
    private TextField phoneNumberL;

    public void register(ActionEvent actionEvent) {
        if(!passwordRegisterField.getText().equals(passwordRegisterFieldRepeat.getText())){
            statusLabel.setText("Пароли не совпадают");
        }
        else{
            if(Database.checkIfUserExists(IINReg.getText()))
            {
                statusLabel.setText("Такой ИИН уже зарегистрирован");
                return;
            }
            if(!Database.checkIfPersonExists(IINReg.getText()))
            {
                statusLabel.setText("ИИН неверный");
            }
            else Database.newUserRegister(IINReg.getText(), passwordRegisterField.getText(), phoneNumberL.getText());
        }
    }
    // Register page END


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

    public void switchToSceneMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMewPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("medPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void choseFiles(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        FileChooser chose = new FileChooser();
        File file = chose.showOpenDialog(null);
    }

    public void loginCheck(ActionEvent actionEvent) {
        System.out.print(Database.checkLoginPassword(loginField.getText(), passwordField.getText()));
    }

    public void sendAns(ActionEvent actionEvent) throws  IOException{
    Parent root =FXMLLoader.load(getClass().getResource("eduMainPage"));
    System.out.print("Button pressed");
    }


}
