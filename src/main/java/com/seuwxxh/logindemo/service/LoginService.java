package com.seuwxxh.logindemo.service;

import org.springframework.stereotype.Repository;

/**
 * @author Kiriharakizuki
 * @description  实现登录相关的逻辑，将数据传递给dao层
 **/

@Repository
public interface LoginService {
    boolean signup(Integer userId, String userPassword, String userName);
    boolean login(Integer userId, String userPassword);
    Integer updateUserPassword(Integer userId, String userPassword);
    Integer updateUserName(Integer userId, String userName);
    Integer deleteUser(Integer userId);
    }
