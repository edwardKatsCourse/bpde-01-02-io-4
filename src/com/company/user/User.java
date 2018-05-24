package com.company.user;

import java.io.Serializable;

//DAO -> database access object
public class /*com.company.user.*/User implements Serializable {

    private static final long serialVersionUID = 1;

    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return String.format("username: %s | password: | %s",
                this.username,
                this.password);
    }
}
