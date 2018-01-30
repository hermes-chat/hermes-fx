package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 8:13 PM
 */
public class ChoiceBoxApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));


        final ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll(
                "Apples",
                "Bananas",
                "Oranges",
                "Bacon",
                "Ham",
                "Meatballs"
        );
        choiceBox.setValue(choiceBox.getItems().get(0));

        final Button button = new Button("Click me!!!");
        button.setOnAction(event -> {
            final String choice = getChoice(choiceBox);
            System.out.println("Selected food - " + choice);
            layout.getChildren().addAll(new Label("Selected food - " + choice));
        });

        layout.getChildren().addAll(button, choiceBox);

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    private String getChoice(final ChoiceBox<String> choiceBox) {
        return choiceBox.getValue();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
