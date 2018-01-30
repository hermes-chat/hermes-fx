package org.biacode.hermes.fx.util;

import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Arthur Asatryan.
 * Date: 1/31/18
 * Time: 2:16 AM
 */
public class Globals {

    private static AtomicReference<Stage> primaryStage = new AtomicReference<>();

    private Globals() {
    }

    public static Stage getPrimaryStage() {
        return primaryStage.get();
    }

    public static void setPrimaryStage(final Stage primaryStage) {
        Globals.primaryStage.set(primaryStage);
    }
}
