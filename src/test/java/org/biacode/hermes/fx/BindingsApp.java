package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 12:25 AM
 */
public class BindingsApp extends Application {
    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");
        final VBox layout = new VBox(10);

        //region Integer bindings
        final IntegerProperty x = new SimpleIntegerProperty(3);
        final IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x.multiply(10));

        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue() + "\n");

        x.setValue(9);
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue());
        //endregion

        //region text file real time update
        final TextField textField = new TextField();
        textField.setMaxWidth(200);

        final Label firstLabel = new Label("Welcome to the site ");
        final Label secondLabel = new Label("");

        final HBox hBox = new HBox(firstLabel, secondLabel);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(textField, hBox);

        secondLabel.textProperty().bind(textField.textProperty());
        //endregion

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}