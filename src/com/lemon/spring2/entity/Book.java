package com.lemon.spring2.entity;

public class Book {

    private int userid;
    private String username;
    private String ustatus;

    public int getUserid() {
        return userid;
    }
    public String getUsername() {
        return username;
    }
    public String getUstatus() {

        return ustatus;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
