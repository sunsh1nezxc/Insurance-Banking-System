package com.lifeinsuranceapplication;


import database.Database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FirlicoButton;

    @FXML
    private Label LabelAutorization;

    @FXML
    private Button UrLicoButton;

    @FXML
    private CheckBox checkPassword;

    @FXML
    private Label labelVhodTxt;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField loginField;

    @FXML
    private AnchorPane mainPanel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button registationButton;
    @FXML
    void loginTry(ActionEvent event) {
        System.out.print(Database.checkLoginPassword(loginField.getText(), passwordField.getText()));

    }

    @FXML
    void initialize() {
        assert FirlicoButton != null : "fx:id=\"FirlicoButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert LabelAutorization != null : "fx:id=\"LabelAutorization\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert UrLicoButton != null : "fx:id=\"UrLicoButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkPassword != null : "fx:id=\"checkPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert labelVhodTxt != null : "fx:id=\"labelVhodTxt\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginBtn != null : "fx:id=\"loginBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mainPanel != null : "fx:id=\"mainPanel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert registationButton != null : "fx:id=\"registationButton\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}