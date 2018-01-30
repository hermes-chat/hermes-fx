package org.biacode.hermes.fx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Arthur Asatryan.
 * Date: 1/29/18
 * Time: 11:55 PM
 */
public class Person {
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(final String firstName) {
        this.firstName.set(firstName);
    }
}
