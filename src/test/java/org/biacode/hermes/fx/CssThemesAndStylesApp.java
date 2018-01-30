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
 * Time: 11:13 PM
 */
public class CssThemesAndStylesApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");

        final GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        final Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);
        usernameLabel.setId("bold-label");
        final TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");
        GridPane.setConstraints(usernameTextField, 1, 0);

        final Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);
        final TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("password");
        GridPane.setConstraints(passwordTextField, 1, 1);

        final Button loginButton = new Button("Login");
        loginButton.setOnAction(event -> setUserAgentStylesheet(STYLESHEET_CASPIAN));
        GridPane.setConstraints(loginButton, 1, 2);

        final Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton, 1, 3);

        gridPane.getChildren().addAll(
                usernameLabel, usernameTextField,
                passwordLabel, passwordTextField,
                loginButton, signUpButton
        );

        final Scene scene = new Scene(gridPane, 500, 600);
        scene.getStylesheets().add("Viper.css");
        stage.setScene(scene);
        stage.setTitle("HermesChat");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}