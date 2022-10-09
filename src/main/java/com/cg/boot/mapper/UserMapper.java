package com.cg.boot.mapper;

import com.cg.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录账号判断
    List<User> loginUser(@Param("logName") String logName,@Param("logPassword") String logPassword);

}
