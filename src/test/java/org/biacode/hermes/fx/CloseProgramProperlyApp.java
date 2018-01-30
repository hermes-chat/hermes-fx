package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.biacode.hermes.fx.util.ConfirmBox;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 6:23 PM
 */
public class CloseProgramProperlyApp extends Application {

    private Stage stage;

    private Button closeButton = new Button("Close program");

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");
        stage.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });
        closeButton.setOnAction(event -> closeProgram());
        final StackPane layout = new StackPane();
        layout.getChildren().addAll(closeButton);
        final Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void closeProgram() {
        System.out.println("Closing the program...");
        final boolean answer = ConfirmBox.display("Title", "Are you sure want to close?");
        if (answer) stage.close();
    }
}
