package com.lifeinsuranceapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class QuizController {
    Boolean correctAnsFlag;
    private Label statusLabel=new Label();
    public void trueAns(ActionEvent actionEvent) {
    correctAnsFlag=true;
    }

    public void falseAns(ActionEvent actionEvent) throws IOException {
        correctAnsFlag=false;
    }

    public void sendAns(ActionEvent event) throws IOException {
        if(correctAnsFlag!=true){
            statusLabel.setText("Uncorrect");
            Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            statusLabel.setText("Correct!");
        }
    }
}
