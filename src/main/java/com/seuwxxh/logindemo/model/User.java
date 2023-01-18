package com.seuwxxh.logindemo.model;

/**
 * @author Kiriharakizuki
**/

public class User {
    private int userType;
    private Integer userId;
    private String userName;
    private String userPassword;

    public User() {
    }

    public User(int userType, Integer userId, String userName, String userPassword) {
        this.userType = userType;
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}