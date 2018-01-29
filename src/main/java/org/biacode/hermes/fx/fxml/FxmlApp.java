package org.biacode.hermes.fx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 12:41 AM
 */
public class FxmlApp extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass()
                        .getClassLoader()
                        .getResource("sample.fxml")
        ));
        primaryStage.setTitle("HermesChat");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
