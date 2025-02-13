package lk.acpt_maneth.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("load-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

//    public static void main(String[] args) {
//        launch();
//        Vehical vehicle = new Vehical("01","toyota","prius");
//        System.out.println(vehicle.brand());
//    }


    /// ///// labda /////////////
//    CustomerController controller =() ->{
//        //logic
//    }
//
//    controller.play();
}