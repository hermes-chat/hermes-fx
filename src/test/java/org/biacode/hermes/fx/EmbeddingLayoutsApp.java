package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 6:36 PM
 */
public class EmbeddingLayoutsApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("HermesChat");

        final HBox topMenu = new HBox();
        final Button button1 = new Button("File");
        final Button button2 = new Button("Edit");
        final Button button3 = new Button("View");
        topMenu.getChildren().addAll(button1, button2, button3);

        final VBox leftMenu = new VBox();
        final Button button4 = new Button("Foo");
        final Button button5 = new Button("Bar");
        final Button button6 = new Button("Baz");
        leftMenu.getChildren().addAll(button4, button5, button6);

        final BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        final Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
