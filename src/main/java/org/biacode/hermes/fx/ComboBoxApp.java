package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 8:31 PM
 */
public class ComboBoxApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        final ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setEditable(true);
        comboBox.getItems().addAll(
                "Apples",
                "Bananas",
                "Oranges",
                "Bacon",
                "Ham",
                "Meatballs"
        );
        comboBox.setPromptText("Select your food");
        comboBox.setOnAction(event -> layout
                .getChildren()
                .add(new Label("Selected food is: " + comboBox.getValue()))
        );

        final Button button = new Button("Click me!!!");
        button.setOnAction(event -> layout
                .getChildren()
                .add(new Label("Selected food is: " + comboBox.getValue()))
        );

        layout.getChildren().addAll(button, comboBox);
        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
