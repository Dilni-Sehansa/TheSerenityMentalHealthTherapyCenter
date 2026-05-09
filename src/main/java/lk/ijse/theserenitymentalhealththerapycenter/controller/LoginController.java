package lk.ijse.theserenitymentalhealththerapycenter.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lk.ijse.theserenitymentalhealththerapycenter.HelloApplication;

import java.io.IOException;

public class LoginController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    @FXML
    private void login() throws IOException {
        String username = userName.getText().trim();
        String userPassword = password.getText();

        System.out.println("Login attempt: " + username + " - " + password);

        if ("admin".equals(username) && "1234".equals(userPassword)) {
            HelloApplication.setRoot("Patient");

        } else {
            new Alert(Alert.AlertType.ERROR,
                    "Invalid username or password!",
                    javafx.scene.control.ButtonType.OK).show();
            userName.clear();
            password.clear();
            userName.requestFocus();
        }
    }
}


