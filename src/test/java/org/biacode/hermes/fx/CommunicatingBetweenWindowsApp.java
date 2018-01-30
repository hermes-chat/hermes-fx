package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static org.biacode.hermes.fx.util.ConfirmBox.display;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 12:30 AM
 */
public class CommunicatingBetweenWindowsApp extends Application {

    private Stage stage;

    private Button button;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");

        final StackPane layout = new StackPane();

        button = new Button("Click me!!!");
        button.setOnAction(event -> {
            final boolean answerResult = display(
                    "HermesChat Modal",
                    "Are you sure?"
            );
            final Label answerLabel = new Label("The answer is - " + (answerResult ? "Yes" : "No"));
            layout.getChildren().add(answerLabel);
        });
        layout.getChildren().add(button);

        final Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

