package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 8:43 PM
 */
public class ListViewApp extends Application {

    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        final ListView<String> listView = new ListView<>();
        for (int i = 0; i < 4; i++) {
            listView.getItems().addAll(
                    "Apples",
                    "Bananas",
                    "Oranges",
                    "Bacon",
                    "Ham",
                    "Meatballs"
            );
        }
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        final Button button = new Button("Click me!!!");
        button.setOnAction(event -> {
            final ObservableList<String> selectedItems = listView.getSelectionModel().getSelectedItems();
            layout
                    .getChildren()
                    .add(new Label("Selected foods are: " + selectedItems.stream().reduce((s, s2) -> s + " " + s2).get()));
        });

        layout.getChildren().addAll(button, listView);

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
