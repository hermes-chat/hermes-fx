package org.biacode.hermes.fx.model;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 10:09 PM
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    public Product(final String name, final double price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        final Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (quantity != product.quantity) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
}
