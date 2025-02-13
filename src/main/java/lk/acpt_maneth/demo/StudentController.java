package lk.acpt_maneth.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StudentController {
    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    Student[] students = new Student[10];

    int count = 0;

    @FXML
    void save(ActionEvent event) {
        String name = txtName.getText();
        String id = txtId.getText();
        String email = txtEmail.getText();
        int number = Integer.parseInt(txtContact.getText());

        Student st = new Student(name, id, email, number);

        if (count<10) {
            students[count] = st;
            count++;
            System.out.println("Save Succesfull!!!");
        }else {
            System.out.println("Cant add more student");
    }
    }





}
