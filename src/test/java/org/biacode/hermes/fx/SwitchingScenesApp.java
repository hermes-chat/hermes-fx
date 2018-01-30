package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 12:00 AM
 */
public class SwitchingScenesApp extends Application {

    private Stage stage;

    private Scene scene1, scene2;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        // stage 1
        final Label label1 = new Label("Welcome to the scene 1");
        final Button button1 = new Button("Go to scene 2");
        button1.setOnAction(event -> {
            stage.setScene(scene2);
        });
        final VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);
        // stage 2
        final Label label2 = new Label("Welcome to the scene 2");
        final Button button2 = new Button("Go to scene 1");
        button2.setOnAction(event -> {
            stage.setScene(scene1);
        });
        final StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 600, 300);
        stage.setTitle("HermesChat");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
