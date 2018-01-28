package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
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