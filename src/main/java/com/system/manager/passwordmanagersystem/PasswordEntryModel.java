package com.system.manager.passwordmanagersystem;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PasswordEntryModel {
    private String stt;
    private String account;
    private String user;
    private String password;

    // Constructor
    public PasswordEntryModel (String stt, String account, String user, String password) {
        this.stt = stt;
        this.account = account;
        this.user = user;
        this.password = password;
    }

    public StringProperty sttProperty() {
        return new SimpleStringProperty(stt);
    }

    public StringProperty accountProperty() {
        return new SimpleStringProperty(account);
    }

    public StringProperty userProperty() {
        return new SimpleStringProperty(user);
    }

    public StringProperty passwordProperty() {
        return new SimpleStringProperty(password);
    }
}
