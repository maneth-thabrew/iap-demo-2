package lk.acpt_maneth.demo;

import com.mysql.cj.jdbc.Driver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicalViewController {

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtGears;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtPrice;

    @FXML
    void cancelBtn(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void saveBtn(ActionEvent event) {
        String brand = txtBrand.getText();
        String model = txtModel.getText();
        int gears = Integer.parseInt(txtGears.getText());
        double price = Double.parseDouble(txtPrice.getText());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iap_2", "root", "maneth2001");


            PreparedStatement preparedStatement = connection.prepareStatement("insert into vehicals (name,model,no_of_gears,price) values(?,?,?,?)");
            preparedStatement.setString(1, brand);
            preparedStatement.setString(2, model);
            preparedStatement.setInt(3, gears);
            preparedStatement.setDouble(4, price);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("Vehicle added successfully");
            }else {
                System.out.println("Vehicle could not be added");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
