package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.biacode.hermes.fx.model.Product;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 9:22 PM
 */
public class TableViewApp extends Application {
    private Stage stage;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("HermesChat");

        final VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        final TableView<Product> tableView = new TableView<>();
        final TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        final TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(200);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        final TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Name");
        quantityColumn.setMinWidth(200);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        tableView.setItems(buildProducts());
        tableView.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        final TextField nameField = new TextField();
        nameField.setPromptText("Name");
        nameField.setMinWidth(100);
        final TextField priceField = new TextField();
        priceField.setPromptText("Price");
        priceField.setMinWidth(100);
        final TextField quantityField = new TextField();
        quantityField.setPromptText("Quantity");
        quantityField.setMinWidth(100);

        final Button addButton = new Button("Add");
        addButton.setMinWidth(100);
        addButton.setOnAction(event -> {
            System.out.println("Add button clicked");
            final Product product = new Product(
                    nameField.getText(),
                    Double.parseDouble(priceField.getText()),
                    Integer.parseInt(quantityField.getText())
            );
            tableView.getItems().add(product);
            nameField.clear();
            priceField.clear();
            quantityField.clear();
        });

        final Button deleteButton = new Button("Delete");
        deleteButton.setMinWidth(100);
        deleteButton.setOnAction(event -> {
            System.out.println("Remove button clicked");
            final ObservableList<Product> allProducts = tableView.getItems();
            final ObservableList<Product> selectedItems = tableView.getSelectionModel().getSelectedItems();
            allProducts.removeAll(selectedItems);
        });

        final HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(20));
        hBox.getChildren().addAll(nameField, priceField, quantityField, addButton, deleteButton);

        layout.getChildren().addAll(tableView, hBox);

        final Scene scene = new Scene(layout, 660, 400);
        stage.setScene(scene);
        stage.show();
    }

    public ObservableList<Product> buildProducts() {
        final ObservableList<Product> products = FXCollections.observableArrayList();
        products.addAll(
                new Product("Laptops", 500, 13),
                new Product(),
                new Product("Foos", 312, 2),
                new Product("Boos", 14, 6),
                new Product(),
                new Product(),
                new Product("Baz", 11, 4)
        );
        return products;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
