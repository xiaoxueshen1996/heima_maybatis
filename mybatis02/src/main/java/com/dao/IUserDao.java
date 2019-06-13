package com.dao;

import com.beans.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
    void savaUser(User user);
}
