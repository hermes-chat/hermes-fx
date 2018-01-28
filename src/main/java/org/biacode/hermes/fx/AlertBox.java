package org.biacode.hermes.fx;

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
 * Time: 12:32 AM
 */
class AlertBox {
    public static void display(final String title, final String message) {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMinWidth(250);
        final Label label = new Label(message);
        final Button button = new Button("Close window");
        button.setOnAction(event -> stage.close());
        final VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        final Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
