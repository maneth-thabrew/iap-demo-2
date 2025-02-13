package lk.acpt_maneth.demo;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoadViewController implements Initializable {
    @FXML
    private TableView<VehicalNew> tbl;

    public ArrayList<VehicalNew> loadData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iap_2", "root", "maneth2001");


            PreparedStatement preparedStatement = connection.prepareStatement("select * from vehicals");


                ResultSet resultSet = preparedStatement.executeQuery();

                ArrayList<VehicalNew> list = new ArrayList<>();

                while (resultSet.next()){
                    
                    list.add(new VehicalNew(
                            resultSet.getString("id"),
                            resultSet.getString("name"),
                            resultSet.getString("model"),
                            resultSet.getInt("no_of_gears"),
                            resultSet.getDouble("price")));
                }

                return list;

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
}
        }

    @FXML
    void btn(ActionEvent event) {


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tbl.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tbl.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("brand"));
        tbl.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("model"));
        tbl.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("no_of_gears"));
        tbl.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("price"));

        ArrayList<VehicalNew> vehicals = loadData();


        tbl.setItems(FXCollections.observableArrayList(vehicals));

    }
}
