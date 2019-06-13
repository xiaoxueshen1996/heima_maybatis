package com.dao;

import com.beans.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class Mybatis {
    @Test
    public void test() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> users = userDao.findAll();
        for (User user: users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
    @Test
    public void savaTest() throws Exception{
        User user = new User();
        user.setUsername("pxs");
        user.setPassword("ae86");
        user.setMail("996229297@qq.com");
        user.setCreateTime(new Date(10));
        user.setAddress("湛江");
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        userDao.savaUser(user);
        List<User> users = userDao.findAll();
        for (User u : users){
            System.out.println(u);
        }
        session.close();
        in.close();
    }
}
