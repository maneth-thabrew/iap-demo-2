package lk.acpt_maneth.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteVehicalViewController {

    @FXML
    private TextField txtId;

    @FXML
    void cancelBtn(ActionEvent event) {

    }

    @FXML
    void deleteBtn(ActionEvent event) {

        int id = Integer.parseInt(txtId.getText());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iap_2", "root", "maneth2001");


            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM vehicals WHERE id=?");
            preparedStatement.setInt(1, id);


            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Vehical Deleted Successfully");
                alert.showAndWait();

            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Vehical could not be Deleted ");
                alert.showAndWait();
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    }


