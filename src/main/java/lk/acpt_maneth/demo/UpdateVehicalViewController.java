package lk.acpt_maneth.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.*;

public class UpdateVehicalViewController {
    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtGears;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtSearch;

    @FXML
    void cancelBtn(ActionEvent event) {

    }

    @FXML
    void searchBtn(ActionEvent event) {


        int id = Integer.parseInt(txtSearch.getText());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iap_2", "root", "maneth2001");


            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM vehicals WHERE id=?");
            preparedStatement.setObject(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();




           if (resultSet.next()) {

               txtBrand.setText(resultSet.getString(2));
               txtModel.setText(resultSet.getString(3));
               txtGears.setText(String.valueOf(resultSet.getInt(4)));
               txtPrice.setText(String.valueOf(resultSet.getDouble(5)));
           }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void updateBtn(ActionEvent event) {
        int id = Integer.parseInt(txtSearch.getText());
        String brand = txtBrand.getText();
        String model = txtModel.getText();
        int gears = Integer.parseInt(txtGears.getText());
        double price = Double.parseDouble(txtPrice.getText());

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iap_2", "root", "maneth2001");
            PreparedStatement preparedStatement = connection.prepareStatement("update vehicals set name = ? , model = ? , no_of_gears = ?, price = ? where id = ? ");

            preparedStatement.setObject(1, brand);
            preparedStatement.setObject(2, model);
            preparedStatement.setObject(3, gears);
            preparedStatement.setObject(4, price);
            preparedStatement.setObject(5, id);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("Vehicle Updated successfully");
            }else {
                System.out.println("Vehicle could not be Updated");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
