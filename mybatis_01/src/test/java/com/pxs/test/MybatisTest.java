package com.pxs.test;

import com.dao.IUserDao;
import com.pxs.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class MybatisTest {

    /*
     *入门案例
     * @param args
     */
    public static void main(String[] args) throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session =factory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> users = userDao.findAll();
        for(User user: users){
            System.out.println(user);
        }

        session.close();
        in.close();
    }


    @Test
    public void savaTest() throws Exception{
        User user = new User();
        user.setUsername("px");
        user.setPassword("ae86");
        user.setMail("996229297@qq.com");
        user.setCreatetime(new Date(10));
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
