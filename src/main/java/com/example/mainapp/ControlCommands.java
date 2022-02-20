package com.example.mainapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ControlCommands {
    @FXML
    private TextField nameField;
    @FXML
    private TextField id;
    @FXML
    private TextField mailaddress;

    public void InfoInFile() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Informations/info.txt", true));
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        String name, idNo, mail;
        name = nameField.getText();
        idNo = id.getText();
        mail = mailaddress.getText();
        printWriter.append(name).append("___").append(idNo).append("___").append(mail).append("\n");
        bufferedWriter.close();
        printWriter.close();
        nameField.setText("");
        id.setText("");
        mailaddress.setText("");
    }

    public void EnterKeyPressed(KeyEvent keyEvent) throws IOException {
        InfoInFile();
    }

    public void onSentButtonClick(ActionEvent actionEvent) throws IOException {
        InfoInFile();
    }

    public void onAgreed(ActionEvent actionEvent) {
    }
}