package com.seuwxxh.logindemo.service;

import com.seuwxxh.logindemo.dao.LoginMapper;
import com.seuwxxh.logindemo.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;

/**
 * @author KiriharaKizuki
 */

public class LoginServiceImpl implements LoginService {
    private User user;
    private LoginMapper loginMapper;

    @Override
    public boolean signup(Integer userId, String userPassword, String userName) {
        if (userCheck(userId, userPassword, userName)) {
            return false;
        }
        loginMapper.insertUser(user);
        return true;
    }

    @Override
    public boolean login(Integer userId, String userPassword) {
        return userCheck(userId, userPassword, null);
    }

    @Override
    public Integer updateUserPassword(Integer userId, String userPassword) {
        if(!userCheck(userId, userPassword, null)) {
            return -1;
        }
        return loginMapper.updatePassword(userId, userPassword);
    }

    @Override
    public Integer updateUserName(Integer userId, String userName) {
        if(!userCheck(userId, null, userName)) {
            return -1;
        }
        return loginMapper.updateUserName(userId, userName);
    }

    @Override
    public Integer deleteUser(Integer userId) {
        if(!userCheck(userId, null, null)) {
            return -1;
        }
        return loginMapper.deleteUser(userId);
    }

    public boolean userCheck(Integer userId, String userPassword, String userName) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String finalPassword = encoder.encode(userPassword);
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        final User userById = loginMapper.getUserById(user.getUserId());
        return Objects.equals(user.getUserPassword(), userById.getUserPassword());
    }
}