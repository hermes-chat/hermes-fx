package org.biacode.hermes.fx.util;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 12:45 AM
 */
public class ConfirmBox {

    private static boolean answer;

    private static Button yesButton = new Button("Yes");
    private static Button noButton = new Button("No");

    private ConfirmBox() {
    }

    public static boolean display(final String title, final String message) {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMinWidth(250);

        yesButton.setOnAction(event -> {
            answer = true;
            stage.close();
        });
        noButton.setOnAction(event -> {
            answer = false;
            stage.close();
        });
        final Label label = new Label(message);

        final VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        final Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.showAndWait();
        return answer;
    }
}
