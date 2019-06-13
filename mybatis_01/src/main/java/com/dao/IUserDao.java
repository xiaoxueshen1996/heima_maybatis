package com.dao;

import com.pxs.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();

    @Insert(" insert into user(username,password,mail,createtime,address)values (#{username},#{password},#{mail},#{createtime},#{address})")
    void savaUser(User user);

}
