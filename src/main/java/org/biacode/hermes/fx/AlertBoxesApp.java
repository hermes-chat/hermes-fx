package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static org.biacode.hermes.fx.AlertBox.display;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 12:09 AM
 */
public class AlertBoxesApp extends Application {

    private Stage stage;

    private Button button;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");
        button = new Button("Click me!!!");
        button.setOnAction(event -> display("HermesChat Modal", "From main window"));
        final StackPane layout = new StackPane();
        layout.getChildren().add(button);
        final Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


