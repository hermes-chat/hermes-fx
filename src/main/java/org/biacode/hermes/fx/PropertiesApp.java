package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.biacode.hermes.fx.model.Person;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 11:57 PM
 */
public class PropertiesApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final Person person = new Person();
        person.firstNameProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Name changed to: " + newValue);
            System.out.println("firstNameProperty" + person.firstNameProperty());
            System.out.println("getFirstName()" + person.getFirstName());
        });

        final Button button = new Button("Submit");
        button.setOnAction(event -> person.setFirstName("Arsen"));

        final StackPane layout = new StackPane();
        layout.getChildren().add(button);
        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
