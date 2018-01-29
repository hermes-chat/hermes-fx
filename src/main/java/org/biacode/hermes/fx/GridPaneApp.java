package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 6:45 PM
 */
public class GridPaneApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");

        final GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        final Label usernameLabel = new Label("Username");
        GridPane.setConstraints(usernameLabel, 0, 0);
        final TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");
        GridPane.setConstraints(usernameTextField, 1, 0);

        final Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel, 0, 1);
        final TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("password");
        GridPane.setConstraints(passwordTextField, 1, 1);

        final Button submitButton = new Button("Login");
        GridPane.setConstraints(submitButton, 0, 2);

        gridPane.getChildren().addAll(
                usernameLabel, usernameTextField,
                passwordLabel, passwordTextField,
                submitButton
        );

        final Scene scene = new Scene(gridPane, 300, 300);
        stage.setScene(scene);
        stage.setTitle("HermesChat");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
