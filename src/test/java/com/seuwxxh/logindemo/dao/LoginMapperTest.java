package com.seuwxxh.logindemo.dao;

import com.seuwxxh.logindemo.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LoginMapperTest {
    @Resource
    LoginMapper loginMapper;

    @Test
    void loginTest() {
        User user = new User();
        user.setUserId(999999999);
        user.setUserName("Name");
        user.setUserPassword("Password123456");
        loginMapper.insertUser(user);
        loginMapper.getUserById(999999999);
        loginMapper.updateUserName(999999999, "NewName");
        loginMapper.updatePassword(999999999, "123456Password");
        loginMapper.deleteUser(999999999);
    }
}
