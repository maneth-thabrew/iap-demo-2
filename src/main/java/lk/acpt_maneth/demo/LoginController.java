package lk.acpt_maneth.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void login(ActionEvent event) {
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        if(email.equals("admin") && password.equals("admin")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Status");
            alert.setHeaderText(null);
            alert.setContentText("Login Successful");
            alert.show();
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Status");
            alert.setHeaderText(null);
            alert.setContentText("Invalid email or password");
            alert.show();
        }
    }
}
