package com.system.manager.passwordmanagersystem;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PasswordEntryModel {
    private String stt;
    private String platform;
    private String url;
    private String username;
    private String password;
    private String note;
    private Boolean importantAccount;

    // Constructor
    public PasswordEntryModel(String stt, String platform, String url, String username, String password, String note, Boolean importantAccount) {
        this.stt = stt;
        this.platform = platform;
        this.url = url;
        this.username = username;
        this.password = password;
        this.note = note;
        this.importantAccount = importantAccount;
    }

    // Getter and Setter methods
    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getImportantAccount() {
        return importantAccount;
    }

    public void setImportantAccount(Boolean importantAccount) {
        this.importantAccount = importantAccount;
    }
}
