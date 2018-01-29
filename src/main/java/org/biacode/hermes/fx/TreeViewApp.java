package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 8:54 PM
 */
public class TreeViewApp extends Application {
    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        final TreeItem<String> root = new TreeItem<>();
        root.setExpanded(true);

        final TreeItem<String> names = makeBranch("Names", root);
        final TreeItem<String> hobbies = makeBranch("Hobbies", root);
        makeBranch("Arthur", names);
        makeBranch("Anna", names);
        makeBranch("Arsen", names);

        makeBranch("Travelling", hobbies);
        makeBranch("Reading books", hobbies);

        final TreeView<String> treeView = new TreeView<>();
        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        final Button button = new Button("Click me!!!");

        layout.getChildren().addAll(button, treeView);

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    private <T> TreeItem<T> makeBranch(final T item, final TreeItem<T> root) {
        final TreeItem<T> treeItem = new TreeItem<>(item);
        treeItem.setExpanded(true);
        root.getChildren().add(treeItem);
        return treeItem;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
