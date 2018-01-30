package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 8:01 PM
 */
public class CheckBoxApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        final CheckBox box1 = new CheckBox("Bacon");
        final CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        final Button button = new Button("Order now");
        button.setOnAction(event -> {
            final String message = handleCheckBoxOptions(box1, box2);
            layout.getChildren().add(new Label(message));
        });
        layout.getChildren().addAll(button, box1, box2);

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    private String handleCheckBoxOptions(final CheckBox box1, final CheckBox box2) {
        final StringBuilder builder = new StringBuilder();
        if (box1.isSelected()) {
            builder.append(box1.getText() + " is selected");
            System.out.println(box1.getText() + " is selected");
        }
        if (box2.isSelected()) {
            builder.append(box2.getText() + " is selected");
            System.out.println(box2.getText() + " is selected");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
