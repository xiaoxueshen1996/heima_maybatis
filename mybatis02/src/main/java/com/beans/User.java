package com.beans;

import java.sql.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String mail;
    private Date createTime;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
