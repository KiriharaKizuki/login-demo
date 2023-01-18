package com.seuwxxh.logindemo.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginServiceTest {
    @Resource
    LoginService loginService;

    @Test
    void serviceTest() {
        loginService.signup(123332, "88965665", "Name");
        loginService.login(123332, "88965665");
        loginService.updateUserName(123332, "newName");
        loginService.updateUserPassword(123332, "newPassword");
        loginService.deleteUser(123332);
    }
}
