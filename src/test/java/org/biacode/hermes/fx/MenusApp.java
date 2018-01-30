package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 10:36 PM
 */
public class MenusApp extends Application {
    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final BorderPane layout = new BorderPane();

        final MenuItem newMenuItem = new MenuItem("New");
        newMenuItem.setOnAction(event -> {
            System.out.println("new menu item clicked");
        });
        final MenuItem exitMenuItem = new MenuItem("New");
        exitMenuItem.setOnAction(event -> {
            System.out.println("exit menu item clicked");
            stage.close();
        });

        final Menu editMenuItem = new Menu("_Edit");
        final MenuItem pasteMenuItem = new MenuItem("Paste");
        pasteMenuItem.setDisable(true);
        editMenuItem.getItems().addAll(
                new MenuItem("Cut"),
                new MenuItem("Copy"),
                pasteMenuItem
        );

        final Menu viewMenu = new Menu("_View");
        viewMenu.getItems().addAll(
                new CheckMenuItem("Auto Save"),
                new CheckMenuItem("Toolbar"),
                new RadioMenuItem("Radio is here")
        );

        final Menu fileMenu = new Menu("File");
        fileMenu.getItems().addAll(
                newMenuItem,
                new MenuItem("Open"),
                editMenuItem,
                new SeparatorMenuItem(),
                new MenuItem("Save"),
                new MenuItem("Settings"),
                new SeparatorMenuItem(),
                exitMenuItem
        );

        final Menu difficultyMenu = new Menu("Difficulty");
        final ToggleGroup toggleGroup = new ToggleGroup();
        final RadioMenuItem easyRadioMenuItem = new RadioMenuItem("Easy");
        final RadioMenuItem mediumRadioMenuItem = new RadioMenuItem("Medium");
        final RadioMenuItem hardRadioMenuItem = new RadioMenuItem("Hard");
        easyRadioMenuItem.setToggleGroup(toggleGroup);
        mediumRadioMenuItem.setToggleGroup(toggleGroup);
        hardRadioMenuItem.setToggleGroup(toggleGroup);
        difficultyMenu.getItems().addAll(easyRadioMenuItem, mediumRadioMenuItem, hardRadioMenuItem);

        final MenuBar menuBar = new MenuBar(fileMenu, editMenuItem, viewMenu, difficultyMenu);

        layout.setTop(menuBar);

        final Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}