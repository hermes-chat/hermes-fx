package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 7:46 PM
 */
public class ExtractAndValidateInputApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final TextField textField = new TextField();
        textField.setPromptText("Age");
        final Button button = new Button("Submit");
        button.setOnAction(event -> {
            if (isInt(textField.getText())) {
                System.out.println(textField.getText());
            } else {
                System.out.println("Wrong age");
            }
        });


        final VBox layout = new VBox();
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(textField, button);

        final Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    private boolean isInt(final String textValue) {
        try {
            Integer.parseInt(textValue);
            return true;
        } catch (final NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
