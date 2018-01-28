package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/28/18
 * Time: 11:41 PM
 */
public class MainApplication extends Application {

    private final Button button = new Button();

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("HermesChat");
        button.setText("Click me!!!");
        button.setOnAction(event -> {
            System.out.println("Hello, World! from - " + event.getSource());
        });
        final StackPane layout = new StackPane();
        layout.getChildren().add(button);
        final Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
