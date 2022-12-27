package com.example.wortest;

public class User {
    private int login;
    private String email;


    public User(int login, String email) {
        this.login = login;
        this.email = email;
    }

    public User(String name_2, String wrongEmail) {
    }

    public User() {

    }

    public int getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkEmail(String email) {
        return false;
    }
}
