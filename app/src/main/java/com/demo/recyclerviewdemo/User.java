package com.demo.recyclerviewdemo;

/**
 * Created by t430 on 9/27/2017.
 */

public class User {
    private String avatar;
    private String name;
    private String status;
    private String mobile;

    public User(String avatar, String name, String status, String mobile) {
        this.avatar = avatar;
        this.name = name;
        this.status = status;
        this.mobile = mobile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
