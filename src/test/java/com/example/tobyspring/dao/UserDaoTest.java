package com.example.tobyspring.dao;

import com.example.tobyspring.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User();
                user.setId("0");
                user.setName("parkchwl");
                user.setPassword("1234");

                userDao.add(user);
    }
}