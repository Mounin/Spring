package com.lemon.spring2.entity;

public class Book {

    private String user_id;
    private String username;
    private String ustatus;



    public String getUser_id() {
        return user_id;
    }
    public String getUsername() {
        return username;
    }
    public String getUstatus() {

        return ustatus;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
