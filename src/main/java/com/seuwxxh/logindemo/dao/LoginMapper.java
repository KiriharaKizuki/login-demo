package com.seuwxxh.logindemo.dao;

import com.seuwxxh.logindemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author luowb
 * @description 实现密码与数据库中的密码进行比对、向数据库中插入数据、更新数据的功能
**/

@Mapper
@Repository
public interface LoginMapper {
    Integer insertUser(User user);
    User getUserById(Integer id);
    Integer updateUserName(@Param("userId")Integer userId,@Param("userName")String userName);
    Integer updatePassword(@Param("userId")Integer userId,@Param("userPassword")String userPassword);
    Integer deleteUser(Integer userId);
}
