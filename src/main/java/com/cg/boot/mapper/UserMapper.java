package com.cg.boot.mapper;

import com.cg.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> loginUser(@Param("logName") String logName,@Param("logPassword") String logPassword);

}
