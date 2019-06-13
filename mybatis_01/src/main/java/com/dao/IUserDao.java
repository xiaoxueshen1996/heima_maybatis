package com.dao;

import com.pxs.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
