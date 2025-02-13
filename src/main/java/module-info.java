module lk.acpt_maneth.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens lk.acpt_maneth.demo to javafx.fxml;
    exports lk.acpt_maneth.demo;
}